package Interface;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.voice(3));
        System.out.println(cat.voice(3));
    }
}
