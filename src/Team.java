public class Team {
    private String name;
    private String location;
    private String stadium;

    public Team(String name, String location, String stadium) {
        this.name = name;
        this.location = location;
        this.stadium = stadium;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getStadium() { return stadium; }

    @Override
    public String toString() {
        return "               " + name + " - " + location + " (" + stadium + ")";
    }
}
