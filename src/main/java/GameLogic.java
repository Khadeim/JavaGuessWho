import java.util.*;

public class GameLogic {

    private Board board;
    private Character secretCharacter;
    private QuestionBuilder questionBuilder;
    private Scanner scanner;
    private int attemptsRemaining = 3;

    public GameLogic(List<Character> characters){
        this.board = new Board(characters);

        CharacterRandomSelector characterRandomSelector = new CharacterRandomSelector();

        this.secretCharacter = characterRandomSelector.selectRandomCharacter(characters);

        this.questionBuilder = new QuestionBuilder();
        this.scanner = new Scanner(System.in);

    }

    public void startGame(){
        System.out.println(secretCharacter);

        System.out.println("~~~~~ Welcome to Guess Who! ~~~~~");
        while (attemptsRemaining > 0){

            System.out.println("~~~~~ There are " + board.remainingCount() + " characters, here are their names: ~~~~~");
            for (Character c : board.getRemainingCharacters()){
                System.out.println(c.getName());
            }
            System.out.println("\nPick a question to ask:");
            System.out.println("1. Hair colour");
            System.out.println("2. Eye colour");
            System.out.println("3. Wears glasses");
            System.out.println("4. Has hat");
            System.out.println("5. Gender");
            System.out.println("6. Has facial hair");
            System.out.println("7. Make guess");

            int choice = scanner.nextInt();

            if (choice == 7){
                makeGuess();
                continue;
            }

            if (board.remainingCount() == 1){
                System.out.println("You win!");
                System.out.println("There is only 1 character left.");
                System.out.println("The character was: " + secretCharacter.getName());
                System.exit(0);
            }



            Question question = buildQuestion(choice);
            answerMethod(question);
        }
        System.out.println("Game over!");
        System.out.println("The character was: " + secretCharacter.getName());
        System.exit(0);
    }

    private Question buildQuestion(int choice) {

        switch (choice) {

            case 1 -> {
                System.out.println("Pick hair colour:\n1 - BLACK\n2 - BROWN\n3 - BLONDE\n4 - RED");
                return questionBuilder.createHairQuestion(
                        HairColour.values()[scanner.nextInt() - 1]
                );
            }

            case 2 -> {
                System.out.println("Pick eye colour:\n1 - BROWN\n2 - BLUE\n3 - GREEN\n4 - HAZEL");
                return questionBuilder.createEyeColourQuestion(
                        EyeColour.values()[scanner.nextInt() - 1]
                );
            }

            case 3 -> {
                return questionBuilder.createGlassesQuestion();
            }

            case 4 -> {
                return questionBuilder.createHatQuestion();
            }

            case 5 -> {
                System.out.println("Pick gender:\n1 - MALE\n2 - FEMALE");
                return questionBuilder.createGenderQuestion(
                        Gender.values()[scanner.nextInt() - 1]
                );
            }

            case 6 -> {
                return questionBuilder.createFacialHairQuestion();
            }

            default -> throw new IllegalArgumentException("Invalid choice");
        }
    }

    private void answerMethod(Question question) {

        System.out.println(question.getText());

        boolean answer = question.isTrueOfCharacter(secretCharacter);

        System.out.println(answer ? "Yes" : "No");

        board.eliminateCharacters(question, answer);
    }

    private void makeGuess(){
        System.out.print("Enter your guess: ");
        String guess = scanner.next();

        if (guess.equalsIgnoreCase(secretCharacter.getName())){
            System.out.println("Correct!");
            System.exit(0);
        }
        else{
            attemptsRemaining --;
            System.out.println("Incorrect guess, try again! Guesses remaining: " + attemptsRemaining);
        }
    }
}