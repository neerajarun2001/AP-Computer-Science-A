import java.util.*;
public class MinivanSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your input for the sequence of values for the switches and gear shift: ");
        String input = in.nextLine();

        //breaks up the string into each input 
        String leftDoor = input.substring(0, 1);
        String rightDoor = input.substring(1, 2);
        String childLock = input.substring(2, 3);
        String masterUnlock = input.substring(3, 4);
        String insideLeft = input.substring(4, 5);
        String outsideLeft = input.substring(5, 6);
        String insideRight = input.substring(6, 7);
        String outsideRight = input.substring(7, 8);
        String gearShift = input.substring(8, 9);

        boolean leftDoorOpen = false;
        boolean rightDoorOpen = false;

        if (masterUnlock.equals("1") && gearShift.equals("P")) {

            if (leftDoor.equals("1")) {
                leftDoorOpen = true;
            }
            else if (outsideLeft.equals("1")) {
                leftDoorOpen = true;
            }
            else if (insideLeft.equals("1")) {
                if (childLock.equals("1")) {
                    leftDoorOpen = false;
                } else {
                    leftDoorOpen = true;
                }
            }
            if (rightDoor.equals("1")) {
                rightDoorOpen = true;
            } else if (outsideRight.equals("1")) {
                rightDoorOpen = true;
            } else if (insideRight.equals("1")) {
                if (childLock.equals("1")) {
                    rightDoorOpen = false;
                } else {
                    rightDoorOpen = true;
                }
            }


            }
        if(leftDoorOpen && rightDoorOpen){
            System.out.println("Both doors are open.");
        }
        else if(leftDoorOpen){
            System.out.println("Left Door is open");
        }
        else if(rightDoorOpen){
            System.out.println("Right Door is open.");
        }

        }

    }
