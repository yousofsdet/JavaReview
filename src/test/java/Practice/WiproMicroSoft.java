package Practice;

public class WiproMicroSoft {


     public static String model(String str){
            String [] s= str.split(" ");
            String str1=s[0];
            String str2=s[1];
            StringBuilder mixed= new StringBuilder();
            int i=0;
            while (i<str1.length() && i<str2.length()){
                mixed.append(str1.charAt(i));
                mixed.append(str1.charAt(i));
                i++;
            }
            while (i<str1.length()){
                mixed.append(str1.charAt(i));
                i++;
            }
            while (i<str2.length()){
                mixed.append(str2.charAt(i));
                i++;
            }
            return mixed.toString();
        }



        public static void main(String[] args) {
            System.out.println( mixedSoft("wipro microsoft") );
        }

        public static String mixedSoft(String str){

         String result ="";

            for (int i = 0; i < 5 ; i++) {

                result += ""+ str.charAt(0+i) + str.charAt(6+i);

            }

            result += str.substring(11);

            return result;

        }



    }

