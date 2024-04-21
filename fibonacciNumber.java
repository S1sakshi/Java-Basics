import java.util.*;

public class fibonacciNumber {
    
    public static boolean fib(int n) {
		
		int a = 0;
		int b = 1;
		
		for(int i=2; i<n; i++) {
			if(b==n) {
				return true;
			}
			int c = a+b;
			a = b;
			b = c;
		}
		return false;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean b = fib(n);
		System.out.println(b);
	}
}
