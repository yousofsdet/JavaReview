package RebootCamp;

import javax.crypto.spec.PSource;

public class Anagram {

    public static void main(String[] args) {
        String a = "listenp";
        String b = "silentp";
        String rest ="";

        if (a.length() != b.length()) {
            System.out.println("worng value");
            System.exit(0);
        }
                for (int j = 0; j < a.length(); j++) {
                    if ((a.contains( b.charAt(j)+"") & (b.contains(a.charAt(j)+""))) ){
                rest = "Yes Anagram" ;
                    }else {
                        rest = "not anagram ";
                        break;
                    }

                }
        System.out.println(rest);
            }

        }


