import java.util.*;
public class ReadThreeNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input three numbers please");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("All three of these numbers are the same.");
        }
        else if (!(num1 == num2 || num1 == num3 || num2 == num3)){
            System.out.println("All of them are different.");
        }
        else{
            System.out.println("Neither.");
        }

    }
}
