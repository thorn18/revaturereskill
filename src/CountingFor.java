package src;

import java.util.Scanner;
public class CountingFor {
    public static void main(String[] args) {
        int number ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number you want to count to:");
        number = scan.nextInt();
        for (int counter=0;counter<number;counter++){
            if (counter%2==0){
                System.out.println(counter+" is an even number");
            }else{
                System.out.println(counter+" is an odd number");
            }

        }
    }

}