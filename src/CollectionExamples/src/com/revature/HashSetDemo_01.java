package com.revature;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo_01 {
    public static void main(String[] args) {
        Set<Integer> intSet = new HashSet<>();

        // Storing elements into an ArrayList

        // 1. Instantiate and add
        Integer myInt = new Integer(10);
        intSet.add(myInt);

        // 2. Instantiate + add
        intSet.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7; //Auto-boxing
        intSet.add(anotherInt);

        // 4. Auto-boxing + add
        intSet.add(9);
        intSet.add(1);
        intSet.add(10);
        intSet.add(15);

        // Retrieve elements of an ArrayList

        // 1. Generic - applicable for all collection - Just printing not accessing each of the element
        System.out.println("Using toString()");
        System.out.println(intSet.toString()+"\n");

        // 2. Positional Access - Only applicable for List implementations
//        System.out.println("Positional access");
//        for(int c = 0 ; c < intSet.size() ; c++){
//            System.out.println("Element at the postion "+c+" is "+intSet.get(c));
//        }
//        System.out.println();

        // 3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intSet.iterator();
        while(intIterator.hasNext()){
            int element = intIterator.next(); // Auto-unboxing
            System.out.println(element);
        }
    }
}
