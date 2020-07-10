package Practice;

public class HarfleriSay {

    public static void main(String[] args) {
        String str = "ansalkoplkikikolpolk";
        String repeted = "";
        int counter =0;

        for (int i = 0; i < str.length(); i++) {

            if (repeted.contains(str.charAt(i)+"")) continue;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) counter ++;
            }
            repeted += str.charAt(i)+":"+counter;
        }
        System.out.println(repeted);


    }
}
