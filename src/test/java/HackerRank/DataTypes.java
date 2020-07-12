package HackerRank;

import java.util.Scanner;

public class DataTypes {

//            A byte is an 8-bit signed integer.
//            A short is a 16-bit signed integer.
//            An int is a 32-bit signed integer.
//            A long is a 64-bit signed integer.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println("* byte");
                    //Complete the code
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println("* Short");
                if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE ) System.out.println("* Integer");
                if(x >= Long.MIN_VALUE && x <= Long.MIN_VALUE) System.out.println("* Long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
