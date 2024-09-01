package Recursion;

public class Question5 {
    public static void main(String[] args) {
        String str1 = "catcowcacat";
        String str2 = "cat";
        int num = 2;
        System.out.println(strCopies(str1,str2,num));
        System.out.println(strDist(str1,str2));
    }
    /*
     Given a string and a non-empty substring sub, compute recursively if at least
     n copies of sub appear in the string somewhere, possibly with overlapping. N will be non-negative.

     strCopies("catcowcacat", "cat", 2) → true

     strCopies("catcowcat", "cow", 2) → false

     strCopies("catcowcat", "cow", 1) → true
     */

    public static boolean strCopiesIterative(String str1,String str2,int num) { // xcatb
        int count = 0;
        for(int i = 0; i < str1.length()-2; i++) {
            String tmp = str1.substring(i,i+3);
             if(tmp.equals(str2)) {
                 count++;
             }
        }
        if(count >= num) {
            return true;
        }
        return false;
    }


    public static boolean strCopies(String str1,String str2,int num) {
       if (num == 0) {
           return true;
       }
       if (str1.length() < str2.length()) {
           return false;
       }
       String ans = str1.substring(0,3);
       if(ans.equals(str2)) {
           return strCopies(str1.substring(1),str2,num-1);
       }
       return strCopies(str1.substring(1),str2,num);
    }
    public static int strDist(String str1,String str2) {
        if (str1.length() < str2.length()) {
            return 0;
        }
        String ans = str1.substring(0,str2.length());
        //ccatcatkskskskskskcatnvvv
        if(ans.equals(str2) && str1.substring(str1.length()-str2.length()).equals(str2)) {
            return str1.length();
        }
        if (!str1.substring(0,str2.length()).equals(str2)) {
            return strDist(str1.substring(1),str2);
        }
        return strDist(str1.substring(0,str1.length()-1), str2);

    }
    /*
     Given a string and a non-empty substring sub,
     compute recursively the largest substring which starts and ends with sub and return its length.
     strDist("catcowcat", "cat") → 9

    strDist("catcowcat", "cow") → 3

    strDist("catcatcowcatxx", "cat") → 9
     */
}
