package timbuchalka.generics.genericsChallenge;

//Create a generic class to implement a league table for a sport.
// The class should allow teams to be added to the list, and store a list of teams that belong to the league.
//Your class should have a method to print out the teams in order, with the team at the top of the league first.
//Only teams of the same type should be added to any particular instance of the league class - the program should fail
//to compare if an attempt is made to add an incompatible team.

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> vikings = new Team<>("Minnesota Vikings");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        footballLeague.add(vikings);
        footballLeague.add(melbourne);
        footballLeague.add(fremantle);
        footballLeague.add(hawthorn);

        footballLeague.showLeagueTable();

        hawthorn.matchResult(fremantle, 1,0);
        hawthorn.matchResult(vikings, 3, 8);
        vikings.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
    }
}