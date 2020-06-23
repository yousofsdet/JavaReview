package RebootCamp;

public class Count_Letters {

    public static void main(String[] args) {
        String str = "anababa";

        String many ="";
        for (int i = 0; i < str.length(); i++) {

            if (many.contains(str.charAt(i)+""))  continue;

            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
            }
            many += " " + str.charAt(i) +"-->"+count;

        }
        System.out.println(many);
    }
}
