import java.util.*;

public class gcd {
    
    public static int gcd(int n, int m) {
		
		while(n>0 && m>0) {
			
			if(n>m) {
				n = n%m;
			}
			else {
				m = m%n;
			}
		}
		if(n==0) {
			return m;
		}
		else if(m==0) {
			return n;
		}
		else {
			return -1;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int g = gcd(n, m);
		System.out.print(g);
	}
}
