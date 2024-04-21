import java.util.*;

public class printPrimeBetween_1ToN {
    
    public static void printPrime(int n) {
		
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j<i; j++) {
				
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printPrime(n);
	}
}
