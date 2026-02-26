//Aggregated class
	 public class MovieDetail {
    // 2 private numeric data fields (using wrapper classes) & 1 private String data field

    private  Movie tamil;
    private Movie malayalam;
    private Movie english;

    // Public no-arg constructor
    public MovieDetail() {  // i created for tamil,malayalam , english movies
        this.tamil = new Movie(4,2025,"GooD Bad Ugly","Ajith Kumar");
        this.malayalam = new Movie(6,2025,"Test","Madhavan");
        this.english = new Movie(5,1941,"Citizen Kane","Herman J");
    }

    // Public constructor that accepts arguments
    public MovieDetail(Movie tamil, Movie malayalam, Movie english){
        this.tamil = tamil;
        this.malayalam = malayalam;
        this.english = english;
    }

    // Public toString() method
    public void printMovie() {
    	System.out.println("Tamil :");
    	System.out.println(tamil.toString());
    	System.out.println("Malayalam :");
    	System.out.println(malayalam.toString());
    	System.out.println("English :");
    	System.out.println(english.toString());
    }
}
