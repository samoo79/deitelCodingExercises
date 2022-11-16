package chapterTwo;

import java.util.Scanner;

public class YearsNumber {

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Number of minutes:");
    int minute = input.nextInt();

    int years = ((minute/(365*24*60)));
    int days = ((minute/(24*60))%365);
    System.out.printf("There are %d years and %d days", years, days);






 





 



}



}