import java.util.*;
public class OrderThreeIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input three numbers please");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if((num1 < num2 && num2 < num3) || (num1>num2 && num2>num3)){
            System.out.println("These numbers are in order.");
        }
        else{
            System.out.println("Not in order.");
        }
    }
}
