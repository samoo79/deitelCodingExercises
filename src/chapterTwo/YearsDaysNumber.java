package chapterTwo;

import java.util.Scanner;

public class YearsDaysNumber {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Number of minutes:");
int minute = input.nextInt();

int years = ((minute/(365*24*60)));
System.out.printf("Number of years is: %d%n", years);

int days = ((minute/(24*60))%365);
System.out.printf("Number of days is: %d", days);



 





 



}



}