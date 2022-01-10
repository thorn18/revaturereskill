package src.Comparator;

import src.Inheritence.Employee;

abstract class ComparatorPractice implements Comparable<ComparatorPractice> {
    private Employee bob = new Employee("01","Bob");
    private Employee sally = new Employee("02","Sally");
    private int organizationID;

    private ComparatorPractice() {
        organizationID = 0000001;
    }

    @Override
    public int compareTo(ComparatorPractice o) {
        if (this.organizationID == o.organizationID) {
            return 0;
        } else {
            return 1;
        }
    }
}
