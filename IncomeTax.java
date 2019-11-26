import java.util.*;
public class IncomeTax {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input your income and I will calculate your income tax: ");
        int income = in.nextInt();
        double incomeTax = 0;

        if (income > 500000){
            incomeTax = 0.06 * income;
        }
        else if(income > 250000){
            incomeTax = 0.05 * income;
        }
        else if(income > 100000){
            incomeTax = 0.04 * income;
        }
        else if(income > 75000){
            incomeTax = 0.03 * income;
        }
        else if(income > 50000){
            incomeTax = 0.02 * income;
        }
        else if(income > 0){
            incomeTax = 0.01 * income;
        }
        System.out.println("Amount of income tax is $" + incomeTax);


    }
}
