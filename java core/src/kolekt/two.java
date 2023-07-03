package kolekt;

import java.util.*;

public class two {
    public static void main(String[] args) {
       Map<String, Integer> fruits =new TreeMap<>();
       fruits.putIfAbsent( "ананас", 6);
       fruits.putIfAbsent("вишня", 5);
       fruits.putIfAbsent("боб", 3);
       System.out.print(fruits);
    }
}
