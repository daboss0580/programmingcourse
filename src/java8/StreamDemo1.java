package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamDemo1 {
    public static void main(String[] args) {
        //Ways of Traversing/Iterating
        System.out.println("Ways of Traversing/Iterating");
        System.out.println("----------------------------");
        List<String>list=List.of("Orange", "Mango", "Apple", "Lemon");
        //Using traditional for loop
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
        // Enhanced for loop added in java 5
        System.out.println("1--------------1");
        for (String list1:list)
            System.out.println(list1);
        //For each added in java 8 version
        System.out.println("2--------------2");
        list.forEach(s -> System.out.println(s));
        System.out.println("3--------------3");
        list.forEach(System.out::println);
        //Creating Stream using list
        System.out.println("Creating Stream using list");
        System.out.println("--------------------------");
        Stream<String>stream=list.stream();
        stream.forEach(System.out::println);
        //Creating Stream using Set
        System.out.println("Creating Stream using Set");
        System.out.println("-------------------------");
        Set<String>set=new HashSet<>(list);
        Stream<String>stream1=set.stream();
        stream1.forEach(System.out::println);
        //Creating Stream using Array
        System.out.println("Creating Stream using Array");
        System.out.println("-------------------------");
        String [] strArray={"aaa", "bbb", "ccc"};
        Stream<String>stream2= Arrays.stream(strArray);
        stream2.forEach(System.out::println);
    }
}
