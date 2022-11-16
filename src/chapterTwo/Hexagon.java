package chapterTwo;

import java.util.Scanner;

public class Hexagon {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println ("The length of a side of the hexagon:");
double Length = input.nextDouble();

double Pie = (Math.PI/6);  

double Area = ((6*Length*Length)/4*(Math.tan(Pie)));

System.out.printf("Area of the hexagon: %s%n", Area);


}


}