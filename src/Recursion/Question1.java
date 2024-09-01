package Recursion;

public class Question1 {
    public static void main(String[] args) {
        System.out.println(sumDigit(126));
    }

    public static int sumDigit(int num) {
        // BaseCase
        //GeneralCase
        if(num == 0) {
            return 0;
        }
        return num%10 + sumDigit(num/10);
    }
}
