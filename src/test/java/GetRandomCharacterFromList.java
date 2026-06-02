import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetRandomCharacterFromList {

    @Test
    void GetRandomCharacterFromList(){
        CharacterLoader factory = new CharacterLoader();

//        List<Character> characters = factory.loadCharacters();
        List<Character> characters = Arrays.asList(

                new Character("John",null,null,false,false,null,false),
                new Character("Jim",null,null,false,false,null,false),
                new Character("Aisha",null,null,false,false,null,false)
        );

//        CharacterRandomSelector random = new selectRandomCharacter(characters);
//        Character randomResult = random.selectRandomCharacter(characters);

        assertTrue(characters.contains(randomResult));
    }

}