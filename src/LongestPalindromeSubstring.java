
public class LongestPalindromeSubstring {
public String longestPalindrome(String s) {
	if(s.length() == 0)
		return "";
	if(s.length() ==1)
		return s;
	int start = 0, end = 0;
	for(int i=0;i<s.length();i++) {
		int len1 = expandAroundCenter(s,i,i);
		int len2 = expandAroundCenter(s,i,i+1);
		int len = Math.max(len1, len2);
		if(len>end-start) {
			start = i-(len-1)/2;
			end = i+len/2;
		}
	}
	return s.substring(start, end+1);    
    }

private int expandAroundCenter(String s, int left, int right) {
	// TODO Auto-generated method stub
	int i = left, j= right;
	while(i>=0 && j <s.length() && s.charAt(i)==s.charAt(j))
	{
		i--;
		j++;
	}
	return j-i-1;
}
}
