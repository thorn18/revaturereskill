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

    private void developList() {
        doubleList.add(12.0);
        doubleList.add(4.3);
        doubleList.add(11.7);
        doubleList.add(3.0);
        doubleList.add(-100.0);
        doubleList.add(1225.3);
        doubleList.add(49.1);
    }

    private double sum() {
        double sum = 0;
        for(double d: doubleList) {
            sum += d;
        }
        return sum;
    }
}
