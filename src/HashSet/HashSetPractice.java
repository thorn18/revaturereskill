package src.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
    private HashSet<String> practiceHash;

    private HashSetPractice() {
        practiceHash =  new HashSet<String>();
    }

    public void addToSet(String value) {
        practiceHash.add(value);
    }

    public void removeFromSet(String value) {
        if(practiceHash.contains(value)) {
            practiceHash.remove(value);
        }
    }

    public Iterator<String> getIterator() {
        Iterator<String> setIterator = practiceHash.iterator();
        return setIterator;
    }

    public void iterate() {
        Iterator it = getIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
