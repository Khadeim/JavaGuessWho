import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void storeName() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals("Alex", character.getName());
    }

    @Test
    void storeHairColour() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals(HairColour.BROWN, character.getHairColour());
    }

    @Test
    void storeEyeColour() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals(EyeColour.HAZEL, character.getEyeColour());
    }

    @Test
    void storehasGlasses() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertTrue(character.wearsGlasses());
    }

    @Test
    void storehasHat() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertFalse(character.hasHat());
    }

    @Test
    void storeGender() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals(Gender.MALE, character.getGender());
    }

    @Test
    void storeFacialHair() {
        Character character = new Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals(false, character.facialHair());
    }

}