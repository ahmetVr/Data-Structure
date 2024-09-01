package Recursion;

public class RecursionDeneme {
    public static void main(String[] args) {
      //  System.out.println(fiboIterative(3));
      //  System.out.println( fiboRec(3));
      //  System.out.println(sumDigit(126));
      //  System.out.println(count8(8188));
      //    System.out.println(count8Hard(88888));
        int[] arr = {22,2,22,0,22,2,22,1,22,2,22,22};
        System.out.println(arr22(arr));
        String str = "xxcdexxfgx"; //cdefgxxxxx
        System.out.println(endX(str));
        System.out.println(calPow(2,4));
        System.out.println(calcPowIterative(2,6));
    }

    public static int fiboIterative(int x) { // 1 1 2 3 5 8 13 21 34
       int currentFib = 1;
       int prevFib = 1;
       if(x == 0 || x == 1) {
           return 1;
       }else {
           for(int i = 0; i < x-1; i++) {
               int tmp = currentFib;
               currentFib = currentFib + prevFib;
               prevFib = tmp;
           }
       }
       return currentFib;
    }

    public static int fiboRec(int x) {
        if(x == 0 || x == 1) {
            return 1;
        }

        return fiboRec(x-1) + fiboRec(x-2);
    }

    public static  int sumDigit(int num) {
        if(num <= 0) {
            return 0;
        }
        return num % 10 + sumDigit(num/10);
    }

    public static int count8(int x) { // 8188
        if(x == 0) {
            return 0;
        }
        if(x % 10 == 8) {
            return count8(x/10) + 1;
        }
        return count8(x/10);
    }

    public static int count8Hard(int x) {
        if(x == 0) {
            return 0;
        }

        if(x % 10 == 8) {
            if(x/10 % 10 == 8) {
                return count8Hard(x / 10) + 2;
            }
            return count8Hard(x/10) + 1;
        }
        return count8Hard(x/10);
    }

    public static int arr22(int[] num) {
        if(num.length == 0) {
            return 0;
        }
        int number0 = num[0];
        int[] tmp = new int[num.length-1];
        for(int i = 1; i < num.length; i++) {
            tmp[i-1] = num[i];
        }
       num = tmp;

        if(number0 == 22) {
            return arr22(num) + 1;
        }
        return arr22(num);
    }

    public static String endX(String str) {
        if(str.length() == 0) {
            return "";
        }
        if(str.charAt(0) == 'x') {
            return endX(str.substring(1)) + 'x';
        }
        return str.charAt(0) + endX(str.substring(1));
    }

    public static int calPow(int num,int pow) {
        if(pow <= 1) {
            return num;
        }
        return num * calPow(num,pow-1);
    }

    public static int calcPowIterative(int num,int pow) {

        int tmp = num;
        for(int i = 1; i < pow; i++) {
            num = num * tmp;
        }
        return num;
    }
}

