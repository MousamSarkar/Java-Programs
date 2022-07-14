import java.util.LinkedHashMap;

public class RomanToIntegerModified {
    static int romanToInt(String s) {

        LinkedHashMap<Character, Integer> romanList = new LinkedHashMap<>();

        romanList.put('I', 1);
        romanList.put('V', 5);
        romanList.put('X', 10);
        romanList.put('L', 50);
        romanList.put('C', 100);
        romanList.put('D', 500);
        romanList.put('M', 1000);

        int length = s.length();
        int sum = romanList.get(s.charAt(length - 1));

        for (int i = length - 2; i >= 0; i--) {
            if (romanList.get(s.charAt(i)) < romanList.get(s.charAt(i + 1)))
                sum -= romanList.get(s.charAt(i));
            else {
                sum += romanList.get(s.charAt(i));
            }
        }

        return sum;

    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("\nEnter the value : ");
        // String string = sc.nextLine();

        String s = "MCMXCIV";
        int value = romanToInt(s);

        System.out.println(value);
    }

}
