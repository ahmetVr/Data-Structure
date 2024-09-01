package Recursion;

public class Question3 {
    public static void main(String[] args) {
        int[] num = {22,2,22,0,22,2,22,1};
    //   inc(num);
      //  System.out.println(num[0]);
        int x = 1;
      x =  newNum(x);
        System.out.println(x);

       //  System.out.println(num[0]);
        //System.out.println(array22(num,0));
       // System.out.println(array22(num));
    }
    public static void inc(int[] num) {
        num[0] = num[0] + 1;
    }
    public static int array22(int[] num) {
        //BaseCase
        //GeneralCase
        if(num.length == 0) {
            return 0;
        }
        int number0 = num[0];

        int[] tmp = new int[num.length - 1];
        for (int i = 1; i < num.length;i++ ) {
            tmp[i-1] = num[i];
        }
        num = tmp;

        if(number0 == 22) {
            return array22(num) + 1;
        }
        return array22(num);
    }

    public static int newNum(int x) {
        return x+1;
    }
}
