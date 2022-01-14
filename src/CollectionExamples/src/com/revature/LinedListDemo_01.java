package com.revature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinedListDemo_01 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();

        // Storing elements into an ArrayList

        // 1. Instantiate and add
        Integer myInt = new Integer(10);
        intList.add(myInt);

        // 2. Instantiate + add
        intList.add(new Integer(5));

        // 3. Instantiate with auto-boxing and add
        Integer anotherInt = 7; //Auto-boxing
        intList.add(anotherInt);

        // 4. Auto-boxing + add
        intList.add(9);
        intList.add(1);
        intList.add(10);
        intList.add(15);

        // Retrieve elements of an ArrayList

        // 1. Generic - applicable for all collection - Just printing not accessing each of the element
        System.out.println("Using toString()");
        System.out.println(intList.toString()+"\n");

        // 2. Positional Access - Only applicable for List implementations
        System.out.println("Positional access");
        for(int c = 0 ; c < intList.size() ; c++){
            System.out.println("Element at the postion "+c+" is "+intList.get(c));
        }
        System.out.println();

        System.out.println("Adding 100 at first");
        intList.addFirst(100);

        System.out.println("Adding 99 at last");
        intList.addLast(99);

        // 3. Using Iterator - applicable for all Collection implementations
        System.out.println("Using Iterator");
        Iterator<Integer> intIterator = intList.iterator();
        while(intIterator.hasNext()){
            int element = intIterator.next(); // Auto-unboxing
            System.out.println(element);
        }
    }
}
