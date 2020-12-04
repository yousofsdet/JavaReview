package AliKemalD;

import com.sun.tools.javac.util.ArrayUtils;
import sun.security.util.ArrayUtil;

import java.util.*;

public class TestSet_1 {

    public static void main(String[] args) {

//        int [] straigtArray = new int[]{1,2,3,4,5,6,7,8,9};
//        reverseArray(straigtArray);
//        randomMaxMin( );
//        System.out.println(Arrays.toString( populate(new int [10] )));
//        removeAll(new ArrayList<String>(List.of("h","h","a","y","h","l")),"h");
//        extractNumber("st23p0lk9lp6");

//        int [] arr1 = new int[]{1, 2, 3, 4};
//        int [] arr2 = new int[]{5, 6, 7, 8};
//         mergeArrays( arr1, arr2);
//        mergeIntArrays(new int[]{1,2,3}, new int[]{4,5,6});
//        mergeStringArrays(new String[]{"a","b","c"}, new String[]{"d","e","f"});
//        findUniNumbers(new int[] {1,2,3,4,4,5,5,6});
//        findUniString(new String[]{"all","coll","all","toll"});
//        findUniChars(new String("yasina"));
        shiftNumbers(new int[] {1,2,3,4,5,6});
    }
    public static void shiftNumbers(int [] nums){

        int temp;
        for(int i = 0; i < nums.length - 1; i++) {

            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void findUniChars(String str){

        String [] chr = str.split("");

        Set list = new HashSet();
        list.addAll(Arrays.asList(chr));
//        System.out.println(Arrays.toString(chr));
        System.out.println(list);
    }
    public static void findUniString(String [] str){

        Set list = new HashSet();
        list.addAll(Arrays.asList(str));

        System.out.println(" hupp " + list);
    }

        public static void findUniNumbers(int [] num){

            Set list = new HashSet();

            for (int i=0; i< num.length; i++){
                list.add( num[i] );
            }
        System.out.println(" hupp " + list);
        }
        public static void mergeStringArrays(String[] a, String [] b){

            int size = a.length+b.length;
            String [] narr = new String[size];

            for (int i=0;i<a.length;i++){
                narr[i]=a[i];
            }
            for (int j=0;j<b.length;j++){
                narr[a.length+j]=b[j];
            }
            System.out.println(Arrays.toString( narr));

            ArrayList list = new ArrayList(Arrays.asList(a));
            list.addAll(Arrays.asList(b));

            System.out.println("List collection olarak " + list);

        }



        public static void mergeIntArrays( int[] arr1, int[] arr2){

            int leng = arr1.length+arr2.length;
            int[] newArr = new int[leng];
//            int counter =0;

            for (int i=0; i< arr1.length;i++){
                newArr[i] = arr1[i];
            }
            for (int j=0; j< arr2.length;j++){
                newArr[arr1.length +j] = arr2[j];
            }
            System.out.println(Arrays.toString(newArr));

    }
    public static void extractNumber(String str){

//        int value = Integer.parseInt(str.replaceAll("[^0-9]", ""));

        String onlyNumbers = str.replaceAll("[^0-9]","");
        String onlyString = str.replaceAll("[0-9]",""); // ^ bu isarete dikkat, fark bu
        int intnew = Integer.parseInt(str.replaceAll("[^0-9]",""));
        System.out.println("onlyNumbers string ==>  "+onlyNumbers);
        System.out.println("onlyNumbers int ==> "+ intnew);
        System.out.println("onlyString ====>  "+onlyString);

    }

    public static void removeAll(ArrayList<String> lst, String target){

        for (int i=0; i<lst.size(); i++){


            if (lst.get(i).contains(target)){
                lst.remove(i);

            }
        }

        System.out.println(lst);
    }

    public static int [] populate(int [] arr){

        for (int i=0; i<arr.length;i++){
            arr[i] = i+1;
        }
        return arr;
    }
    public static void reverseArray(int [] straigtArray){

        int temp=0;
        int size=straigtArray.length;
//        for (int i = 0, j=1; i < size/2; i++,j++) {
//            temp = straigtArray[size-j];
//            straigtArray[size-j] = straigtArray[i];
//            straigtArray[i] = temp;
//        }
        int [] reversedArray = new int[size];

        for (int i=0, j=1; i<size;i++, j++){
            reversedArray[i] = straigtArray[size-j];
        }
        System.out.println(Arrays.toString(reversedArray));

    }


    public static void randomMaxMin(){

        int [] random = new int[10];

        for (int i=0;i<random.length;i++){
            random[i] = (int) (Math.random()*100);
        }

        int ma=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for (int each:random) {
            if (each < mi){
                mi = each;
            }if (each > ma){
                ma = each;
            }

        }
        System.out.println("mi "+ mi);
        System.out.println("ma "+ ma);

        System.out.println(Arrays.toString( random));
        Arrays.sort(random);
        int min = random[0];
        int max = random[random.length-1];
        System.out.println(Arrays.toString(random));
        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
