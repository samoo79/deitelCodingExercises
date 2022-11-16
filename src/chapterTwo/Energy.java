package chapterTwo;

import java.util.Scanner;

public class Energy{

public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("The amount of water in kilgrams:");
    double M = input.nextDouble();

    System.out.println("initial temperature of water in degrees Celsius:");
    double initialTemp = input.nextDouble();

    System.out.println("final temperature of water in degrees Celsius:");
    double finalTemp = input.nextDouble();

    double EnergyQ = ( (M*(finalTemp - initialTemp)*4184));
    System.out.printf("EnergyQ measured in joules is %s%n", EnergyQ);















}




}