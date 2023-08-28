package extraPractice.ourPackageBandA;

import java.util.ArrayList;

public class AvailableLibrary extends HomePage {

    String movie;
    String tvShow;
    String categoryOne = "comedy";
    String categoryTwo = "western";
    String categoryThree = "animation";
    String categoryFour = "crime";


    public void movieListing() {

        ArrayList<String> movieList = new ArrayList<String>();
        movieList.add(0, "The Godfather");
        movieList.add(1, "The Godfather part II");
        movieList.add(2, "The Godfather part III");
        movieList.add(3, "The good, the bad and the ugly");
        movieList.add(4, "Meet the Parents");
        movieList.add(5, "Meet the Fockers");
        movieList.add(6, "Little Fockers");
        movieList.add(7, "Scream");
        movieList.add(8, "Scream 2");
        movieList.add(9, "Scream 3");
        movieList.add(10, "Shrek");
        movieList.add(11, "Shrek 2");
        movieList.add(12, "Shrek the Third");
    }


//    public String getMovie() {
//        return movie;
//    }
//
//    public void setMovie(String movie) {
//        this.movie = movie;
//    }
//
//    public String getTvShow() {
//        return tvShow;
//    }
//
//    public void setTvShow(String tvShow) {
//        this.tvShow = tvShow;
//    }
}