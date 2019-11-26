import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        int UserNum = input.nextInt();
        if (UserNum%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
