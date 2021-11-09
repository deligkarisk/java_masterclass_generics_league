package com.deligkarisk;

public class Main {

    public static void main(String[] args) {
        BaseballTeam teamA = new BaseballTeam();
        BaseballTeam teamB = new BaseballTeam();
        FootballTeam teamC = new FootballTeam();
        BaseballTeam teamD = new BaseballTeam();

        teamA.setName("The Rockers");
        teamB.setName("The Stabilizers");
        teamC.setName("The Unconditionals");
        teamD.setName("The Windings");



        League<BaseballTeam> league = new League<>();

        league.addTeam(teamA);
        league.addTeam(teamB);
        league.addTeam(teamD);

        league.saveGameResult(teamA, teamB, 77, 65);
        league.saveGameResult(teamA, teamB, 84, 83);
        league.saveGameResult(teamA, teamB, 65, 43);


        league.saveGameResult(teamD, teamB, 42, 43);
        league.saveGameResult(teamD, teamB, 23, 54);



        System.out.println(league.getRanking());


    }
}
