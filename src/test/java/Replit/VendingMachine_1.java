package Replit;

import java.util.Scanner;

public class VendingMachine_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int decimal = input.nextInt();
        int[] binary = new int[8];

        //TODO: Write your code below.
         String dec = Integer.toBinaryString(decimal);

         	System.out.println(dec);

        // for(int i-0; i< 8; i++){
        //   binary[i] = Integer.toBinaryString(decimal)
        // }
        // 	System.out.println(Integer.toBinaryString(decimal));
// =        System.out.println(Integer.toBinaryString(decimal));
// =        System.out.println(Integer.toBinaryString(decimal));


    }
}
