package Practice;

public class CheckVowel {
    public static void main(String[] args) {
        String str ="alibabno";
        System.out.println(isVowel(str));
    }
    public static boolean isVowel(String str){

        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
