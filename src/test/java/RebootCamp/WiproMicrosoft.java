package RebootCamp;

public class WiproMicrosoft {

    public static void main(String[] args) {
        String str = "wipro microsoft";

        String newstr = "";
        for (int i = 0; i < 5 ; i++) {
            newstr += ""+ str.charAt(0+i) + str.charAt(6+i);
        }
        newstr += str.charAt(11);

        System.out.println(newstr);
    }

}
