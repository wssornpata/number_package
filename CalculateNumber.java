package number_package;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CalculateNumber implements CalculateNumberInterface {
    private int[] arr;
    private int target;

    public CalculateNumber(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    // No Args Constructor
    public CalculateNumber() {
    }

    @Override
    public void setData(int[] arr, int target) {
        this.arr = arr;
        this.target = target;
    }

    @Override
    public int[] calculate() {
        int size = this.arr.length;
        int target = this.target;
        List<Integer> output = new LinkedList<>();
        Map<Integer, Queue<Integer>> complementMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int complement = target - arr[i];
            if (complementMap.containsKey(complement)) {
                Queue<Integer> complementList = complementMap.get(complement);
                output.add(complementList.poll());
                output.add(i);
            }
            complementMap.computeIfAbsent(arr[i], k -> new LinkedList<>()).add(i);
        }
        return output.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
