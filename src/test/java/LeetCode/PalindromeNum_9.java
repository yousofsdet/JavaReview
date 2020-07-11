package LeetCode;

public class PalindromeNum_9 {
    public static void main(String[] args) {
        System.out.println(isPln( 12321));
    }

    public static boolean isPln(int num){

        String cevir = String.valueOf(num);
        return cevir.equals(new StringBuilder(cevir).reverse().toString());

    }
}
