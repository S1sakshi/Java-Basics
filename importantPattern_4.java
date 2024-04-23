import java.util.*;
public class importantPattern_4 {
    
    public static void print_Pattern(int n) {
		
		for(int i=1; i<=n; i++){

            for(int j=1; j<=i; j++){
                System.out.print((char)(64+n+j-i));
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
