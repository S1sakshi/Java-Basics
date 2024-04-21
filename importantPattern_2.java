import java.util.*;

public class importantPattern_2 {
    
    public static void print_Pattern(int n) {

		for(int i=1; i<=n; i++) {
			
			for(int j=n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			
			for(int j=i-1; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*(n-i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print_Pattern(n);
	}
}
