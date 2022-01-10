package src.demo;

public class WhileDemo {
    public static void main(String[] args) {
        int loan =10000;
        int monthly = 1000;
        int numPayments=0;


        while(loan >0){
            double interest = loan*0.05;
            loan +=interest;
            numPayments++;
            System.out.println("Loan plus interest :"+loan);
            loan -= monthly;
            System.out.println("Loan after payment "+numPayments+" : "+loan );

        }
        System.out.println("It took "+numPayments+" payments to pay loan.");
    }

}