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

//     yakisikli Print the map without =
      for (Map.Entry entry : CountMap.entrySet()){
          System.out.println(entry.getKey()+" "+ entry.getValue());
      }
    }
}

