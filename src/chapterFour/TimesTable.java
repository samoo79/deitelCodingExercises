package chapterFour;

import java.util.Scanner;

public class TimesTable {

public static void main (String[] args){

Scanner input = new Scanner(System.in);

System.out.println ("Enter a number :");

int number = input.nextInt();

for (int i= 1; i < 13; i++){
    int product = number*i;
System.out.printf("%d times %d is %d%n", number, i, product);
}

}
}
