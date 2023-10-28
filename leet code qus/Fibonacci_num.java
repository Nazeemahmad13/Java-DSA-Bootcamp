import java.util.Scanner;

public class Fibonacci_num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int [num + 2]  ;
        System.out.println(fib(num,arr));
    }


    public static int fib(int n, int [] arr) {
        if(n==1) return 0;
        if(n==2) return 1;
        arr[0]=0; arr[1]=1;
        if(arr[n]!=-1) return arr[n];

          arr[n]= fib(n-1,arr)+fib(n-2 ,arr);
        return arr[n];
    }
}
