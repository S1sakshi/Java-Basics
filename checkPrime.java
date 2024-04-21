import java.util.*;

public class checkPrime{
    
    public static boolean prime(int n) {
		
		if(n<2) {
			return false;
		}
		else if(n==2) {
			return true;
		}
		else {
			for(int i=2; i<=Math.sqrt(n); i++) {
				if(n%i==0) {
					return false;		
				}
			}
			return true;
		}
	}
    public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean p = prime(n);
		System.out.println(p);
	}
}