import java.util.ArrayList;
import java.util.Arrays;

class RomanToInteger {
    static int romanToInt(String s) {

        int sum = 0;
        String[] romanSplit = s.split("");

        ArrayList<String> romanList = new ArrayList<String>(Arrays.asList(romanSplit));

        // for(String t : romanList)
        // System.out.println(t);

        for (int i = 0; i < romanList.size(); i++) {
            if (romanList.get(i).equals("I")) {

                if ((i + 1) < romanList.size()) {
                    if (romanList.get(i + 1).equals("V")) {
                        sum = sum + 4;
                        i++;
                        continue;
                    }
                    if (romanList.get(i + 1).equals("X")) {
                        sum = sum + 9;
                        i++;
                        continue;
                    } else {
                        sum = sum + 1;
                    }
                } else {
                    sum = sum + 1;
                }
            }
            if (romanList.get(i).equals("V"))
                sum = sum + 5;

            // if (romanList.get(i).equals("X"))
            // sum = sum + 10;

            if (romanList.get(i).equals("X")) {
                if ((i + 1) < romanList.size()) {
                    if (romanList.get(i + 1).equals("L")) {
                        sum = sum + 40;
                        i++;
                        continue;
                    }
                    if (romanList.get(i + 1).equals("C")) {
                        sum = sum + 90;
                        i++;
                        continue;
                    } else {
                        sum = sum + 10;
                    }
                } else {
                    sum = sum + 10;
                }
            }

            if (romanList.get(i).equals("L"))
                sum = sum + 50;

            if (romanList.get(i).equals("C")) {
                if ((i + 1) < romanList.size()) {
                    if (romanList.get(i + 1).equals("D")) {
                        sum = sum + 400;
                        i++;
                        continue;
                    }
                    if (romanList.get(i + 1).equals("M")) {
                        sum = sum + 900;
                        i++;
                        continue;
                    } else {
                        sum = sum + 100;
                    }
                } else {
                    sum = sum + 100;
                }
            }

            if (romanList.get(i).equals("D"))
                sum = sum + 500;

            if (romanList.get(i).equals("M"))
                sum = sum + 1000;

        }

        return sum;
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("\nEnter the value : ");
        // String string = sc.nextLine();

        String s = "CM";
        int value = romanToInt(s);

        System.out.println(value);
    }
}