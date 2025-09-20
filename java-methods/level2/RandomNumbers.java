import java.util.*;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] nums) {
        int sum = 0, min = nums[0], max = nums[0];
        for (int n : nums) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum / nums.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.println("Numbers: " + Arrays.toString(arr));
        double[] result = findAverageMinMax(arr);
        System.out.println("Average = " + result[0] + ", Min = " + result[1] + ", Max = " + result[2]);
    }
}
