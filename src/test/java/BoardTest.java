import game.Board;
import model.Character;
import model.EyeColour;
import model.Gender;
import model.HairColour;
import org.junit.jupiter.api.Test;
import questions.MultipleChoiceQuestion;
import questions.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BoardTest {

    @Test
    void eliminateCharactersCorrectly() {
        Character John = new Character("John", HairColour.BLACK, EyeColour.BLUE, false, false, Gender.MALE,true );
        Character Aisha = new Character("Aisha", HairColour.BROWN, EyeColour.BROWN, true, false, Gender.FEMALE,false );
        Character Bob = new Character("Bob", HairColour.BLONDE, EyeColour.HAZEL, false, true, Gender.MALE,true );

        List<Character> characters = new ArrayList<>(Arrays.asList(John, Aisha, Bob));

        Board board = new Board(characters);

        Question question = new MultipleChoiceQuestion(
                "HAIR COLOUR",
                "Is hair colour BLACK?",
                HairColour.BLACK.name()
        );

        board.eliminateCharacters(question, true);

        assertEquals(1, board.remainingCount());
        assertEquals("John", board.getRemainingCharacters().getFirst().getName());


    }

    @Test
    void questionDoesntApply() {
        Character John = new Character("John", HairColour.BLACK, EyeColour.BLUE, false, false, Gender.MALE,true );
        Character Aisha = new Character("Aisha", HairColour.BROWN, EyeColour.BROWN, true, false, Gender.FEMALE,false );
        Character Bob = new Character("Bob", HairColour.BLONDE, EyeColour.BLUE, false, true, Gender.MALE,true );

        List<Character> characters = new ArrayList<>(Arrays.asList(John, Aisha, Bob));

        Board board = new Board(characters);

        Question question = new MultipleChoiceQuestion(
                "EYE COLOUR",
                "Is eye colour HAZEL?",
                EyeColour.HAZEL.name()
        );

        board.eliminateCharacters(question, true);
        assertTrue(board.isEmpty());


    }
}
