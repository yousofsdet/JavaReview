package RebootCamp;

public class Reverse {
    public static void main(String[] args) {
        String str = "AlibabaninKolu";

//        way 1
        StringBuilder reversed1= new StringBuilder(str).reverse();
        System.out.println(reversed1);

//        way 2
        String reversed2 ="";
        for(int i = str.length()-1; i>=0; i--){
            reversed2 += str.charAt(i)+"";
        }
        System.out.println(reversed2);

    }
}
