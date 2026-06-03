package questions;

import model.EyeColour;
import model.Gender;
import model.HairColour;


public class QuestionBuilder {

    public Question createHairQuestion(HairColour hairColour){
        return new MultipleChoiceQuestion(
                "HAIR COLOUR",
                "Is hair colour " + hairColour + "?",
                hairColour.name()
        );

    }

    public Question createEyeColourQuestion(EyeColour eyeColour){
        return new MultipleChoiceQuestion(
                "EYE COLOUR",
                "Is eye colour " + eyeColour + "?",
                eyeColour.name()
        );
    }

    public Question createGenderQuestion(Gender gender){
        return new MultipleChoiceQuestion(
                "GENDER",
                "Is gender " + gender + "?",
                gender.name()
        );
    }

    public Question createHatQuestion() {
        return new BooleanQuestion(
                "HAT",
                "Does the character wear a hat"
        );
    }

    public Question createGlassesQuestion(){
        return new BooleanQuestion(
                "GLASSES",
                "Does the character wear glasses?"

        );

    }

    public Question createFacialHairQuestion(){
        return new BooleanQuestion(
                "FACIAL HAIR",
                "Does the character have facial hair"

        );
    }
}
