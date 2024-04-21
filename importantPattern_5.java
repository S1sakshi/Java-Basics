import java.util.*;

public class importantPattern_5 {
    
    public static void pattern(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*n-2*i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		pattern(n);
//		System.out.print(r);
	}
}
