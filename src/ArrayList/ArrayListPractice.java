package src.ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    ArrayList<Integer> practiceList = new ArrayList<>();

    public void addtoList(int value) {
        practiceList.add(value);
    }

    public void removeFromList(int value) {
        if(practiceList.contains(value)) {
            practiceList.remove(value);
        }
    }

    public int getFirstElement() {
        return practiceList.get(0);
    }

    public void sortList() {
        practiceList.sort((o1, o2) -> o1-o2);
    }

}
