import java.util.*;
public class OrderStrings {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter three strings please!");

        String firstString = in.nextLine();
        String secondString = in.nextLine();
        String thirdString = in.nextLine();

        if(firstString.compareTo(secondString) > 0){
            if(secondString.compareTo(thirdString) > 0){
                System.out.println(thirdString + "\n" + secondString + "\n" + firstString);
            }
            else if(thirdString.compareTo(firstString) > 0){
                System.out.println(secondString + "\n" + thirdString + "\n" + firstString);
            }
            else{
                System.out.println(secondString + "\n" + firstString + "\n" + thirdString);
            }
        }
        else{
            if(secondString.compareTo(thirdString) > 0){
                System.out.println(firstString + "\n" + thirdString + "\n" + secondString);
            }
            else if(secondString.compareTo(thirdString) < 0){
                System.out.println(firstString + "\n" + secondString + "\n" + thirdString);
            }
            else{
                System.out.println(thirdString + "\n" + firstString + "\n" + secondString);
            }
        }
    }

}
