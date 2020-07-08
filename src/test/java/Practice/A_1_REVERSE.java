package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A_1_REVERSE {

    public static void addToInt(int x, int amountToAdd) {
         x = x + amountToAdd;
        }
 public static void main(String[] args) {


     List<String> list = new ArrayList<>();
      list.add("hawk");
      list.add("robin");
      Object[] objectArray = list.toArray();
      System.out.println(objectArray.length); // 2
      String[] stringArray = list.toArray(new String[0]);
      System.out.println(stringArray.length); // 2
     

     ArrayList list1 = new ArrayList();
     ArrayList list2 = new ArrayList(10);
     ArrayList list3 = new ArrayList(list2);

     System.out.println(list1);
     System.out.println(list2);
     System.out.println(list3);

//     int[] numbers = {2,4,6,8,2};
//     System.out.println(Arrays.binarySearch(numbers, 2)); // 0
//     System.out.println(Arrays.binarySearch(numbers, 4)); // 1
//     System.out.println(Arrays.binarySearch(numbers, 1)); // -1
//     System.out.println(Arrays.binarySearch(numbers, 3)); // -2
//     System.out.println(Arrays.binarySearch(numbers, 9)); // -5
//     System.out.println(Arrays.binarySearch(numbers, 2)); // 0





//     String [] bugs = { "cricket", "beetle", "ladybug" };
//     String [] alias = bugs;
//     System.out.println(bugs.equals(alias)); // true
//     System.out.println(Arrays.toString(bugs)); // [Ljava.lang.String;@160bc7c0
//     System.out.println(Arrays.toString(alias));
//
//     Arrays.sort(bugs) ;
//
//     int[] array = {6,9,8};
//     List<Integer> list = new ArrayList<>();
//     list.add(array[0]);
//     list.add(array[2]);
//     list.set(1, array[1]);
//     list.remove(0);

//     System.out.println(list);
//        CollectonS.sort(list);

//             boolean keepGoing = true;
//             int count = 0;
//             int x = 3;
//             while(count++ < 3) {
//                 int y = (1 + 2 * count) % 3;
//                 switch(y) {
//                     default:
//                         case 0: x -= 1; break;
//                         case 1: x += 5;
//                         }
//                 }
//            System.out.println(x);

             }
}