package logics;

public class MinMax {

    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
//        int sum = 0;
//        for (int i = 0; i < max; i++) {
//            sum += i;
//        }
//        System.out.println(sum);//1073741825
        int a = f(5);
        System.out.println(a);
    }

    //Recursive Runtimes

    static int f(int n) {
        if (n <= 1) {
            return 1;
        }
        int a = 10, b = 20;
        return f(n - 1) + f(n - 1);

    }
//1,2,4,8,16

    //page no 56
}