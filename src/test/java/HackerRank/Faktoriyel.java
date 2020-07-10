package HackerRank;
import java.util.Scanner;

public class Faktoriyel {

    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int k =0; k<n; k++){
                a+=b;
                if(n>k)
                    System.out.print(" ");
                System.out.print(a);
                b= b*2;
            }
            System.out.print("");
        }
        in.close();
    }
}
