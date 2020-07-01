package Practice;

public class Reverse {

    public static void main(String[] args) {

//        int [] arr = new int[] {1,2,3,100,4,5,6};

        float a = Float.parseFloat("24");
        System.out.println(a);

        String b = Integer.toString(3);
        int c = Integer.parseInt("123");

        int aa = 9;
        int bb = 2;

        int temp = aa;
        aa = bb;
        bb=temp;

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i == j)
                    continue;
                System.out.println(i + " " + j);
            }
        }

    }

}
//03 - 02 - 01
//        13 - 12 - 10
//        23-21-20
