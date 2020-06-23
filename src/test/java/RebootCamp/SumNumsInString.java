package RebootCamp;

import java.util.Arrays;

public class SumNumsInString {

    public static void main(String[] args) {
        String str = "as14ls980asd7d12";
        String nums ="";
        int sum=0;

        for (int i = 0; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i)) ){
                nums += str.charAt(i);
                if (i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(nums);
                    nums = ""; // burada bunu koymak cok sey degistirdi neden?????

                }
            }
        }
        System.out.println(sum);

    }
}
