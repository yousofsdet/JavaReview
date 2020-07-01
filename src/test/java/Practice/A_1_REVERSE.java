package Practice;

import java.util.ArrayList;
import java.util.List;

public class A_1_REVERSE {

    public static void addToInt(int x, int amountToAdd) {
         x = x + amountToAdd;
        }
 public static void main(String[] args) {


     int[] array = {6,9,8};
     List<Integer> list = new ArrayList<>();
     list.add(array[0]);
     list.add(array[2]);
     list.set(1, array[1]);
     list.remove(0);
     System.out.println(list);


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