package chapterFour;
import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number or enter 0 to quit:");

        int Number = userInput.nextInt();


        int largestNumber = Number ;
        int smallestNumber = Number;

        do {
            if (Number > largestNumber) {
                largestNumber = Number;
            }
            if (smallestNumber < Number) {
                smallestNumber = Number;
            }
            System.out.println("Enter a number or enter 0 to quit:");
            Number = userInput.nextInt();

        } while (Number != 0);






        System.out.printf("largest number is %d%n :", largestNumber);
        System.out.printf("smallest number is %d%n :", smallestNumber);


    }
}