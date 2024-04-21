import java.util.*;

public class armstrongNumber {
    
    public static int numberOfDigits(int n) {
		
		int count = 0;
		while(n>0) {
			int lastDigit = n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	public static boolean armstrong(int n) {
		
		int c = numberOfDigits(n);
		
		int sum = 0;
		int temp = n;
		
		while(n>0) {
			int lastDigit = n%10;
			sum = (int)(sum+Math.pow(lastDigit, c));
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean b = armstrong(n);
		System.out.println(b);
	}
}
