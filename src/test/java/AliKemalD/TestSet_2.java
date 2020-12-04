package AliKemalD;

public class TestSet_2 {

    public static void main(String[] args) {
//        System.out.println(  isPalindrome( new String("Akk"))  );
        int a=11, b=3;
//        remainder ( a,b);
        System.out.println(  isPrime( a ) );

    }

    public static void missingNumber(int [] nums){

    }

    public static boolean isPrime(int a){

        if (a <= 1 ) return false;
        if (a == 2) return true;

        for (int i=2; i< a; i++){
            if (a%i == 0) return false;
        }

        return true;
    }
    public static void remainder(int a, int b){

        int remainder = a-b * (a/b);

        System.out.println( remainder  );
    }
    public static boolean isPalindrome(String str){

        String btr="";
//     String Builder way
        String ddr = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase( ddr)) return true;

//        Forloop charAt() way
//        for (int i=str.length()-1; i>=0; i--){
//            btr += str.charAt(i)+"";
//        }
//        if (str.equalsIgnoreCase( btr)) return true;

        return false;
    }
}
