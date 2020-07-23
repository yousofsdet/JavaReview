package Practice;

import java.util.*;

public class CollIterator {

    public static void main(String[] args) {
        Collection<Integer> coll =
                new ArrayList<>(Arrays.asList(1,2,332,34,224,65,456,87,908));

//        System.out.println(coll);
        Iterator<Integer> itr = coll.iterator();

        while(itr.hasNext()){
//            Integer each = itr.next();
            System.out.print( itr.next() + " - " );
        }

        List<Double> dtr = new ArrayList<>(Arrays.asList(332D,224D,456D,908D));

//        System.out.println(itr.hasNext());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());

    }
}
