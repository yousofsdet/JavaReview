package RebootCamp;

public class ComplexPASSWORD {


    public static void main(String[] args) {

        String password = "Ali@12pol";

        boolean length = password.length()>=8;
        boolean lower = password.matches(".*[a-z].*");
        boolean upper = password.matches(".*[A-Z].*");
        boolean number = password.matches(".*[0-9].*");
        boolean special = password.matches(".*[@!~#$%&].*");
        boolean valid = length && lower && upper && number && special;

        if (valid){
            System.out.println("Valid password");
        }else {
            System.out.println("Invalid password");
        }

    }
}
