/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseball;


/**
 *
 * This class stores the data read from the file
 * 
 * @author Darius Canty
 */
public class Baseball  {
    
    private String name;
    private String team;
    private int atBats;
    private int hits;

    //default constructor
    public Baseball() {
        this.name = "";
        this.team = "";
        this.atBats = 0;
        this.hits = 0;
    }

    /**
     * Overloaded constructor
     * 
     * @param name
     * @param team
     * @param atBats
     * @param hits
     */
    public Baseball(String name, String team, int atBats, int hits) {
        this.name = name;
        this.team = team;
        this.atBats = atBats;
        this.hits = hits;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
}