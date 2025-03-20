public class Technic {
    private int shooting;
    private int saving;
    private int dribbling;
    private int passing;
    private int finishing;

    public Technic(int shooting, int saving, int dribbling, int passing, int finishing) {
        this.shooting = shooting;
        this.saving = saving;
        this.dribbling = dribbling;
        this.passing = passing;
        this.finishing = finishing;
    }

    public Technic(Technic t) {
        this.shooting = t.shooting;
        this.saving = t.saving;
        this.dribbling = t.dribbling;
        this.passing = t.passing;
        this.finishing = t.finishing;
    }
}
