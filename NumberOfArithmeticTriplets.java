import java.util.Scanner;

public class NumberOfArithmeticTriplets {

    /* 1ms method */
    public int arithmeticTriplets(int[] nums, int diff) {

        int a, i, j, k;
        int length = nums.length;
        int numberOfTriplets = 0;

        for (a = length - 1; a >= 0; a--) {

            j = isPresent(nums, (nums[a] - diff));
            if (j >= 0) {
                i = isPresent(nums, (nums[j] - diff));
                if (i >= 0) {
                    numberOfTriplets += 1;
                }
            }

        }
        return numberOfTriplets;

    }

    public int isPresent(int[] nums, int value) {

        int flag = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (value == nums[i]) {
                flag = i;
                break;
            }
        }
        return flag;
    }

    // ** 0ms method */
    // public int arithmeticTriplets(int[] nums, int diff) {
    // boolean[] visited = new boolean[101];

    // for (int num : nums) {
    // visited[num] = true;
    // }

    // int result = 0;

    // for (int i = diff; i <= 100 - diff; ++i) {
    // if (visited[i] && visited[i - diff] && visited[i + diff])
    // ++result;
    // }

    // return result;
    // }

    public static void main(String[] args) {

        // int nums[] = { 0, 1, 4, 6, 7, 10 };
        int nums[] = { 4, 7, 10 };
        // int nums[] = { 4, 5, 6, 7, 8, 9 };
        int diff = 3;
        NumberOfArithmeticTriplets object = new NumberOfArithmeticTriplets();

        int numberOfTriplets = object.arithmeticTriplets(nums, diff);

        System.out.println(numberOfTriplets);
    }
}