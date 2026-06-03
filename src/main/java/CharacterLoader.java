import java.util.ArrayList;
import java.util.List;
import java.io.*;


public class CharacterLoader {
    private static final String charactersFile = "/Users/khadeim.rahman/Desktop/JavaGuessWho/JavaGuessWho/src/main/java/characters.csv";

    public static List<Character> loadCharacters() {

        List<Character> characters = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(charactersFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Character character = new Character(
                        data[0],
                        HairColour.valueOf(data[1].toUpperCase()),
                        EyeColour.valueOf(data[2].toUpperCase()),
                        Boolean.parseBoolean(data[3]),
                        Boolean.parseBoolean(data[4]),
                        Gender.valueOf(data[5].toUpperCase()),
                        Boolean.parseBoolean(data[6])

                );
                characters.add(character);

            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file at location: " + charactersFile);
        } catch (IOException e) {
            System.out.println("Something went wrong while reading file.");
        }
        return characters;

    }

}





