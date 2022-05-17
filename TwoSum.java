/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.*/



import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        
       HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int requiredNum = (int)(target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(nums[i], i);
        }
        return null;
            
    } 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the target value : ");
        int target = sc.nextInt();

        System.out.println("Enter the number of terms you want to enter : ");

        int length = sc.nextInt();

        int [] nums  = new int[length];
        int [] result = new int[2];

        

        System.out.println("\nEnter the values :  ");
        for (int i =0; i<length; i++) {
            nums[i] = sc.nextInt();
        }
            
        TwoSum ob = new TwoSum();

        result = ob.twoSum(nums, target);

        System.out.println("\nThe values are : "+Arrays.toString(result));

    }
    
}

