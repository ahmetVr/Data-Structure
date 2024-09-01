package Recursion;

public class Recursion1 {
    public static void main(String[] args) {
        System.out.println(fıboRec(100));
        System.out.println(fıboIteratıve(5));
    }
    public static int fıboIteratıve(int x) { // 1 1 2 3 5 8 13 21
        int currentFıb = 1;
        int prevFıb = 1;
        if(x == 0 || x == 1) {
            return 1;
        }else {
            for(int i = 0; i < x-1; i++) { // ındex = 4, answ = 5   // ı < 3 // p = 3 , c= 5
                int tmp = currentFıb;
                currentFıb = currentFıb + prevFıb;
                prevFıb = tmp;
            }
        }
        return currentFıb;
    }

    public static int fıboRec(int x) {
        //Base Case
        if (x <= 1) {
            return 1;
        }
        //General Case
        return fıboRec(x-1) + fıboRec(x-2);
    }

    // Iteratıve approach
    // Recursıve approach
}
