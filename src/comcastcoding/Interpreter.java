package comcastcoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Interpreter {

   
   public static String replace( String old, String exp, String replacement ){
      // replace all existing expression
      // if expression not found it will just return original statement
      String tmp = old;
      while( tmp.contains(exp) ){
         int start = tmp.indexOf(exp);
         tmp = tmp.substring(0, start) + replacement + tmp.substring(start + exp.length());
      }
      return tmp;
   }
   
   
   public static String doOperation( ArrayList<String> list, String command, ArrayList<String> parameters ){
      
      if( command.equals("replace") ){
         for( int i = 0; i < list.size(); i++ ){
            String current = list.get(i);
            if( current.contains(parameters.get(1))){
               list.remove(i);
               list.add(i, replace( current, parameters.get(1), parameters.get(2) ) );
            }
         }
      }
      if( command.equals("swap") ){
         int one = Integer.valueOf(parameters.get(1)) - 1;
         int two = Integer.valueOf(parameters.get(2)) - 1;
         
         if( one > list.size() - 1 || one < 0 || two > list.size() - 1 || two < 0 ){
            System.err.println("Invalid swap index");
            return "Invalid swap index" + System.lineSeparator();
         }
         
         String tmp = list.get(one);
         list.remove(one);
         list.add(one, list.get(two));
         list.remove(two);
         list.add(two, tmp);
      }
      if( command.equals("uppercase") ){
         //assume parameters are 'last', 'first'
         HashMap<String, Integer> position = new HashMap<String, Integer>();
         position.put("last", list.size() - 1);
         position.put("first", 0);
         position.put("middle", list.size() / 2);
         int pos = position.get(parameters.get(1));
         String tmp = list.get(pos);
         list.remove(pos);
         list.add(pos, tmp.toUpperCase());
         
      }
      if( command.equals("reverse") ){
         ArrayList<String> tmplist = new ArrayList<String>();
         
         for( int i = list.size() - 1; i >= 0; i-- ){
            tmplist.add(list.get(i));
         }
         list = tmplist;
         
         
      }
      // any other command it will just return the original sentence
      StringBuilder res = new StringBuilder();
      for( String item : list ){
         res.append(item);
         res.append(" ");
      }
      return res.toString();
         
      
   }
   
   public static String split( String input ){
      StringTokenizer itr = new StringTokenizer(input);
      ArrayList<String> list = new ArrayList<String>();
      ArrayList<String> parameters = new ArrayList<String>();
      String command = "";
      while( itr.hasMoreTokens() ){
         String temp = itr.nextToken();
         if( temp.startsWith("#") ){
            command = temp.substring(1);
            
         }
            
         if( command.length() == 0 )
            list.add(temp);
         else {
            parameters.add(temp);
         }
         
      }
      if( command.length() == 0 ){
         return "No command found" + System.lineSeparator();
         //return;
      }
      else {
         String res = doOperation( list, command, parameters  );
         return res + System.lineSeparator();
      }
      
   }
   
   public static void main( String[] args ){
      //I was debugging using my desktop file
      String fileName = "C://Users//Diwen//Desktop//input.txt";
      String outputfile = "C://Users//Diwen//Desktop//output.txt";
      
      List<String> list = new ArrayList<>();
      try {
         BufferedReader br = Files.newBufferedReader(Paths.get(fileName));
         list = br.lines().collect(Collectors.toList());

      } catch (IOException e) {
         e.printStackTrace();
      } 
      
      BufferedWriter bw = null;
      FileWriter fw = null;

      try {

         fw = new FileWriter(outputfile);
         bw = new BufferedWriter(fw);
         for( String line : list ){
            String content = split(line);
            bw.write(content);
      
         }
         System.out.println("Done");

      } catch (IOException e) {

         e.printStackTrace();

      } finally {

         try {

            if (bw != null)
               bw.close();

            if (fw != null)
               fw.close();

         } catch (IOException ex) {

            ex.printStackTrace();

         }

      }
      
       
   }
}
