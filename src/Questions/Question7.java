package Questions;

public class Question7 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        sortSentence(s);
        System.out.println(s);
    }

    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String ans = "";

        for(int i = 0; i < str.length; i++) {
           for(int k = 0; k < str.length; k++) {
               int c = Integer.parseInt(String.valueOf(str[k].charAt(str[k].length()-1)));
               String add = str[k].substring(0,str[k].length()-1);
               if(c == i+1) {
                   ans += add + " ";
               }
           }
        }
        return ans;
    }
}
