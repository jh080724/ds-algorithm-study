package recursive;

public class RecursiveBasic {

    // 재귀함수는 항상 종료 조건이 필요하다.
    public static void recursive(int n) {
        if(n==0) return;
        recursive(n-1);    //함수 스택에 들어 잇는 순서대로 pop 되면서 n이 출력되면서 종료된다.
        System.out.print(n);
    }

    public static int factorial(int n) {
        if(n == 1) return 1;
        int result = n * factorial(n - 1);
        return result;
    }

    public static void main(String[] args) {

//        recursive(3);
        int fac = factorial(5);
        System.out.println(fac);
    }
}
