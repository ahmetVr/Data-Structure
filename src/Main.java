public class Main {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        s = s.trim();
        String[] str = s.split("[ !,?._'@]+");
        if(s.length() < 1) {
            System.out.println("0");
            return;
        }else {
            System.out.println(str.length);
            for(String s2 : str) {
                System.out.println(s2);
            }
        }

    }
}