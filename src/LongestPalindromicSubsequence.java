
public class LongestPalindromicSubsequence {
	
	public void LPS(String str) {
		int[][] temp = new int[str.length()][str.length()];
		for(int i=0;i<temp.length;i++){
			temp[i][i] = 1;
		}
		for(int len=2;len<=temp.length;len++) {
			for(int i=0;i<temp.length-len+1;i++) {
				int j=  i+len-1;
				if(len == 2 && str.charAt(i) == str.charAt(j))
					temp[i][j]=2;
				else if(str.charAt(i)==str.charAt(j))
					temp[i][j] = temp[i+1][j-1]+2;
					else {
						temp[i][j] = temp[i][j-1]>temp[i+1][j]?temp[i][j-1]:temp[i+1][j];
					}
					
			}
		}
		System.out.println(temp[0][temp.length-1]);
	}
	public static void main(String args[]) {
		LongestPalindromicSubsequence l = new LongestPalindromicSubsequence();
		l.LPS("GEEKSFORGEEKS");
	}

}
