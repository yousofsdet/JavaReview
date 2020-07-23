package Practice;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateAdvancedLoop {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("alib",45);
        map.put("aagsdg",3);
        map.put("dksnfl",32);
        map.put("afhjl", 67);

//  way 1  advaced iterator loop
        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }

//  way 2  using for each loop
        for (Map.Entry etr : map.entrySet()){
            System.out.println(etr.getKey() +" ==== "+ etr.getValue());
        }
    }
}
