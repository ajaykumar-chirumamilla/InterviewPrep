import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {
	 public int lengthOfLongestSubstring(String s) {
		 Set<Character> set = new HashSet<>();
		 int len = 0;
		 int index = 0;
	        for(int i=0;i<s.length();) {
	        
	        	if(set.contains(s.charAt(i)))
	        	{
	        		set.remove(s.charAt(index++));
	        	} else {
	        	set.add(s.charAt(i++));
	        	if(set.size()>len)
	        		len = set.size();
	        	}
	        }
	        	return len;
	    }
	 
	 public int lengthOfLongestSubstring_sol2(String s) {
		 int len = 0;
		 Map<Character, Integer> map = new HashMap<>();
		 for(int i=0,j=0;i<s.length();i++) {
			 if(map.containsKey(s.charAt(i))) {
				 j = Math.max(j, map.get(s.charAt(i))+1);
			 }
			 map.put(s.charAt(i), i);
			 len = Math.max(len, i-j+1);
		 }
	        	return len;
	    }
	 
	 public static void main(String args[]) {
		 LongestSubString l =new LongestSubString();
		 System.out.println(l.lengthOfLongestSubstring_sol2("pwwkew"));
	 }
}

