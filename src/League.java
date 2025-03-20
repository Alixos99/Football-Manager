import java.util.ArrayList;
import java.util.List;

public class League {
    private String name;
    private List<Team> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void showTeams() {
        System.out.println("Teams in " + name + ":");
        for (Team team : teams) {
            System.out.println(team);
        }
    }
}
