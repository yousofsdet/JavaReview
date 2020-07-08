package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class OcaTest {

//If the word ends in "y", print "-ies"
//If the word ends in "ey", print "-eys"
//If the word ends in "ife", print "-ives"
//If none of the above is true, print "-s"
//No more than one should be printed.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Number:");
        int num = scan.nextInt();

//        for (int i = 0; i < num.le ; i++) {
//
//        }




//        for(int i =11 ; i<=121; i+=2){
//            System.out.println(i);
//        }

        String [] str = new String[] {"abcd"};
        int leng = str.length * str.length;
        String [] arr = new String[leng];

        for (int i = 0; i < str.length; i++) {
               arr[i] += arr[i+1];
            }

        System.out.println(Arrays.toString(arr));


        String a = "a";
         a += 2;
         a += 'c';
         a += false;
         if ( a == "2cfalse") System.out.println("==");
         if ( a.equals("a2cfalse")) System.out.println("equals");
    }
}
