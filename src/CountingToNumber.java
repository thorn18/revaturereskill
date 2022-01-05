package src;

public class CountingToNumber {

    public void countToNumber(int value) {

        for(int x = 0; x <= value; x++) {
            System.out.print(x);

            if(x%2 == 1) {
                System.out.print(" - Odd");

            } else {
                System.out.print(" - Even");

            }
        }

    }
}
