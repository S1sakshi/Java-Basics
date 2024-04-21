import java.util.*;

public class checkPalindrome {
    
    public static int reverse(int n) {
		
		int rev = 0;
		while(n>0) {
			int lastDigit = n%10;
			rev = rev*10 + lastDigit;
			n=n/10;
		}
		return rev;
	}
	public static boolean palindrome(int n) {
		
		int r = reverse(n);
		if(r==n) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean b = palindrome(n);
		System.out.println(b);
	}
}
