package timbuchalka.generics.ourGenericsClass;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        AmericanFootballPlayer joe = new AmericanFootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        FootballPlayer beckham = new FootballPlayer("Beckham");

        Team<AmericanFootballPlayer> americanFootballTeam = new Team<>("Minnesota Vikings");
        americanFootballTeam.addPlayer(joe);
        System.out.println(americanFootballTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> footballTeam = new Team<>("Steaua");
        footballTeam.addPlayer(beckham);

        Team<AmericanFootballPlayer> melbourne = new Team<>("Melbourne");
        AmericanFootballPlayer banks = new AmericanFootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<AmericanFootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<AmericanFootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(americanFootballTeam, 3, 8);

        americanFootballTeam.matchResult(fremantle, 2, 1);

        System.out.println("Rankings: ");
        System.out.println(americanFootballTeam.getName() + ": " + americanFootballTeam.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(americanFootballTeam.compareTo(melbourne));
        System.out.println(americanFootballTeam.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(americanFootballTeam));
        System.out.println(melbourne.compareTo(fremantle));
    }
}