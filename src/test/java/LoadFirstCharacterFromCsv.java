import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoadFirstCharacterFromCsv {

    @Test
    void loadAllCharactersFromCsv(){
        CharacterLoader factory = new CharacterLoader();

        List<Character> characters = factory.loadCharacters();

        Character firstCharacter = characters.get(0);


        assertEquals("John", firstCharacter.getName());
        assertEquals(HairColour.BROWN, firstCharacter.getHairColour());
        assertEquals(EyeColour.BLUE, firstCharacter.getEyeColour());
    }


}
