package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("Monitor");
        hashSet.add("Mouse");
        hashSet.add("Speakers");
        hashSet.add("UPS");
        hashSet.add("CPU");
        hashSet.add("Keyboard");
        System.out.println(hashSet.add("Keyboard"));
        System.out.println(hashSet);
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("Monitor");
        linkedHashSet.add("Mouse");
        linkedHashSet.add("Speakers");
        linkedHashSet.add("UPS");
        linkedHashSet.add("CPU");
        linkedHashSet.add("Keyboard");
        System.out.println(linkedHashSet.add("Keyboard"));
        System.out.println(linkedHashSet);
        TreeSet treeSet=new TreeSet();
        treeSet.add("Monitor");
        treeSet.add("Mouse");
        treeSet.add("Speakers");
        treeSet.add("UPS");
        treeSet.add("CPU");
        treeSet.add("Keyboard");
        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet);
    }
}
