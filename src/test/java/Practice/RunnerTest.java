package Practice;

import Practice.Employee;

import javax.sound.midi.Soundbank;
import java.util.*;

public class RunnerTest {
    public static void main(String[] args){
    String word="Micro YUSUF Soft Micro intos BAYER Mach Salacak intos YUSUF BAYER";
    String [] str =word.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String wrd : str){
            if (map.containsKey(wrd)){
                map.put(wrd, map.get(wrd) +1);
            }else {
                map.put(wrd, 1);
            }
        }

        System.out.println(map);
    }
}
