import java.util.*;

public class Board {

    private List<Character> characters;

    public Board(List<Character> characters) {
        this.characters = characters;
    }

    public int remainingCount(){
        return characters.size();
    }

    public List<Character> getRemainingCharacters(){
        return characters;
    }

    public boolean isEmpty(){
        return characters.isEmpty();
    }

    public void eliminateCharacters(Question question, boolean answer) {
        for (int i = characters.size() - 1; i >= 0; i--) {

            Character character = characters.get(i);

            if (question.isTrueOfCharacter(character) != answer) {
                characters.remove(i);
            }
        }
    }
}








