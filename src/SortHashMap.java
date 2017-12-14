import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortHashMap {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      HashMap<String, Integer> unsort  =new HashMap<String, Integer>();
      unsort.put("six", 6);
      unsort.put("three", 3);
      unsort.put("five", 5);
      unsort.put("two", 2);
      unsort.put("four", 4);
      unsort.put("one", 1);
      System.out.println("Before Sorting");
     for(Entry<String, Integer> entry:unsort.entrySet())
      {
         System.out.println(entry.getKey()+"\t"+entry.getValue());
      }
     TreeMap<String, Integer> sortMap = new TreeMap<>();
     sortMap.putAll(unsort);
       /*ArrayList<Entry<String, Integer>> list = new ArrayList<>(unsort.entrySet());
      Collections.sort(list,new Comparator<Entry<String, Integer>>() {
         public int compare(Entry<String,Integer> o1,Entry<String,Integer> o2) {
            return o1.getValue().compareTo(o2.getValue());
         }
      });
      LinkedHashMap<String, Integer> sortMap = new LinkedHashMap<>();
      for(Entry<String, Integer> entry:list)
         sortMap.put(entry.getKey(), entry.getValue());*/
      System.out.println("After Sorting");
      for(Entry<String, Integer> entry:sortMap.entrySet())
      {
         System.out.println(entry.getKey()+"\t"+entry.getValue());
      }
   }

}
