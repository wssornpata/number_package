package number_package;

import java.util.Arrays;
import java.util.Scanner;

public class ExerciseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateNumber obj = new CalculateNumber();
        String questionString = "Enter numbers (Split by \",\" symbol): ";
        String askForInput = "Target: ";
        int[] numbers;
        int target;

        while (true) {
            try {
                System.out.print(questionString);
                String input = sc.nextLine();
                numbers = Arrays.stream(input.split(","))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .mapToInt(Integer::parseInt)
                        .toArray();
                System.out.print(askForInput);
                target = sc.nextInt();
                sc.nextLine();
                obj.setData(numbers, target);
                System.out.println("Result: " + Arrays.toString(obj.calculate()));
            } catch (NumberFormatException e) {
                System.out.println("Warning: Value is not a numeric number.");
                sc.nextLine();
            }
        }
        // numbers = new int[] { 2, 2, 7, 7, 11, 15 };
        // target = 9;
        // obj.setData(numbers, target);
        // System.out.println(Arrays.toString(obj.calculate()));

        // numbers = new int[] { 3, 2, 4 };
        // target = 6;
        // obj.setData(numbers, target);
        // System.out.println(Arrays.toString(obj.calculate()));

        // numbers = new int[] { 3, 3 };
        // target = 6;
        // obj.setData(numbers, target);
        // System.out.println(Arrays.toString(obj.calculate()));
    }
};