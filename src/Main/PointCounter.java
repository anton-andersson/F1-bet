package src.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PointCounter {
    Bet bet;
    ArrayList<String> drivers;
    ArrayList<String> teams;
    ArrayList<Integer> GPPodium;
    int points;

    public PointCounter(Bet bet, ArrayList<String> drivers, ArrayList<String> teams, ArrayList<Integer> GPPodium) {
        this.bet = bet;
        this.drivers = drivers;
        this.teams = teams;
        this.GPPodium = GPPodium;
        points = 0;
    }

    public int addAllPoints() {
        addDriverPoints();
        return points;
    }

    public void addDriverPoints() {
        addDriverPlaces();
        addDriverWinner();
        addDriverFive();
    }

    public void addTeamPoints() {
        addTeamPlaces();
        addTeamWinner();
        
    }

    public int getPoints() {
        return points;
    }

    public void addDriverWinner() {
        if (bet.drivers.get(0).equals(drivers.get(0))) {
            points += 10;
        }
    }

    // Add all place-based scored for drivers except winner, top 5 or bottom 5
    public void addDriverPlaces() {
        for (int i = 0; i < 19; i++) {
            if (bet.drivers.get(i).equals(drivers.get(i))) {
                points += 5;
            }
        }
        // add 3 points for drivers 1 above or below the correct place
        for (int i = 1; i < 18; i++) {
            if (bet.drivers.get(i).equals(drivers.get(i - 1))) {
                points += 3;
            }
            if (bet.drivers.get(i).equals(drivers.get(i + 1))) {
                points += 3;
            }
        }
        // add 2 points for drivers 2 above or below the correct place
        for (int i = 2; i < 17; i++) {
            if (bet.drivers.get(i).equals(drivers.get(i - 2))) {
                points += 2;
            }
            if (bet.drivers.get(i).equals(drivers.get(i + 2))) {
                points += 2;
            }
        }
        // add 1 point for drivers 3 above or below the correct place
        for (int i = 3; i < 16; i++) {
            if (bet.drivers.get(i).equals(drivers.get(i - 3))) {
                points += 1;
            }
            if (bet.drivers.get(i).equals(drivers.get(i + 3))) {
                points += 1;
            }
        }
    }

    // Add 5 points for driver in top 5 and 5 points for driver in bottom 5
    public void addDriverFive() {
        HashSet<String> betTop = new HashSet<>(bet.drivers.subList(0, 5));
        HashSet<String> betBottom = new HashSet<>(bet.drivers.subList(14, 19));
        for (int i = 0; i < 5; i++) {
            if (betTop.contains(drivers.get(i))) {
                points += 5;
            }
            if (betBottom.contains(drivers.get(19 - i))) {
                points += 5;
            }
        }

    }

    public void addTeamWinner() {
        if (bet.teams.get(0).equals(teams.get(0))) {
            points += 10;
        }
    }

    // Add all place-based scored for teams except winner, top 5 or bottom 5
    public void addTeamPlaces() {
        for (int i = 0; i < 9; i++) {
            if (bet.teams.get(i).equals(teams.get(i))) {
                points += 5;
            }
        }
        // add 3 points for teams 1 above or below the correct place
        for (int i = 1; i < 8; i++) {
            if (bet.teams.get(i).equals(teams.get(i - 1))) {
                points += 3;
            }
            if (bet.teams.get(i).equals(teams.get(i + 1))) {
                points += 3;
            }
        }
        // add 2 points for teams 2 above or below the correct place
        for (int i = 2; i < 7; i++) {
            if (bet.teams.get(i).equals(teams.get(i - 2))) {
                points += 2;
            }
            if (bet.teams.get(i).equals(teams.get(i + 2))) {
                points += 2;
            }
        }
        // add 1 point for teams 3 above or below the correct place
        for (int i = 3; i < 6; i++) {
            if (bet.teams.get(i).equals(teams.get(i - 3))) {
                points += 1;
            }
            if (bet.teams.get(i).equals(teams.get(i + 3))) {
                points += 1;
            }
        }
    }

    // Check and add points for correct amount of teams with podiums and gp
    public void addGPPodium() {
        if (bet.gp == GPPodium.get(0)) {
            points += 5;
        }
        if (bet.podium == GPPodium.get(1)) {
            points += 5;
        }
    }
}
