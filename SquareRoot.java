public class SquareRoot {

    // public static int mySqrt(int x) {

    // int value = 0;
    // int odd = 1;
    // while (x > 0) {
    // if (x < odd)
    // break;
    // x = x - odd;
    // odd += 2;
    // value++;
    // }
    // return value;

    // }

    public static int mySqrt(int x) {
        long l = 0;
        long r = x / 2;
        if (x == 0 || x == 1)
            return x;
        while (l <= r) {
            long mid = (l + r) / 2;
            long p = mid * mid;
            if (p == x) {
                return (int) mid;
            } else if (p > x)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return (int) r;
    }

    public static void main(String[] args) {

        int x = 14;

        int value = mySqrt(x);

        System.out.println(value);
    }

}
