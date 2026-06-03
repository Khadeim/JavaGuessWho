import model.Character;
import model.EyeColour;
import model.Gender;
import model.HairColour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {

    @Test
    void storeName() {
        model.Character character = new model.Character(
                "Alex",
                HairColour.BROWN,
                EyeColour.HAZEL,
                true,
                false,
                Gender.MALE,
                false
        );
        assertEquals("Alex", character.getName());
        assertEquals(HairColour.BROWN, character.getHairColour());
        assertEquals(EyeColour.HAZEL, character.getEyeColour());
        assertTrue(character.wearsGlasses());
        assertFalse(character.hasHat());
        assertEquals(Gender.MALE, character.getGender());
        assertFalse(character.facialHair());
    }

//    @Test
//    void storeHairColour() {
//        model.Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertEquals(HairColour.BROWN, character.getHairColour());
//    }
//
//    @Test
//    void storeEyeColour() {
//        model.Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertEquals(EyeColour.HAZEL, character.getEyeColour());
//    }
//
//    @Test
//    void storehasGlasses() {
//        model.Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertTrue(character.wearsGlasses());
//    }
//
//    @Test
//    void storehasHat() {
//        model.Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertFalse(character.hasHat());
//    }
//
//    @Test
//    void storeGender() {
//        model.Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertEquals(Gender.MALE, character.getGender());
//    }
//
//    @Test
//    void storeFacialHair() {
//        Character character = new model.Character(
//                "Alex",
//                HairColour.BROWN,
//                EyeColour.HAZEL,
//                true,
//                false,
//                Gender.MALE,
//                false
//        );
//        assertFalse(character.facialHair());
//    }

}