package number_package;

import java.util.Arrays;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateNumber obj = new CalculateNumber();
        boolean loop = true;
        int[] numbers;
        int target;

        while (loop) {
            try {
                System.out.print("Enter numbers (Split by \",\" symbol): ");
                String input = sc.nextLine();
                numbers = Arrays.stream(input.split(","))
                        .map(String::trim)
                        .filter(s -> !s.isEmpty())
                        .mapToInt(Integer::parseInt)
                        .toArray();
                        System.out.print("Target: ");
                target = sc.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Warning : Value is not numeric number.");
                continue;
            }
            obj.setData(numbers, target);
            System.out.println(Arrays.toString(obj.calculate()));
        }
        // numbers = new int[] { 2, 2, 7, 7, 11, 15 };
        // target = 9;
        // obj.setData(numbers, target);
        // out.println(Arrays.toString(obj.calculate()));

        // numbers = new int[] { 3, 2, 4 };
        // target = 6;
        // obj.setData(numbers, target);
        // out.println(Arrays.toString(obj.calculate()));

        // numbers = new int[] { 3, 3 };
        // target = 6;
        // obj.setData(numbers, target);
        // out.println(Arrays.toString(obj.calculate()));
    }
};