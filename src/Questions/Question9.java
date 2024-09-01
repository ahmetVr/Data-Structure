package Questions;

public class Question9 {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        String result = "";
        int nlen = needle.length();
        int hlen = haystack.length();
        if(hlen == 1 && nlen == 1) {
            return 0;
        }
        for(int i = 0; i < hlen-nlen+1; i++) {
            result = haystack.substring(i,i+nlen);
            if(result.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
