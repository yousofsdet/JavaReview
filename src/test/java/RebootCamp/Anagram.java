package RebootCamp;

import javax.crypto.spec.PSource;

public class Anagram {

    public static void main(String[] args) {
        String a = "listenp";
        String b = "silenta";
        String rest ="";

        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            System.exit(0);
        }

        for(int i=0 ; i< a.length() ; i++){

            if(a.contains(b.charAt(i)+"") & b.contains(a.charAt(i)+"")){
                rest = "Yes it is anagram";
            }else{
                rest = "not anagram";
            }
        }
        System.out.println(rest);

            }

        }


