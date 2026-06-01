public class Character {

    private String name;
    private String hairColour;
    private String eyeColour;
    private boolean wearsGlasses;
    private boolean hasHat;
    private boolean gender;
    private boolean facialHair;

    public Character(String name, String hairColour, String eyeColour, boolean wearsGlasses,boolean hasHat,
                     boolean gender, boolean facialHair) {

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
    public String getHairColour() {
        return hairColour;
    }
    public String getEyeColour() {
        return eyeColour;
    }
    public boolean wearsGlasses() {
        return wearsGlasses;
    }
    public boolean hasHat() {
        return hasHat;
    }
    public boolean gender() {
        return gender;
    }
    public boolean facialHair() {
        return facialHair;
    }

}
