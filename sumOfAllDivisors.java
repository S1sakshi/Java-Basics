import java.util.*;

public class sumOfAllDivisors {
    
    public static int divisorSum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					sum = sum+j;
				}
			}
		}
		return sum;
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int b = divisorSum(n);
		System.out.println(b);
	}
}
