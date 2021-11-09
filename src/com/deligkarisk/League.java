package com.deligkarisk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {

    List<T> teamList;

    public League() {
        teamList = new ArrayList<>();
    }


    public void addTeam(T team) {
        if (teamList.contains(team)) {
            System.out.println("Team already in the league!");
            return;
        }

        teamList.add(team);
    }


    public void saveGameResult(T teamA, T teamB, int scoreTeamA, int scoreTeamB) {

        if (!((teamList.contains(teamA)) && (teamList.contains(teamB)))) {
            System.out.println("One of the teams is not part of the league!");
            return;
        }


        if (scoreTeamA > scoreTeamB) {
            teamA.setWins(teamA.getWins() + 1);
            teamB.setLoses(teamB.getLoses() + 1);
        }

        if (scoreTeamA == scoreTeamB) {
            teamA.setTies(teamA.getTies() + 1);
            teamB.setTies(teamB.getTies() + 1);
        }

        if (scoreTeamA < scoreTeamB) {
            teamB.setWins(teamB.getWins() + 1);
            teamA.setLoses(teamA.getLoses() + 1);
        }
    }


    public List<T> getRanking() {
        List<T> orderedRanking;
        orderedRanking = new java.util.ArrayList<>(List.copyOf(teamList));
        Collections.sort(orderedRanking);
        Collections.reverse(orderedRanking);
        return orderedRanking;
    }






}
