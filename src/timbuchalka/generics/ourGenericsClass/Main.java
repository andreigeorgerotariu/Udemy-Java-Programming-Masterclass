package timbuchalka.generics.ourGenericsClass;

public class Main {

    public static void main(String[] args) {

        AmericanFootballPlayer joe = new AmericanFootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        FootballPlayer beckham = new FootballPlayer("Beckham");

        Team steaua = new Team("Steaua");
        steaua.addPlayer(joe);
        steaua.addPlayer(pat);
        steaua.addPlayer(beckham);

        System.out.println(steaua.numPlayers());
    }
}