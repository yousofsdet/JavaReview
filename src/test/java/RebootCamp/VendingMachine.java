package RebootCamp;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

        Scanner giveme = new Scanner(System.in);
        System.out.println("Enter a valid number between 1 - 99 and I will find the change");

        int money = 0;
        money = giveme.nextInt();
        System.out.println("you have "+ money);

        if(money >0 & money<100){
            int quarter , dime, nickel, penny;

            quarter = money/25;
            money = money % 25;

            dime = money/10;
            money = money % 10;

            nickel = money / 5;
            money = money % 5;
            penny = money;

            System.out.println("and your money has ");
            System.out.println(quarter + " quarter" );
            System.out.println( dime+ " dime ");
            System.out.println( nickel+ " nickel ");
            System.out.println(penny + " penny");

        } else{
            System.out.println("invalid number!! you need to enter new number between 1 - 100");
            money = giveme.nextInt();

        }
        giveme.close();
    }
}