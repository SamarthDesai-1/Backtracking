public class ReverseInteger {

    public static void main(String[] args) {
        int n = 132;
        boolean sign = true;
        if (n < 0) {
            sign = false;
        }

        n = Math.abs(n);
        long reverse = 0;
        while (n > 0) {
            reverse = (reverse * 10) + (n % 10);
            n /= 10;
            if (reverse > Integer.MAX_VALUE) {
                System.out.println(0);
            }
        }

        if (sign == false) {
            System.out.println(-1 * (int) reverse);
        }

        System.out.println((int) reverse);

    }
}
