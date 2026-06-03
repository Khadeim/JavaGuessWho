import game.GameLogic;
import game.Board;
import model.Character;
import model.CharacterLoader;
import model.CharacterRandomSelector;
import model.EyeColour;
import model.Gender;
import model.HairColour;
import questions.MultipleChoiceQuestion;
import questions.QuestionBuilder;
import questions.BooleanQuestion;
import questions.Question;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BooleanQuestionTest {

    BooleanQuestion hasGlassesQuestion = new BooleanQuestion("GLASSES", "Does the character have glasses?");
    BooleanQuestion hasHatQuestion = new BooleanQuestion("HAT", "Does the character have a hat?");
    BooleanQuestion hasFacialHairQuestion = new BooleanQuestion("FACIAL HAIR", "Does the character have facial hair?");

    @Test
    void returnCorrectBooleanForHasGlassesYes(){
        Character Jameela = new Character("Jameela", HairColour.BLACK, EyeColour.BROWN, true, false, Gender.FEMALE, false);
        assertTrue(hasGlassesQuestion.isTrueOfCharacter(Jameela));
    }

    @Test
    void returnCorrectBooleanForHasGlassesNo(){
        Character Jameela = new Character("Jameela", HairColour.BLACK, EyeColour.BROWN, false, false, Gender.FEMALE, false);
        assertFalse(hasGlassesQuestion.isTrueOfCharacter(Jameela));
    }

    @Test
    void returnCorrectBooleanForHasHatYes(){
        Character Java = new Character("Java", HairColour.RED, EyeColour.BLUE, true, true, Gender.FEMALE, false);
        assertTrue(hasHatQuestion.isTrueOfCharacter(Java));
    }

    @Test
    void returnCorrectBooleanForHasHatNo(){
        Character Java = new Character("Java", HairColour.RED, EyeColour.BLUE, true, false, Gender.FEMALE, false);
        assertFalse(hasHatQuestion.isTrueOfCharacter(Java));
    }

    @Test
    void returnCorrectBooleanForHasFacialHairYes(){
        Character Mercator = new Character("Mercator", HairColour.BROWN, EyeColour.HAZEL, true, false, Gender.MALE, true);
        assertTrue(hasFacialHairQuestion.isTrueOfCharacter(Mercator));
    }

    @Test
    void returnCorrectBooleanForHasFacialHairNo(){
        Character Mercator = new Character("Mercator", HairColour.BROWN, EyeColour.HAZEL, true, false, Gender.MALE, false);
        assertFalse(hasFacialHairQuestion.isTrueOfCharacter(Mercator));
    }
}



















