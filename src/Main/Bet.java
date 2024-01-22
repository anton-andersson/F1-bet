package src.Main;

import java.util.ArrayList;

public class Bet {
    String name;
    ArrayList<String> drivers;
    ArrayList<String> teams;
    int gp;
    int podium;
    int points;

    public Bet(String name) {
        this.name = name;
        drivers = new ArrayList<String>();
        teams = new ArrayList<String>();
        gp = 0;
        podium = 0;
        points = 0;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public String toString() {
        return name;
    }

}