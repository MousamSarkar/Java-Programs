public class Prog1 {

    public static void main(String[] args) {

        int N = 752551;
        int p = 5;
        char c = (char) (p + '0');
        int i = 0;
        int[] index = new int[10];
        int t = 0, temp_number;
        String temp;
        int max = 0;

        String number = Integer.toString(N);

        System.out.println(number);

        for (i = 0; i < number.length(); i++) {
            if (number.charAt(i) == c) {
                temp = number;
                temp = temp.substring(0, i) + temp.substring(i + 1);
                temp_number = Integer.parseInt(temp);
                if (temp_number > max) {
                    max = temp_number;
                }

            }
        }
        System.out.println(max);

    }
}