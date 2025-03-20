public class Clubs {
    private String clubName;
    private String founder;
    private int year;
    private String philosophy;
    private Managers manager;

    public Clubs(String clubName, String founder, int year, String philosophy) {
        this.clubName = clubName;
        this.founder = founder;
        this.year = year;
        this.philosophy = philosophy;
    }

    public Clubs(String clubName, String founder, int year, String philosophy, Managers manager) {
        this.clubName = clubName;
        this.founder = founder;
        this.year = year;
        this.philosophy = philosophy;
        this.manager = new Managers(manager);
    }
}
