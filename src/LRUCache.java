/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRUCache {
   static HashMap<Integer, Integer> lruCache;
   static Queue<Integer> recentlyUsedKey;
   static int capacity = 0;
   public LRUCache(int capacity) {
     this.capacity = capacity;
     lruCache = new HashMap<Integer, Integer>(capacity);
     recentlyUsedKey = new Doubl<Integer>(capacity);
   }
   
   public int get(int key) {
       if(lruCache.containsKey(key)) {
          if(recentlyUsedKey.contains(key))
          {
             System.out.println("Hereeeeeee");
             recentlyUsedKey.remove(recentlyUsedKey.indexOf(key));
             recentlyUsedKey.add(key);
          }
            return lruCache.get(key);
       }
       return -1;
   }
   
   public void put(int key, int value) {
      //System.out.println("Size of map:\t"+lruCache.size()+"\tcapacity:\t"+capacity);
       if(lruCache.size() == capacity)
       {
          //System.out.println(recentlyUsedKey.peek());
          lruCache.remove(recentlyUsedKey.get(0));
          lruCache.put(key, value);
          recentlyUsedKey.add(key);
       } else {
          lruCache.put(key, value);
          recentlyUsedKey.add(key);
          //capacity++;
       }   
   }
   
   public void printMap() {
      System.out.println("print map");
      for(Map.Entry<Integer, Integer> entry:lruCache.entrySet()){
         System.out.println(entry.getKey()+"\t"+entry.getValue());
      }
   }

   public static void main(String args[]) {
      LRUCache cache = new LRUCache( 2  capacity  );

      cache.put(1, 1);
     // cache.printMap();
      cache.put(2, 2);
      //cache.printMap();
      System.out.println(cache.recentlyUsedKey);
      System.out.println(cache.get(1));       // returns 1
      System.out.println(cache.recentlyUsedKey);
      //cache.printMap();
      cache.put(3, 3);    // evicts key 2
      System.out.println(cache.recentlyUsedKey);
      //cache.printMap();
      System.out.println(cache.get(2));       // returns -1 (not found)
      System.out.println(cache.recentlyUsedKey);
      //cache.printMap();
      cache.put(4, 4);    // evicts key 1
      cache.printMap();
      System.out.println(cache.get(1));       // returns -1 (not found)
      //cache.printMap();
      System.out.println(cache.get(3));       // returns 3
      //cache.printMap();
      System.out.println(cache.get(4));       // returns 4
      //cache.printMap();
   }
}
*/