import javax.swing.*;

public class FootballManager {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame();
        frame.setTitle("Football Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 700);
        frame.setResizable(false);

        League botolaPro = new League("Botola Pro");
        League botola2 = new League("Botola 2");

        botolaPro.addTeam(new Team("AS FAR", "Rabat", "Prince Moulay Abdellah Stadium"));
        botolaPro.addTeam(new Team("COD Meknès", "Meknès", "Honneur Stadium"));
        botolaPro.addTeam(new Team("Difaâ El Jadidi", "El Jadida", "Stade El Abdi"));
        botolaPro.addTeam(new Team("Fath Union Sport", "Rabat", "Stade Moulay Hassan"));
        botolaPro.addTeam(new Team("Hassania Agadir", "Agadir", "Stade Adrar"));
        botolaPro.addTeam(new Team("IR Tanger", "Tangier", "Stade Ibn Batouta"));
        botolaPro.addTeam(new Team("JS Soualem", "Soualem", "Stade Municipal de Berrechid"));
        botolaPro.addTeam(new Team("Maghreb de Fès", "Fez", "Fez Stadium"));
        botolaPro.addTeam(new Team("Moghreb Tétouan", "Tétouan", "Saniat Rmel"));
        botolaPro.addTeam(new Team("Olympic Safi", "Safi", "Stade El Massira"));
        botolaPro.addTeam(new Team("Raja CA", "Casablanca", "Mohammed V Stadium"));
        botolaPro.addTeam(new Team("RCA Zemamra", "Zemamra", "Stade Ahmed Choukri"));
        botolaPro.addTeam(new Team("RS Berkane", "Berkane", "Berkane Municipal Stadium"));
        botolaPro.addTeam(new Team("Chabab Mohammédia", "Mohammédia", "Stade El Bachir"));
        botolaPro.addTeam(new Team("Union de Touarga", "Rabat", "Stade Moulay Hassan"));
        botolaPro.addTeam(new Team("Wydad AC", "Casablanca", "Mohammed V Stadium"));

        botola2.addTeam(new Team("Mouloudia Club d'Oujda", "Oujda", "Stade d'honneur d'Oujda"));
        botola2.addTeam(new Team("Chabab Atlas Khénifra", "Khénifra", "Stade Municipal de Khénifra"));
        botola2.addTeam(new Team("Chabab Ben Guerir", "Ben Guerir", "Stade Municipal de Ben Guerir"));
        botola2.addTeam(new Team("Ittihad Khémisset", "Khémisset", "Stade du 18 Novembre"));
        botola2.addTeam(new Team("Kawkab Marrakech", "Marrakech", "Stade de Marrakech"));
        botola2.addTeam(new Team("Kénitra AC", "Kénitra", "Stade Municipal de Kénitra"));
        botola2.addTeam(new Team("Olympique Dcheïra", "Inezgane", "Stade Ahmed Fana"));
        botola2.addTeam(new Team("Racing AC Casablanca", "Casablanca", "Stade Père-Jégo"));
        botola2.addTeam(new Team("Rapide Oued Zem", "Oued Zem", "Stade Municipal d'Oued Zem"));
        botola2.addTeam(new Team("Stade Marocain", "Rabat", "Stade Ahmed Achhoud"));
        botola2.addTeam(new Team("Union Sidi Kacem", "Sidi Kacem", "Stade Municipal de Sidi Kacem"));
        botola2.addTeam(new Team("USM Oujda", "Oujda", "Stade Municipal d'Oujda"));
        botola2.addTeam(new Team("Wydad de Fès", "Fès", "Complexe Sportif de Fès"));
        botola2.addTeam(new Team("Youssoufia Berrechid", "Berrechid", "Stade Municipal de Berrechid"));
        botola2.addTeam(new Team("Jeunesse Sportive El Massira", "Laâyoune", "Stade Sheikh Mohamed Laghdaf"));
        botola2.addTeam(new Team("Union Yacoub El Mansour", "Rabat", "Stade Yacoub El Mansour"));



        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        /*JLabel label = new JLabel("There is :  " + botolaPro.getTeams().size() + " Teams in Botola Pro : ");
        panel.add(label);
        panel.add(Box.createVerticalStrut(10));

        for (Team team : botolaPro.getTeams()) {
            panel.add(new JLabel(team.toString()));
        }

        panel.add(Box.createVerticalStrut(10));


        JLabel label2 = new JLabel("There is :  " + botolaPro.getTeams().size() + " Teams in Botola 2 : ");
        panel.add(label2);
        panel.add(Box.createVerticalStrut(10));
        for (Team team : botola2.getTeams()) {
            panel.add(new JLabel(team.toString()));
        }
        */
        frame.add(panel);
        frame.setVisible(true);
    }
}
