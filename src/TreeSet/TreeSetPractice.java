package src.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
    private TreeSet<Integer> practiceTree;

    public TreeSetPractice() {
        this.practiceTree = new TreeSet<>();
    }

    public void addToTree(int value) {
        practiceTree.add(value);
    }

    public void removeLargestValue() {
        int value = practiceTree.pollLast();
        System.out.println(value + "Was removed from the tree");
    }

    public void removeSmallestValue() {
        int value = practiceTree.pollFirst();
        System.out.println(value + "Was removed from the tree");
    }

    public void wipeTree() {
        practiceTree.clear();
    }

    public boolean isOdds() {
        Iterator<Integer> it = practiceTree.descendingIterator();
        while(it.hasNext()) {
            if(it.next()%2 == 1) {
                return false;
            } else {

            }
        }
        return true;
    }


}
