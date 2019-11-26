import java.util.*;
public class Thermistor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a temperature measured in degrees Fahrenheit: ");

        int userTemp = in.nextInt();

        double userTempKelvin = (userTemp - 32) * 5/9 + 273.15;
        int beta = 3310;
        int tempNaught = 40 + 273;
        int RNaught = 33192;
        int R2 = 156300;
        int R3 = R2;
        int R4 = R2;

        double R = (RNaught) * Math.exp(beta * (1/userTempKelvin - 1/tempNaught));

        if(R2/(R + R2) < R4/(R3 + R4)){
            System.out.println("The alarm will sound.");
        }
        else{
            System.out.println("The alarm will not sound");
        }

    }

}
