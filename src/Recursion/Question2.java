package Recursion;

public class Question2 {
    public static void main(String[] args) {
        System.out.println(count8(8188 ));
        System.out.println(count8Hard(0));

        /*
        8 = 1
        818 = 2
        8088 = 4
        81238 = 2
        8101 = 1
        8818 = 4
        1818188 = 5
        88888 = 9
         */
    }

    public static int count8(int num) {
        //BaseCase
        //GeneralCase

        if(num == 0) {
            return 0;
        }
        if(num % 10 == 8) {
            return count8(num/10) + 1;
        }

        return count8(num/10);
    }

    public static int count8Hard(int num) {
        //BaseCase
        //GeneralCase
        if(num == 0) {
            return 0;
        }

        if(num % 10 == 8) {
            if((num/10) % 10 == 8) {
                return count8Hard(num/10) + 2;
            }
            return count8Hard(num/10) + 1;
        }

        return count8Hard(num/10);
    }
}
