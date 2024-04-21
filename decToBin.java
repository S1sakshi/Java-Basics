import java.util.*;

public class decToBin {
    
    public static void decToBin(int n) {
		
		int bin = 0;
		int pow = 0;
		
		while(n>0) {
			int rem = n%2;
			bin = (int)(bin +rem*(Math.pow(10,  pow)));
			pow++;
			n=n/2;
		}
		System.out.println(bin);
	}
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		decToBin(n);
	}
}
