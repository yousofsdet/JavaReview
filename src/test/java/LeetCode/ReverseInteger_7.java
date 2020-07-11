package LeetCode;

public class ReverseInteger_7 {

    public static void main(String[] args) {

        System.out.println( reverseInt(120) );
        int num=1234;
        int rev=0;
        while(num!=0){
            rev = rev*10 + num%10;
            num /=10;
        }
        System.out.println(rev);

//        solution 2  with StringBuilder reverse();
//        int mama = 3456;
//        String cevir = String.valueOf(mama);
//        System.out.println(cevir);
//        String sonuc = new StringBuilder(cevir).reverse().toString();
//        System.out.println(sonuc);
    }
    public static int reverseInt(int input) {
        long reversedNum = 0;
        long input_long = input;

        while (input_long != 0) {
            reversedNum = reversedNum * 10 + input_long % 10; //1 -> 22
            input_long = input_long / 10; // 12->13
        }

        if (reversedNum > Integer.MAX_VALUE || reversedNum < Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        return (int) reversedNum;
    }
}
