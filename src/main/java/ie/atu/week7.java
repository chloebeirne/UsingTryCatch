package ie.atu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class week7 {
    public static void main(String[] args){
        System.out.println("Please enter a number between 0 - 9: ");
        Scanner myscan = new Scanner (System.in);
        while(true){
            try {
                int myNum = myscan.nextInt();
                if (myNum <= 9 && myNum > 0) {
                    System.out.println("You entered: " + myNum);
                    break;
                } else {
                    System.out.println("Not a valid number, enter a number between 0 - 9: ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Error found, insert an integer: ");
                myscan.next();
            }
        }
    }
}
