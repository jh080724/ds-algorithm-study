package recursive;

import java.util.Arrays;

public class Fibonacci {

    static int[] fibo;

    public static int fibonacci(int n) {

        if (fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else {
            return fibo[n] = fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void conversionToBinary(int n) {
        // 10진수 n을 2진수로 변환하여 출력하는 로직을 작성.(재귀)
        // 1 <= n <= 1000
        if (n == 0) return;
//        int result = n/2;
//        int result2 = n%2;
//        System.out.println("result = " + result + ", 2: " + result2);
//        if(result == 0) return;
        conversionToBinary(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        //  10 -> 1 1 2 3 5 8 13 21 34 55 ....
//        int n = 45;
//        fibo = new int[n+1];
//        int result = fibonacci(n);
//        System.out.println("result = " + result);
//        System.out.println(Arrays.toString(fibo));
        conversionToBinary(30);
    }
}
