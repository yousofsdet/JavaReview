package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMapWithWhileAdvancedLoop {
    public static void main(String[] args) {

        String str ="asadgreypoeritumxnzasfdjlkabskaskdasdgjksbfg";

        Map<String, Integer> map = new HashMap<>();
        map.put("alib",45);
        map.put("aagsdg",3);
        map.put("dksnfl",32);
        map.put("afhjl", 67);

        Iterator itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" --- "+entry.getValue());
        }
        System.out.println(map);
        for (Map.Entry etr : map.entrySet()){
            System.out.println(etr.getKey() +" ==== "+ etr.getValue());
        }
    }
}
