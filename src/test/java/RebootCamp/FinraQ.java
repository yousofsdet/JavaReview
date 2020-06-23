package RebootCamp;

public class FinraQ {

    //        Write a method which prints out the numbers from 1 to 30
//        but for numbers which are a multiple of 3,
//        print "FIN" instead of the number and for numbers
//        which are a multiple of 5, print "RA" instead of
//        the number. for numbers which are a multiple of both
//        3 and 5, print "FINRA" instead of the number.
    public static void main(String[] args) {

//        approach 1
        for (int i = 1; i <= 30; i++) {
            String finrat="";
            if (i % 3 == 0)
                finrat = "FIN";
            if (i % 5 == 0)
                finrat += "RA";

            if (finrat.isEmpty()) {
                System.out.println(i);
            }else {
                System.out.println(finrat);
            }
        }

//        approach 2

        String result = "";

        for(int i=1; i <= 30; i++) {

            result +=
                    (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA " :(i%3 == 0) ? "FIN " : i+" ";

        }

        System.out.println("ikinci approach : "+result);

    }

    }
