public class PowerOfTwo {

    public static int powersOf2(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println("else if "+1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println("else "+curr);
            return curr;
        }
    }

    public static void main(String[] args) {
        powersOf2(4);
    }
}
