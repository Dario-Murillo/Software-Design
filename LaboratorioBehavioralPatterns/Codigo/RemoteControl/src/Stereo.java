public class Stereo {
    private String location;

    public Stereo(String location) {
        this.location = location;
    }

    public String on() {
        return location + " stereo is on";
    }

    public String off() {
        return location + " stereo is off";
    }

    public String setCD() {
        return location + " stereo is set for CD input";
    }

    public String setDVD() {
        return location + " stereo is set for DVD input";
    }

    public String setRadio() {
        return location + " stereo is set for Radio";
    }

    public String setVolume(int volume) {
        // Code to set the volume
        // Valid range: 1-11 (after all, 11 is better than 10, right?)
        return location + " Stereo volume set to " + volume;
    }
}
