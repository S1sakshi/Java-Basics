import java.util.*;

public class squareRoot {
    
    public static void sqrt(int n) {
		int squareRoot = 0;
		
		for(int i=1; i<=n; i++) {
			if(i*i<=n) {
				squareRoot = i;
			}
		}
		System.out.println(squareRoot);
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sqrt(n);
	}
}
