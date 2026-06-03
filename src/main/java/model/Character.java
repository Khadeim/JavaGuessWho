package model;

public class Character {

    String name;
    private HairColour hairColour;
    private EyeColour eyeColour;
    private boolean wearsGlasses;
    private boolean hasHat;
    private Gender gender;
    private boolean facialHair;

    public Character(String name,
                     HairColour hairColour,
                     EyeColour eyeColour,
                     boolean wearsGlasses,
                     boolean hasHat,
                     Gender gender,
                     boolean facialHair) {

        this.name = name;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.wearsGlasses = wearsGlasses;
        this.hasHat = hasHat;
        this.gender = gender;
        this.facialHair = facialHair;
    }

    public String getName() {
        return name;
    }
    public HairColour getHairColour() {
        return hairColour;
    }
    public EyeColour getEyeColour() {
        return eyeColour;
    }
    public boolean wearsGlasses() {
        return wearsGlasses;
    }
    public boolean hasHat() {
        return hasHat;
    }
    public Gender getGender() {
        return gender;
    }
    public boolean facialHair() {
        return facialHair;
    }

    @Override
    public String toString(){
        return name + "," +
                hairColour + "," +
                eyeColour + "," +
                wearsGlasses + "," +
                hasHat + "," +
                gender + "," +
                facialHair;
    }

}
