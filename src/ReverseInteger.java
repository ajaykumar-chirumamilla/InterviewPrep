
public class ReverseInteger {
	public int reverse(int x) {
		 long res = 0;
	     boolean isNeg = false;
		if(x<0) {
			isNeg = true;
			x = x * -1;
	    }
		while(x>0) {
			int rem = x %10;
			res = res*10 + rem;
			x = x /10;
		}
		if(isNeg)
		res = res*-1;
		if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
			return 0;
		return (int)res;
	    }
public static void main(String args[]) {
	ReverseInteger r = new ReverseInteger();
	System.out.println(r.reverse(1234567899));
}
}
