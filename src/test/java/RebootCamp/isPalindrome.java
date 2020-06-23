package RebootCamp;

public class isPalindrome {

    public static void main(String[] args) {
        String str = "PalaP";
//  approach 1
        String reverse = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reverse)) System.out.println("it's palindrome");
        else System.out.println("it's NOT");
//approach 2
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(0+i) != str.charAt(4-i)) result = false;
        }
        System.out.println(result);
        if(result == true) System.out.println("PALINDROME");
        else System.out.println("NOT");

    }
}
