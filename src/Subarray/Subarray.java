package Subarray;

public class Subarray {
    public int[] maxSubarray(int... array) {
        int maxSum = -1;
        int sum = 0;
        int leftIndex = 0;
        int currentLeftIndex = 0;
        int rightIndex = -1;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum > maxSum) {
                maxSum = sum;
                leftIndex = currentLeftIndex;
                rightIndex = i;
            } else if (sum < 0) {
                currentLeftIndex = i + 1;
                sum = 0;
            }
        }
        int[] result;
        if (rightIndex == -1) result = new int[] {};
        else if (leftIndex == rightIndex) result = new int[]{leftIndex};
        else result = new int[]{leftIndex, rightIndex};
        return result;
    }
}
