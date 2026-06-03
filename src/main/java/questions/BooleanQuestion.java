package questions;

import model.Character;

public class BooleanQuestion implements Question {

    private String typeOfQuestion;
    private String text;

    public BooleanQuestion (String typeOfQuestion, String text){

        this.typeOfQuestion = typeOfQuestion;
        this.text = text;
    }

    @Override
    public boolean isTrueOfCharacter(Character character) {
        switch (typeOfQuestion){
            case "GLASSES":
                return character.wearsGlasses();
            case "HAT":
                return character.hasHat();
            case "FACIAL HAIR":
                return character.facialHair();
            default:
                return false;
        }
    }

    @Override
    public String getText() {
        return text;
    }
}
