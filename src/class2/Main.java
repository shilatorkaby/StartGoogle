package class2;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {



    public static void main(String[] args) throws IOException {

        Team team1 = new Team("team1","esNames.txt"); //create a team with a random names dictionary
        HashMap<Team.Positions,Integer> map = new HashMap<Team.Positions,Integer>();

        map.put(Team.Positions.GK,0);
        map.put(Team.Positions.DEFENDER,0);
        map.put(Team.Positions.MIDFIELDER,0);
        map.put(Team.Positions.ATTACKER,0);
        team1.setRandomPlayers(map);
        team1.printTeam();

        System.out.println("\n\nCreating a team by format:\n");
        Team team2 = new Team("team2","hiNames.txt");
        //insert example: 1 - Goal Keeper, 4 - Defense, 4 - Middlefiled, 2 - Attack
        HashMap<Team.Positions,Integer> map2 = new HashMap<Team.Positions,Integer>();
        map2.put(Team.Positions.GK,1);
        map2.put(Team.Positions.DEFENDER,4);
        map2.put(Team.Positions.MIDFIELDER,4);
        map2.put(Team.Positions.ATTACKER,2);
        team2.createTeamByFormation(map2);
        team2.printTeam();

        team2.importTeamToFile("teamByFormatDetailsOutput.txt");


    }
}
