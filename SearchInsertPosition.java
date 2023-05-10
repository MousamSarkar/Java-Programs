/*
    Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
    
     
    
    Example 1:
    
    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Example 2:
    
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Example 3:
    
    Input: nums = [1,3,5,6], target = 7
    Output: 4
     
    
    Constraints:
    
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int i;
        int val = 0;
        for (i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                val = i;
                break;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (target > nums[nums.length - 1]) {
                val = nums.length;
                break;
            } else if (target > nums[i] && target < nums[i + 1]) {
                val = i + 1;
                break;
            }

        }
        return val;
    }
}