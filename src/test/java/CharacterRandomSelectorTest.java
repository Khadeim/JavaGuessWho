import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterRandomSelectorTest {

    @Test
    void randomCharacterSelectIsAlwaysValid() {
        CharacterLoader factory = new CharacterLoader();

//        List<Character> characters = factory.loadCharacters();
        List<Character> characters = Arrays.asList(

                new Character("John",HairColour.BLACK,EyeColour.BROWN,false,true,Gender.MALE,false),
                new Character("Jim",HairColour.BLACK,EyeColour.BLUE,false,false,Gender.MALE,true),
                new Character("Aisha",HairColour.RED,EyeColour.BLUE,true,false,Gender.FEMALE,false)
        );

        CharacterRandomSelector randomSelector = new CharacterRandomSelector();
        for (int i = 0; i < 30; i++){
            Character result = randomSelector.selectRandomCharacter(characters);
            assertTrue(characters.contains(result));
        }
    }

}