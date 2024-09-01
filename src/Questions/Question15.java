package Questions;

public class Question15 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        flipAndInvertImage(image);
        for(int i = 0; i < image.length; i++) {
            for(int k = 0; k < image[i].length; k++) {
                System.out.print(image[i][k] + " ");
            }
            System.out.println();
        }
    }
    /*
    1, 1, 0, 0
    1, 0, 0, 1
    0, 1, 1, 1
    1, 0, 1, 0
     */
    public static int[][] flipAndInvertImage(int[][] image) {
      for(int i = 0; i < image.length; i++) {
          int idx = 0; int len = image[i].length-1;
          while(idx <= len) {
              int tmp = image[i][idx];
              image[i][idx] = image[i][len];
              image[i][len] = tmp;
              idx++;
              len--;
          }
      }
      for (int i = 0; i < image.length; i++) {
          for(int k = 0; k < image[i].length; k++) {
              if(image[i][k] == 0) {
                  image[i][k] = 1;
              }else {
                  image[i][k] = 0;
              }
          }
      }
      return image;
    }
}
