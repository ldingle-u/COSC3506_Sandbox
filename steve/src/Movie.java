//Aggregating Class
public class Movie {
    // 3 private data fields of aggregated class type
    private int songcount;
    private int Movieyear;
    private String MovieName;
    private String heroName;

    // A public no-arg constructor which sets default values for the data fields.

    public Movie() {
        this.songcount = 0;
        this.Movieyear = 0;
        this.MovieName = "";
        this.heroName = "";
    }
   

    // A public constructor that accepts and sets key values for the data fields.
    public Movie(int songcount, int Movieyear,String MovieName, String heroName) {
    	this.songcount = songcount ;
        this.Movieyear = Movieyear;
        this.MovieName = MovieName;
        this.heroName = heroName;
    }

    // A public method that calls the .toString() method from the aggregated class,
    //printing details about all of the data field objects
public String toString() {
	return "MovieName : " + MovieName + "\nYear : " + Movieyear + "\nSong Count : " + songcount + "\nheroName : " + heroName + "\n" ;
}}
