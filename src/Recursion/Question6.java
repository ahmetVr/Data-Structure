package Recursion;

public class Question6 {
    public static void main(String[] args) {
        System.out.println(calcPow2(2,3));
    }

    public static int calcPow(int num,int power) { // 3 4
        if(power == 1) {
            return num;
        }
        return num * calcPow(num,power-1);
    }

    public static int calcPow2(int num,int power)  {
        int tmp = num;
        for(int i = 0; i < power; i++) {
            num = num * tmp;
        }
        return num;
    }
}
