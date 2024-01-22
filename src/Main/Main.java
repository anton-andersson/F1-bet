package src.Main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    static ArrayList<String> drivers;
    static ArrayList<String> teams;
    static ArrayList<Bet> bets;
    static ArrayList<Integer> GPPodium;

    public static void main(String[] args) {
        setup();
        points();
    }
    
    public static void setup() {
        try {
            drivers = Reader.readDrivers();
            teams = Reader.readTeams();
            bets = Reader.readBets();
            GPPodium = Reader.readGPPodium();
            System.out.println(drivers);
            System.out.println(teams);
            System.out.println(bets);
            System.out.println(GPPodium);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    public static void points() {
        for (Bet bet : bets) {
            PointCounter pc = new PointCounter(bet, drivers, teams, GPPodium);
            bet.addPoints(pc.addAllPoints());
        }
        //sort bets by points
        bets.sort((Bet b1, Bet b2) -> b2.points - b1.points);
        for (Bet bet : bets) {
            System.out.println(bet.name + ": " + bet.points);
        }
    }   
}