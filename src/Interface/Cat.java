package Interface;

public class Cat implements IAnimal {


    @Override
    public String voice(int wordCount) {
        String catVoice = "";
        for(int i = 0; i < wordCount; i++) {
           catVoice += " Miav ";
        }
        return catVoice;
    }
}
