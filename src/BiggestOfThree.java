package src;

public class BiggestOfThree {

    public void BiggestOfThree(int x, int y, int z) {

        if(x > y && x > z) {
            System.out.println("Biggest  = " +x);
        } else if (y > x && y > z) {
            System.out.println("Biggest  = " +y);

        } else if (z > y && z > x) {
            System.out.println("Biggest  = " +z);

        } else if (x == y && z > x) {
            System.out.println("Biggest  = " +z);

        }else if (z == y && x > y) {
            System.out.println("Biggest  = " +x);

        } else if (x == z && y > x) {
            System.out.println("Biggest  = " +y);

        } else if (z == y && y == x) {
            System.out.println("No Biggest");

        }


    }
}
