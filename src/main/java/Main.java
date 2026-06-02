import java.util.List;

public class Main {

    public static void main(String[] args) {
        // CREATE OBJECTS

        CharacterLoader loader = new CharacterLoader();

        List<Character> characters = CharacterLoader.loadCharacters();

        GameLogic gameLogic = new GameLogic(characters);

        gameLogic.startGame();

    }
}



















