import model.Character;
import model.CharacterLoader;
import model.EyeColour;
import model.HairColour;


import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class charactersCsvTest {

    @Test
    void loadAllCharactersFromCsv(){

        List<model.Character> characters = CharacterLoader.loadCharacters();
        assertEquals(24, characters.size());
    }

    @Test
    void emptyListPrevention(){

        List<Character> characters = CharacterLoader.loadCharacters();
        assertFalse(characters.isEmpty());

    }

    @Test
    void loadFirstCharacterFromCsv(){

        List<model.Character> characters = CharacterLoader.loadCharacters();
        model.Character firstCharacter = characters.getFirst();

        assertEquals("John", firstCharacter.getName());
        assertEquals(HairColour.BROWN, firstCharacter.getHairColour());
        assertEquals(EyeColour.BLUE, firstCharacter.getEyeColour());
    }



}
