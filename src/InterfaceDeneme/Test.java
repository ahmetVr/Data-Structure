package InterfaceDeneme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
      /*  Audi audi = new Audi();
        audi.enginePower(100);
        audi.numberOfWheels(4);
        audi.modelYear(2022);
        System.out.println("************************");
        Bmw bmw = new Bmw();
        bmw.modelYear(2020);
        bmw.numberOfWheels(2);
        bmw.enginePower(300);  */

        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static  boolean isPalindrome(String s) {
        String lowStr = s.toLowerCase();
        String ans = "";
        if(lowStr.equals("")) {
            return true;
        }else if(lowStr.length() < 2 && Character.isLetter(lowStr.charAt(0)) || Character.isLetter(lowStr.charAt(1))) {
            return false;
        }

        for(int i = 0; i < lowStr.length(); i++) {
            boolean isLetter = Character.isLetter(lowStr.charAt(i));
            if(isLetter) {
                ans += lowStr.charAt(i);
            }
            }
        String check = "";
        for(int i = ans.length()-1; i >= 0; i--) {
             check += ans.charAt(i);
        }

        if(check.equals(ans)) {
            return true;
        }
        return false;
    }
}
