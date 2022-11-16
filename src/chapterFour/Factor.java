package chapterFour;

import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");

        int Number = input.nextInt();

        int count = 1;
        int counter = 0;

        while (count <= Number){

            if (Number%count == 0) {
                counter = counter + 1;
            }
            System.out.println("Enter a number");
            }
            System.out.printf("factor of the are:",counter);


        }


    }

