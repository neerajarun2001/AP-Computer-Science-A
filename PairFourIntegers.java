import java.util.Scanner;

public class PairFourIntegers {
    public static void main(String[] args) {
        int numPairs = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Input four numbers please");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        if (num1 == num2) {
            numPairs++;
        }
        if (num1 == num3) {
            numPairs++;
        }
        if (num1 == num4) {
            numPairs++;
        }
        if (num2 == num3) {
            numPairs++;
        }
        if (num2 == num4) {
            numPairs++;
        }
        if (num3 == num4) {
            numPairs++;
        }

        System.out.println("There are " + numPairs + " pairs in the set");
    }
}
