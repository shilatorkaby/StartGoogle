package class2;

import class2.player;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.*;
import java.io.*;
import java.io.FileWriter;

public class Team {

    public enum Positions {GK, DEFENDER, MIDFIELDER, ATTACKER}

    List<player> team = new ArrayList<>();
    String teamName; //team's name
    private String pathOfRandomNames;

    public Team(String name,String pathOfNames) {
        this.teamName = name;
        pathOfRandomNames=pathOfNames;
    }


    public void createTeam(String name,String pathOfNames)
    {
        this.teamName = name;
        this.pathOfRandomNames=pathOfNames;

    }
    public float randomGrade() // Generate random id number
    {
        return (ThreadLocalRandom.current().nextFloat(60, 99 + 1));
    }


    public Positions randomPosition() //get a random position from enum
    {
        Random random = new Random();
        Positions[] poses = Positions.values();
        return poses[random.nextInt(poses.length)];
    }

    public boolean correctPosition(HashMap<Positions, Integer> map, Positions p) {
        if (p == Positions.GK & map.get(p) >= 1)
            return false;
        if (map.get(p) < 2 && Collections.max(map.values()) < 3) ;
        return true;
    }

    public String setPosition(HashMap<Positions, Integer> map) {
        Positions p = randomPosition();

        if (correctPosition(map, p)) {
            map.put(p, map.get(p) + 1);
            return p.toString();
        } else {
            p = randomPosition();
            while (p == Positions.GK)
                p = randomPosition();
            return p.toString();
        }
    }


    public void setRandomPlayers(HashMap<Positions, Integer> map) {
        String p;
        try {
            for (int i = 0; i < 11; i++) {
                if (i == 0) {
                    p = "GK";
                    map.put(Positions.GK, map.get(Positions.GK) + 1);
                } else
                    p = setPosition(map);
                team.add(new player(new NameGenerator(pathOfRandomNames).getRandomName(), i, randomGrade(), p));
            }
        } catch (Exception e) {
            System.out.println("Error in generation random player");
        }
    }

    public boolean correctTeamFormat(HashMap<Positions, Integer> map) {
        for (Map.Entry<Positions, Integer> entry : map.entrySet()) {
            for (Positions p : Positions.values()) {
                if ((p == Positions.GK & map.get(p) != 1)
                        | (p != Positions.GK & map.get(p) < 2 & Collections.max(map.values()) < 3)
                        | (p != Positions.GK & map.get(p) < 2))
                    return false;
            }
        }
        return true;
    }

    void func() throws IOException {
    }

    public void createTeamByFormation(HashMap<Positions, Integer> map) {
        int num = 0;
        try {
            if (correctTeamFormat(map)) {
                for (Map.Entry<Positions, Integer> entry : map.entrySet()) {
                    for (int i = 0; i < entry.getValue(); i++) {
                        team.add(new player(new NameGenerator(pathOfRandomNames).getRandomName(), num, randomGrade(), entry.getKey().toString()));
                        num++;
                    }
                }
            } else
                throw new IOException();
        } catch (IOException e) {
            System.out.println("Illegal values");
        } catch (Exception e) {
            System.out.println("Error in generation random name");
        }
    }

    public void importTeamToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter("C:\\javaProjects\\"+fileName);
        writer.write("Team details:\n");
        for (player person : team) {
            writer.write("Name:" +person.name +" ,Jersey number: " + person.jerseyNumber + " ,Grade: " + person.grade + " ,Position:" + person.position+'\n');
        }
        writer.close();
    }

    public void printTeam() {
        System.out.println("Members of "+teamName+":");
        team.forEach((player) -> System.out.println("Name:" + player.name + " Jersey number: " + player.jerseyNumber + " Grade: " + player.grade + " Position:" + player.position));
    }

    public void main(String[] args) {

    }
}

//        NameGenerator name = new NameGenerator("C:\\javaProjects\\esNames.txt");
