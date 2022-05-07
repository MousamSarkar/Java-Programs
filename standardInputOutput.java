import java.util.Scanner;

public class standardInputOutput {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        
        sc.close();
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}