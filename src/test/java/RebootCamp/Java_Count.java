package RebootCamp;

public class Java_Count {


    public static void main(String[] args) {

        String str = "I love java and pop java end of the java";
        int counter=0;

//        approach one  ama bu metod ignore case yapmiyor. birinci approach is the best.
        for (int i = 0; i < str.length()-3 ; i++) {
            if (str.substring( i , i+4 ).equalsIgnoreCase("java")){
                counter++;
            }

        }
        System.out.println(counter);

//        approach two

        int counter2 = 0;

        while (str.contains("java")){
           counter2++;
            str = str.replaceFirst("java","");
        }
        System.out.println(counter2);
    }
}
