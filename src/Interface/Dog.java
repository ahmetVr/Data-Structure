package Interface;

public class Dog extends Class2 implements IAnimal {
    @Override
    public String voice(int wordCount) {
        String dogVoice = "";
        for (int i = 0; i < wordCount; i++) {
            dogVoice += " Hov ";
            super.helloPrint();
        }
        return dogVoice;
    }
    @Override
    String voice2(int wordCount) {
        return null;
    }
}
