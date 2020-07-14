package HackerRank;

import java.util.Scanner;

public class InttoString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        in.close();
        //String s=???; Complete this line below

        //Write your code here
        if(n>= (-100) && n<=100){
            String s = String.valueOf(n);
            s = new StringBuilder(s).reverse().toString();
                System.out.println("Good job");
            }else{
            System.out.println("Wrong answer");}
        }
    }

