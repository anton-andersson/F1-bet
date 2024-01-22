package src.Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    
    static ArrayList<String> readDrivers() throws FileNotFoundException {
        File driversFile = new File("DriverStandings.txt");
        Scanner driverScan = new Scanner(driversFile);
        ArrayList<String> out = new ArrayList<String>();
        while (driverScan.hasNextLine()) {
            out.add(driverScan.nextLine());
        }
        driverScan.close();
        return out;
    }

    static ArrayList<String> readTeams() throws FileNotFoundException {
        File teamsFile = new File("TeamStandings.txt");
        Scanner teamScan = new Scanner(teamsFile);
        ArrayList<String> out = new ArrayList<String>();
        while (teamScan.hasNextLine()) {
            out.add(teamScan.nextLine());
        }
        teamScan.close();
        return out;
    }

    static ArrayList<Bet> readBets() throws FileNotFoundException {
        File betFile = new File("Bets.txt");
        Scanner betScan = new Scanner(betFile);
        ArrayList<Bet> out = new ArrayList<Bet>();
        while (betScan.hasNextLine()) {
            String name = betScan.nextLine();
            Bet bet = new Bet(name);
            while (betScan.hasNextLine()) {
                String line = betScan.nextLine();
                if (line.equals("BREAK")) {
                    out.add(bet);
                    break;
                }
                if (line.contains("Driver")) {
                    while (betScan.hasNextLine()) {
                        String driver = betScan.nextLine();
                        if (driver.equals("DriverEND")) {
                            break;
                        }
                        bet.drivers.add(driver);
                    }
                } else if (line.contains("Team")) {
                    while (betScan.hasNextLine()) {
                        String team = betScan.nextLine();
                        if (team.equals("TeamEND")) {
                            break;
                        }
                        bet.teams.add(team);
                    }
                } else if (line.contains("GP")) {
                    while (betScan.hasNextLine()) {
                        String gp = betScan.nextLine();
                        if (gp.equals("GPEND")) {
                            break;
                        }
                        bet.gp = Integer.valueOf(gp);
                    }
                } else if (line.contains("Podium")) {
                    while (betScan.hasNextLine()) {
                        String podium = betScan.nextLine();
                        if (podium.equals("PodiumEND")) {
                            break;
                        }
                        bet.podium = Integer.valueOf(podium);
                    }
                }
            }
        }    
        betScan.close();
        return out;
    }

    static ArrayList<Integer> readGPPodium() throws FileNotFoundException {
        File gpFile = new File("GPPodium.txt");
        Scanner gpScan = new Scanner(gpFile);
        ArrayList<Integer> out = new ArrayList<Integer>();
        while (gpScan.hasNextLine()) {
            out.add(Integer.valueOf(gpScan.nextLine()));
        }
        gpScan.close();
        return out;
    }
}
