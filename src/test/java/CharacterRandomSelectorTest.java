import model.Character;
import model.CharacterRandomSelector;
import model.EyeColour;
import model.Gender;
import model.HairColour;



import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterRandomSelectorTest {

    @Test
    void randomCharacterSelectIsAlwaysValid() {

//        List<model.Character> characters = factory.loadCharacters();
        List<model.Character> characters = List.of(

                new model.Character("John",HairColour.BLACK,EyeColour.BROWN,false,true, Gender.MALE,false),
                new model.Character("Jim",HairColour.BLACK,EyeColour.BLUE,false,false,Gender.MALE,true),
                new model.Character("Aisha", HairColour.RED, EyeColour.BLUE,true,false,Gender.FEMALE,false)
        );

        CharacterRandomSelector randomSelector = new CharacterRandomSelector();
        for (int i = 0; i < 30; i++){
            Character result = randomSelector.selectRandomCharacter(characters);
            assertTrue(characters.contains(result));
        }
    }

}