package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAllWays {

 public static void main(String[] args) {

     String word = "ali baba nina suphi yusuf tuna nehir makale oluyor";


     System.out.println("===========================================================================");
     String [] wordArray = word.split(" ");
     String revers="";
     String [] reverarr= new String[wordArray.length];
//     burada depolamak istemiyorsak direkt olarak
//     for loop icinde sout yaparak yazdirabiliriz. depolamak zorunda degiliz

     for(int i= wordArray.length-1; i>=0;i--){
         revers += wordArray[i]+" "; // sting olarak arayi kelime kelime cevirip bir stringe depolamak
         reverarr[i] = wordArray[i]; // Array i array e kelime kelime cevirerek depolamak
         System.out.println("Depolamadan sout yaparsak boyle ==> "+wordArray[i]); // sadece kelime kelime yazdirmak
     }
     System.out.println(revers);
     System.out.println("Array olarak"+Arrays.toString(reverarr));

     System.out.println("===========================================================================");

     String str = "anekdot inekpotSOFT";
     String rever = "";
     for (int i=str.length()-1; i>=0;i--){
         rever += ""+str.charAt(i); // bir stringin harflerini terse cevirmek
     }
     System.out.println(rever);

     System.out.println("===========================================================================");

        StringBuilder tersStr = new StringBuilder();
        tersStr.append(str); // append metodu ile once string - stringbuilder yapilip sonra reverse metodu kullailir
        tersStr.reverse();
        System.out.println(tersStr.toString());

     System.out.println("===========================================================================");

     String[] strarr = str.split("");

     for (int i = str.length()-1 ; i >=0 ; i--) {
         System.out.print(strarr[i]);
     }


    }
}