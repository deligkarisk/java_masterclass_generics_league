package com.deligkarisk;

public abstract class Team implements Comparable {
    int wins = 0;
    int loses = 0;
    int ties =0;
    String name;

    @Override
    public int compareTo(Object o) {
        Team otherTeam = (Team) o;
        return this.wins - otherTeam.wins;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       return name + ", " + wins + " wins";
    }
}
