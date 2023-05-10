public class Prog2 {

    public static void main(String[] args) {

        String binary_number = "100";
        int start_index = 0;
        boolean check = true;
        int iterations = 0;

        char[] num_char = new char[binary_number.length()];

        if (binary_number.isEmpty())
            System.out.println("No steps ");
        else {
            for (int i = 0; i < binary_number.length(); i++) {
                num_char[i] = binary_number.charAt(i);

                if (check) {
                    if (binary_number.charAt(i) == '1') {
                        start_index = i;
                        check = false;
                    }
                }
            }

            for (int j = num_char.length - 1; j >= start_index; j--) {
                if (num_char[j] == '0') {
                    iterations += 1;
                } else {
                    iterations += 2;
                }
            }
            System.out.println(iterations - 1);
        }

    }
}
