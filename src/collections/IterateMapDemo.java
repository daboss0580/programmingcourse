package collections;

import java.util.HashMap;
import java.util.Set;

public class IterateMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap =new HashMap<>();
        hashMap.put("Monitor",200);
        hashMap.put("Mouse",18);
        hashMap.put("Speakers",40);
        hashMap.put("UPS",30);
        hashMap.put("CPU",150);
        hashMap.put("Keyboard",20);
        System.out.println(hashMap);
        Set<String>keys= hashMap.keySet();
        for (String key:keys)
            System.out.println(key+" : "+hashMap.get(key));
    }
}
