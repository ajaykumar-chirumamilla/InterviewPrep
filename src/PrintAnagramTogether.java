import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PrintAnagramTogether {

    public void print(String[] string){
        Map<String,List<String>> invertedIndex = new HashMap<String,List<String>>();
        for(String str : string){
            char [] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newString = new String(charArray);
            if(invertedIndex.containsKey(newString)){
                List<String> pos = invertedIndex.get(newString);
                pos.add(str);
            }else{
                List<String> pos = new ArrayList<String>();
                pos.add(str);
                invertedIndex.put(newString, pos);
            }
        }
        for(List<String> result  : invertedIndex.values()){
           
                System.out.println(result);
        }
    }
    
    public static void main(String args[]){
        String str[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        PrintAnagramTogether pat = new PrintAnagramTogether();
        pat.print(str);
    }
    
}