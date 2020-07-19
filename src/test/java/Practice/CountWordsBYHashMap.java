package Practice;

import java.util.HashMap;
import java.util.Map;

public class CountWordsBYHashMap {

    public static void main(String[] args) {
        String str = "We are the champions of " +
                "champions in the world we are great of course";

        HashMap<String, Integer> CountMap;
        CountMap = new HashMap<String, Integer>();

        String[] strArray = str.split(" ");

        for (String c : strArray) {
            if (CountMap.containsKey(c)) {
                // If String is present in CountMap,
                // incrementing it's count by 1
                CountMap.put(c, CountMap.get(c) + 1);
            } else {
                // If char is not present in charCountMap,
                // putting this char to charCountMap with 1 as it's value
                CountMap.put(c, 1);
            }
        }

        System.out.println(CountMap);
//      Print the map
      for (Map.Entry entry : CountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

//        HashMap<String, Integer> counts = new HashMap<>();
//        int count = 0;
//        String strarr[] = str.split(" ");
//
//        for (int i = 0; i < counts.size(); i++) {
//            if (counts.containsKey(strarr[i])) {
//                count = counts.get(strarr[i]);
//                counts.put(strarr[i], count++);
//            } else {
//                counts.put(strarr[i], 1);
//            }
//        }
//        System.out.println(counts);
    }
}

