/*
 * Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.

Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0
 */



public class FindPivotIndex {
    public static void main(String[] args) {

        // int nums[] = { 0, 1, 4, 6, 7, 10 };
        // int nums[] = { 2, 1, -1 };
        int nums[] = {1,7,3,6,5,6};
        // int nums[] = { 4, 5, 6, 7, 8, 9 };

        FindPivotIndex object = new FindPivotIndex();

        int  index = object.pivotIndex(nums);

        System.out.println(index);
    }

    /*361ms */
    public int pivotIndex(int[] nums) {
        int sumLeft=0, sumRight=0;
        int index=0;
        for(int i = 0; i<nums.length;i++){
            sumLeft=0;
            sumRight=0;
            if(i==0){
                sumLeft = 0;
            }
            else{
                for(int k=i-1; k>=0;k--)
                    sumLeft += nums[k];
            }
            for(int j =i+1; j<nums.length;j++)
                sumRight += nums[j];
            if(sumLeft == sumRight){
                index = i;
                break;
            }
            else
                index=-1;
        }
        return index;
    }

    /*3ms solution */
    // public int pivotIndex(int[] nums) {
    //     int leftsum = 0;
    //     int sum = 0;
    //     for(int num: nums) sum+=num;
    //     for(int i=0; i<nums.length; i++) {
    //         if(leftsum == sum - nums[i] - leftsum) {
    //             return i;
    //         }
    //         leftsum += nums[i];
    //     }
    //     return -1;
    // }
}
