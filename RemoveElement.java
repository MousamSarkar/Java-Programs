public class RemoveElement {

    // public int removeElement(int[] nums, int val) {

    // int i, j;
    // int check;
    // int counter = nums.length;

    // for (i = 0; i < counter; i++) {
    // check = i;
    // if (nums[i] == val) {
    // for (j = i; j < nums.length - 1; j++) {
    // nums[j] = nums[j + 1];
    // }
    // counter--;
    // if (i >= 0)
    // i--;
    // // if (i < check)
    // // break;
    // }

    // }
    // if (counter == 1 && nums[0] == val)
    // counter--;

    // // Printing new array
    // for (int a : nums) {
    // System.out.println(a);
    // }
    // return counter;
    // }

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                // reason why use nums[j++]=nums[i] is because t
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 2, 3 };
        int val = 2;
        RemoveElement object = new RemoveElement();

        int NumberOfElements = object.removeElement(nums, val);

        System.out.printf("\n total elements : %d", NumberOfElements);
    }

}
