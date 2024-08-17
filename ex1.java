package number_package;

import static java.lang.System.out;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        CalculateNumber a = new CalculateNumber();
        int[] numbers;
        int target;

        numbers= new int[]{2, 7, 11, 15};
        target = 9;
        a.setData(numbers, target);
        out.println(Arrays.toString(a.calculate()));
        
        numbers= new int[]{3,2,4};
        target = 6;
        a.setData(numbers, target);
        out.println(Arrays.toString(a.calculate()));

        numbers= new int[]{3,3};
        target = 6;
        a.setData(numbers, target);
        out.println(Arrays.toString(a.calculate()));
    }
}
;