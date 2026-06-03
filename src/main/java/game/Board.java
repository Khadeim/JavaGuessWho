package game;

import model.Character;
import questions.Question;
import java.util.*;


public class Board {

    private List<Character> characters;

    public Board(List<model.Character> characters) {
        this.characters = characters;
    }

    public int remainingCount(){
        return characters.size();
    }

    public List<model.Character> getRemainingCharacters(){
        return characters;
    }

    public boolean isEmpty(){
        return characters.isEmpty();
    }

    public void eliminateCharacters(Question question, boolean answer) {
        for (int i = characters.size() - 1; i >= 0; i--) {

            model.Character character = characters.get(i);

            if (question.isTrueOfCharacter(character) != answer) {
                characters.remove(i);
            }
        }
    }
}








