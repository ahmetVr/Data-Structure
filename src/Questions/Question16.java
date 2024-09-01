package Questions;

public class Question16 {
    public static void main(String[] args) {
        String[] word1 = {"a","cb","brdm"};
        String[] word2 = {"a","c","b","brd","m"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String result1 = "";
      String result2 = "";
      for(String str1 : word1) {
          result1 += str1;
      }
      for(String str2 : word2) {
          result2 += str2;
      }
      return result1.equals(result2);
    }
}
