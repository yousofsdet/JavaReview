package HackerRank;

import java.util.Scanner;

public class FibonacciRecursion {
    public static int fibonacci(int n) {


        int a=0;
        int b=1;
        int result=0;
        if(n>0 || n<=30) {
            while(n>1){
                result= a+b;
                a=b;
                b=result;
                n--;
            }
            return result;
        }else {
            return n;
        }

        // Complete the function.
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fibonacci(n));

    }
}
