import java.util.*;

public class binToDec {
    
    public static void binToDec(int n) {
		
		int dec = 0;
		int pow = 0;
		while(n>0) {
			int lastDigit = n%10;
			dec = (int)(dec + lastDigit*(Math.pow(2,  pow)));
			pow++;
			n=n/10;
		}
		System.out.println(dec);
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		binToDec(n);
	}
}
