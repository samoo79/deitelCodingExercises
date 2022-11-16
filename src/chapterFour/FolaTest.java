package chapterFour;

import java.util.*;

public class FolaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder allNumbers = new StringBuilder();
        List<Integer> nums = new ArrayList<>();
        System.out.println("Continue or Stop");
        String userInput = scanner.next();

        while (!userInput.equals("Stop")) {
            System.out.println("enter number");
            //1. Collect number
            //2. if user enters non-digit respond with olodorabata
            String userNumber = scanner.next();
            try {
                int number = Integer.parseInt(userNumber);
                allNumbers.append(number);
                allNumbers.append(",");
            } catch (NumberFormatException ex) {
                System.out.println("olodo rabata ni e. I said enter a number: ");
            }
            System.out.print("Continue or Stop");
            userInput = scanner.next();
        }
        String s = allNumbers.toString();
        String[] s1 = s.split(",");
        for (int i = 0; i < s1.length; i++){
            nums.add(Integer.parseInt(s1[i]));
        }
        Integer max = Collections.max(nums);
        System.out.println("maximum::"+max);
    }

}
