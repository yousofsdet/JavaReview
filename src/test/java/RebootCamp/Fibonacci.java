package RebootCamp;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci(5);

    }

    public static int Fibonacci(int num) {

        int a = 0;
        int b = 1;
//        System.out.print(a + " " + b);
        int next=0;
        for(int i=2; i < num; i++) {

             next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);
        }
        return next;
    }
}
