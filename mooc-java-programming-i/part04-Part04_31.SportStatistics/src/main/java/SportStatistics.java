
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<TeamStats> teamInfos = getTeamInfo(file);
        ArrayList<TeamStats> getChosenDetails = new ArrayList<>();

        
        for(TeamStats teamLine: teamInfos) {
            if (teamLine.getHomeTeam().equals(team)) {
                getChosenDetails.add(teamLine);
            }
            if (teamLine.getVisitors().equals(team)) {
                getChosenDetails.add(teamLine);
            }
        }
        int wins = 0;
        int losses = 0;
        for(TeamStats teamLine: getChosenDetails) {
            if (teamLine.checkWinner(team)) {
                wins++;
            }
        }
        System.out.println("Games: " + getChosenDetails.size());
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + (getChosenDetails.size()-wins));
    }
    
    public static ArrayList<TeamStats> getTeamInfo (String file) {
        ArrayList<TeamStats> info = new ArrayList<>();
        
        try(Scanner scan = new Scanner(Paths.get(file))) {
            while(scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitors = parts [1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitorsPoints = Integer.valueOf(parts[3]);
                info.add(new TeamStats(homeTeam, visitors, homePoints, visitorsPoints));
            }
        }catch(Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return info; 
    }
}
