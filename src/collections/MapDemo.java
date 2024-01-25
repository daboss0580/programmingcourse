package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap hashMap =new HashMap();
        hashMap.put("Monitor",200);
        hashMap.put("Mouse",18);
        hashMap.put("Speakers",40);
        hashMap.put("UPS",30);
        hashMap.put("CPU",150);
        hashMap.put("Keyboard",20);
        System.out.println(hashMap);
        LinkedHashMap linkedHashMap =new LinkedHashMap();
        linkedHashMap.put("Monitor",200);
        linkedHashMap.put("Mouse",18);
        linkedHashMap.put("Speakers",40);
        linkedHashMap.put("UPS",30);
        linkedHashMap.put("CPU",150);
        linkedHashMap.put("Keyboard",20);
        System.out.println(linkedHashMap);
        TreeMap treeMap =new TreeMap();
        treeMap.put("Monitor",200);
        treeMap.put("Mouse",18);
        treeMap.put("Speakers",40);
        treeMap.put("UPS",30);
        treeMap.put("CPU",150);
        treeMap.put("Keyboard",20);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
    }
}
