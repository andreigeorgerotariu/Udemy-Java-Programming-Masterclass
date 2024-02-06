package timbuchalka.generics.ourGenericsClass;

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
    }
}