public class Managers {
    private int philosophy;
    private String formation;
    private int OVR;
    private String managerName;

    public Managers(int philosophy, String formation, int OVR, String managerName) {
        this.philosophy = philosophy;
        this.formation = formation;
        this.OVR = OVR;
        this.managerName = managerName;
    }

    public Managers(Managers m) {
        this.philosophy = m.philosophy;
        this.formation = m.formation;
        this.OVR = m.OVR;
        this.managerName = m.managerName;
    }
}
