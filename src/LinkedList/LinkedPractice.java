package src.LinkedList;

import java.util.LinkedList;

public class LinkedPractice {
    private LinkedList<Double> doubleList;

    private LinkedPractice() {
        this.doubleList = new LinkedList<Double>();
    }

    private void addToList(double d) {
            doubleList.add(d);
    }

    private void removeFromList(double d) {
        if(doubleList.contains(d)) {
            doubleList.remove(d);
        }
    }

    private void sortList() {
        doubleList.sort((o1, o2) -> o1.compareTo(o2));
    }

    private void printList() {
        System.out.println(doubleList.toString());
    }
}
