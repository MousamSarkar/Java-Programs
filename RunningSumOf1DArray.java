/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].*/


import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {

        // int nums[] = { 0, 1, 4, 6, 7, 10 };
        int nums[] = { 4, 7, 10 };
        // int nums[] = { 4, 5, 6, 7, 8, 9 };

        RunningSumOf1DArray object = new RunningSumOf1DArray();

        int [] runSum = object.runningSum(nums);

        System.out.println(Arrays.toString(runSum));
    }

    /*3ms */
    public int[] runningSum(int[] nums) {
        int [] store = new int[nums.length];
        for(int i = 0; i<nums.length;i++)
        {
            for(int j = 0; j<=i;j++)
            {
                store[i] += nums[j];
            }
        }
        return store;
    }

    //*0ms and O(n) complexity */
    // public int[] runningSum(int[] nums) {
    //     for(int i = 1; i < nums.length; i++)
    //         nums[i] += nums[i - 1];
    //     return nums;
    // }
}

