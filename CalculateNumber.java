package number_package;

import java.util.HashMap;
import java.util.Map;

public class CalculateNumber {
    private int[] arr;
    private int target;

    public CalculateNumber(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    // No Args Constructor
    public CalculateNumber() {
    }

    public void setData(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    public int[] calculate() {
        int size = this.arr.length;
        int target = this.target;
        Map<Integer,Integer> complementMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int complement = target - arr[i];
            if (complementMap.containsKey(complement)) {
                return new int[] {complementMap.get(complement), i};
            }
            complementMap.put(arr[i], i);
        }
        return new int[0];
    }
}
