package chapterTwo;

import java.util.Scanner;

public class MaximumMinimum {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println ("Enter first integer:");
double NumberOne = input.nextDouble();

System.out.println ("Enter second integer:");
double NumberTwo = input.nextDouble();

double sum = (NumberOne + NumberTwo);
System.out.printf("Sum of the integers is %s%n", sum);

double diff = (NumberOne - NumberTwo); 
System.out.printf("Difference of the integers is %s%n", diff);

double product = (NumberOne*NumberTwo);
System.out.printf("Product of the integers is %s%n", product);

double Ave = ((sum/2));
System.out.printf("Average of the intergers is %S%n", Ave);

double distance = (NumberOne - NumberTwo); 
System.out.printf("Distance of the integers is %s%n", distance);

if (NumberOne > NumberTwo) {System.out.printf ("Maximum Number is %s%n", NumberOne);}
if (NumberTwo < NumberOne) {System.out.printf ("Minimum Number is %s%n", NumberTwo);}



























}


}