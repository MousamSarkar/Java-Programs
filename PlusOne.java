import java.util.Arrays;

public class PlusOne {

    // public static int[] plusOne(int[] digits) {

    // int i, j;
    // double value = 0;
    // int k = 0, p = 0;
    // int[] temp;
    // int[] temp2 = new int[digits.length + 1];

    // for (i = 0; i < digits.length; i++) {
    // value = (value * 10) + digits[i];
    // }

    // value += 1;

    // String s = String.valueOf(value);

    // while (value != 0) {
    // temp2[k] = (int) Math.floor(value % 10);
    // value = (int) Math.floor(value / 10);
    // k++;

    // }

    // temp = new int[k];
    // for (j = k - 1; j >= 0; j--) {
    // temp[p] = temp2[j];
    // p++;
    // }
    // return temp;

    // }

    // public static int[] plusOne(int[] digits) {

    // int i = 0;
    // int[] temp = new int[digits.length + 1];

    // digits[digits.length - 1] += 1;

    // for (i = digits.length - 1; i >= 0; i--) {
    // if (digits[i] == 10 && i != 0) {
    // digits[i] = 0;
    // digits[i - 1] += 1;
    // }

    // }
    // if (digits[0] == 10) {
    // temp[0] = 1;
    // for (int k = 1; k <= digits.length; k++) {
    // temp[k] = 0;
    // }
    // return temp;
    // }

    // return digits;
    // }

    public static int[] plusOne(int[] digits) {
        int k = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + k;
            k = sum / 10;
            digits[i] = sum % 10;
        }
        if (k == 1) {
            int a[] = new int[digits.length + 1];
            a[0] = 1;
            return a;
        }
        return digits;
    }

    public static void main(String[] args) {

        // int[] nums = { 6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3 };
        int[] nums = { 9, 9 };
        int[] NumberOfElements;
        // PlusOne object = new PlusOne();

        NumberOfElements = plusOne(nums);

        System.out.println(Arrays.toString(NumberOfElements));
    }

    public static int[] plusOne1(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
