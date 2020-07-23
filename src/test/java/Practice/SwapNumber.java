package Practice;

public class SwapNumber {
    public static void main(String[] args) {

        int a =123;
        int b =456;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Yol 1  a= "+a +" -- b-->"+b);
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Yol 2  a= "+a +" -- b-->"+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println("Yol 3  a= "+a +" -- b-->"+b);

    }
}
