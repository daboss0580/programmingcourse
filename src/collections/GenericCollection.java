package collections;

import java.util.LinkedList;

public class GenericCollection {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        //linkedList.add(10);
        linkedList.add("xxx");
        linkedList.add("yyy");
        linkedList.add("zzz");
        System.out.println(linkedList);
        for (String list:linkedList)
            System.out.println(list);
    }
}
