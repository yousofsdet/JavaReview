package Practice;

public class SwapNumber {
    public static void main(String[] args) {
//       way=1  with third integer
        int a = 123;
        int b = 567;
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(" a ==>"+a +" b==>"+b);

//       way=2  with no third integer (+--) yada (*//)
        a= a*b;
        b= a/b;
        a= a/b;

        System.out.println("a="+a+" b="+b);


    }
}
