package Recursion;

public class Recursion2 {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
    public static int factorial(int num) { // 1 2 6 24 120
        if(num == 0) {
            return 1;
        }

        return num * factorial(num-1);
    }
}
