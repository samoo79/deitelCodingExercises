package chapterThree;

import java.util.Scanner;

public class OldEven {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter the Number:");
	int Number = input.nextInt();

     if (Number%2 == 0){
	System.out.printf("%d is an even number",Number);
}
	if (Number%2==1){
	System.out.printf("%d is an odd number",Number);
}
}
}