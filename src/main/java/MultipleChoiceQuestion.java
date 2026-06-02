public class MultipleChoiceQuestion implements Question {

    private String typeOfQuestion;
    private String text;
    private String value;

    public MultipleChoiceQuestion (String typeOfQuestion, String text, String value){

        this.typeOfQuestion = typeOfQuestion;
        this.text = text;
        this.value = value;
    }

    @Override
    public boolean isTrueOfCharacter(Character character) {
        switch (typeOfQuestion){
            case "HAIR COLOUR":
                return character.getHairColour().name().equals(value);
            case "EYE COLOUR":
                return character.getEyeColour().name().equals(value);
            case "GENDER":
                return character.getGender().name().equals(value);
            default:
                return false;
        }

    }

    @Override
    public String getText() {
        return text;
    }
}


