public class Players {
    private String position;
    private int OVR;
    private String playerName;
    private Physical physical;
    private Technic technic;

    public Players(String position, int OVR, String playerName, Physical physical, Technic technic) {
        this.position = position;
        this.OVR = OVR;
        this.playerName = playerName;
        this.physical = new Physical(physical);
        this.technic = new Technic(technic);
    }
}
