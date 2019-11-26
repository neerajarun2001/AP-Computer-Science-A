import java.util.*;
public class OrderFloats {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter three floating point numbers please!");

        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();

        float largestNumber = 0;

        if (num1 > num2){
            if(num1 > num3){
                largestNumber = num1;
            }
            else{
                largestNumber = num3;
            }
        }
        else{
            if(num2 > num3){
                largestNumber = num2;
            }
            else{
                largestNumber = num3;
            }
        }
        System.out.println("The largest number is: " + largestNumber);
    }
}
