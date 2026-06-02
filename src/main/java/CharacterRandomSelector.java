import java.util.List;
import java.util.Random;

public class CharacterRandomSelector {

    public Random randomSelect = new Random();

    public Character selectRandomCharacter(List<Character> characters){
        return characters.get(randomSelect.nextInt(characters.size()));
    }
}
