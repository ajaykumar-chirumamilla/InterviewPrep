
public class LongestCommonSubSequence {
	
	public int lcs(String str1,String str2) {
		int[][] temp = new int[str1.length()+1][str2.length()+1];
		for(int i=0;i<=str1.length();i++) {
			for(int j=0;j<=str2.length();j++) {
				if(i==0 || j==0)
					temp[i][j]=0;
				else if(str1.charAt(i-1)==str2.charAt(j-1))
					temp[i][j]=temp[i-1][j-1]+1;
				else
					temp[i][j] = temp[i][j-1]>temp[i-1][j]?temp[i][j-1]:temp[i-1][j];
			}
		}
		return temp[str1.length()][str2.length()];
	}
	
	public static void main(String args[]) {
		LongestCommonSubSequence l = new LongestCommonSubSequence();
		String st = "GEEKSFORGEEKS";
		System.out.println(l.lcs(st, "SKEEGROFSKEEG"));
	}
}
