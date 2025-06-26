/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ebrah
 */
public class TeamStats {
    private String homeTeam;
    private String visitors;
    private int homePoints;
    private int awayPoints;
    
    public TeamStats(String hTeam, String aTeam, int hPoint, int aPoints) {
        homeTeam = hTeam;
        visitors = aTeam;
        homePoints = hPoint;
        awayPoints = aPoints;
    }
    public String getHomeTeam() {
        return homeTeam;
    }
    public String getVisitors() {
        return visitors;
    }
    public String toString () {
        return homeTeam + visitors + homePoints + awayPoints;
    }
    public boolean checkWinner (String teamName) {
        if (this.getHomeTeam().equals(teamName) && this.homePoints > this.awayPoints) {
            return true;
        }
        if (this.getVisitors().equals(teamName) && this.awayPoints > this.homePoints) {
            return true;
        }
        return false;
    }
}
