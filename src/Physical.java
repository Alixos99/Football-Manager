public class Physical {
    private int jumping;
    private int header;
    private int pace;
    private int acceleration;
    private int physicalContact;
    private int stamina;

    public Physical(int jumping, int header, int acceleration, int physicalContact, int stamina) {
        this.jumping = jumping;
        this.header = header;
        this.acceleration = acceleration;
        this.physicalContact = physicalContact;
        this.stamina = stamina;
    }

    public Physical(Physical p) {
        this.jumping = p.jumping;
        this.header = p.header;
        this.acceleration = p.acceleration;
        this.physicalContact = p.physicalContact;
        this.stamina = p.stamina;
    }
}
