package HackerRank;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       int strNum = 1;
        System.out.println("Enter a string ");
       while (scan.hasNext()){
           System.out.println(strNum+" "+ scan.nextLine());
           strNum++;
       }
    }
}
