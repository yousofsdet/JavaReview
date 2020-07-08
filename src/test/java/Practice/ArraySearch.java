package Practice;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {
        String a = "as5afkj78ks9p7";
        String [] arr = a.split("");
        System.out.println(Arrays.toString(arr));

        String po ="";
        for (int i = 0; i < arr.length; i++) {

           if ( arr[i].equals(".*[0-9.*") ){

               po += arr[i];
           }
        }
        System.out.println(po);

    }

}
