import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class LoadAllCharactersFromCsv {

    @Test
    void loadAllCharactersFromCsv(){
        CharacterLoader factory = new CharacterLoader();

        List<Character> characters = factory.loadCharacters();

        assertEquals(24, characters.size());
    }

}
