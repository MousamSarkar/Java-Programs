import java.util.Scanner;

public class PalindromeNumberModified {

    public boolean isPalindrome(int x) {

        int a, s=0;
        
        if(x < 0 || (x != 0 && x % 10 == 0))
            return false;
        
        while(x>s){
            s=(s*10)+(int)(x % 10);
            x=(int)x/10;
        }
        if(s == x || s/10 == x )
            return true;
        else 
            return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the  value : ");
        int value = sc.nextInt();

        PalindromeNumberModified ob = new PalindromeNumberModified();

        boolean flag = ob.isPalindrome(value);

        if (flag)
            System.out.println("Yes. Palindrome");
        else
            System.out.println("No, Not a palindrome");
    }
}
