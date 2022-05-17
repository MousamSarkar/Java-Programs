import java.util.Scanner;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        int a = x, s = 0;

        if (x < 0)
            return false;

        while (a != 0) {
            s = (s * 10) + (int) (a % 10);
            a = (int) a / 10;
        }
        if (s == x)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the  value : ");
        int value = sc.nextInt();

        PalindromeNumber ob = new PalindromeNumber();

        boolean flag = ob.isPalindrome(value);

        if (flag)
            System.out.println("Yes. Palindrome");
        else
            System.out.println("No, Not a palindrome");
    }
}
