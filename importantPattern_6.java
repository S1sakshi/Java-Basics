import java.util.*;

public class importantPattern_6 {
    
    public static void print(int arr[][], int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void pattern(int n){

        int size = (2*n-1);
        int arr[][] = new int[size][size];

        int front = 0;
        int back = size-1;

        while(n>0){
            for(int i=front; i<=back; i++){
                for(int j=front; j<=back; j++){
    
                    if(i==front || i==back || j==front || j==back){
                        arr[i][j] = n;
                    }
                }
            }
            front++;
            back--;
            n--;
        }
        print(arr, size);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pattern(n);
    }
}
