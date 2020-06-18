package movies;

public class Movie {

    private String name;
    private String category;

    //create a constructor
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
        System.out.println("A movie is being created!");
    }

    //create getters
    public String getMovieName() {
        return this.name;
    }

    public String getMovieCategory() {
        return this.category;
    }

    //create setters
    public void setMovieName(String name) {
        this.name = name;
    }

    public void setMovieCategory(String category){
        this.category = category;
    }



    //where you run functions
    public static void main(String[] args) {


    }

}
