import java.util.*;

public class importantPattern_1 {
    
    public static void print_Pattern(int n){
		
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+j-1);
			}
			for(int j=i-1; j>0; j--) {
				System.out.print(2*i-j-1);
			}
			System.out.println();
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print_Pattern(n);
	}
}
