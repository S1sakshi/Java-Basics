import java.util.*;
public class importantPattern_3 {
    
    public static void print_Pattern(int n){
		
		int a = (n+1)/2;
		for(int i=1; i<=a; i++) {
			
			for(int j=i; j<a; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int b = n-a;
		for(int i=1; i<=b; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*(b-i)+1; j++) {
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
