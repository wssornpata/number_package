package number_package;

public class CalculateNumber implements CalculateNumberInterface {
    private int[] arr;
    private int target;

    public CalculateNumber(int[] arr, int target){
        this.arr = arr;
        this.target = target;
    }

    //No Args Constructor
    public CalculateNumber(){}

    @Override
    public void setData(int[] arr,int target){
        this.arr = arr;
        this.target = target;
    }

    @Override
    public int[] calculate(){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = (i+1); j < size; j++) {
                if((arr[i]+arr[j]) == target){
                    return new int[]{i,j};
                }
            }
            
        }
        return new int[0];
    }
}
