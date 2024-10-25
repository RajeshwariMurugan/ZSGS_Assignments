package abstractAndMethods;

/**
 * 3. Change 'Movie' class to abstract class and add additional abstract methods
 * in 'Movie' class and define them in the child classes
 * 
 */
abstract class Movie {
    protected String title;
    protected String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    abstract String getGenre();
    abstract int getDuration();
    abstract double getRating();

    public String getDetails() {
        return "Title: " + title + ", Director: " + director;
    }
    


    
    
    public static void main(String[] args) {
        Movie actionMovie = new EducationMovie("Ayali", "Muthukumar", 158, 9);
        Movie comedyMovie = new CrimeMovie("Singam", "Hari", 135, 8);
        Movie dramaMovie = new FamilyMovie("Vel", "Hari", 175, 9);

        Movie[] movies = { actionMovie, comedyMovie, dramaMovie };

        for (Movie movie : movies) {
            System.out.println(movie.getDetails() + ", Genre: " + movie.getGenre() + ", Duration: " + movie.getDuration() + " minutes, Rating: " + movie.getRating());
        }
    }


}

class EducationMovie extends Movie {
    private int duration; 
    private double rating; 

    public EducationMovie(String title, String director, int duration, double rating) {
        super(title, director);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    String getGenre() {
        return "Action";
    }

    @Override
    int getDuration() {
        return duration;
    }

    @Override
    double getRating() {
        return rating;
    }
}

class CrimeMovie extends Movie {
    private int duration; 
    private double rating; 

    public CrimeMovie(String title, String director, int duration, double rating) {
        super(title, director);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    String getGenre() {
        return "Comedy";
    }

    @Override
    int getDuration() {
        return duration;
    }

    @Override
    double getRating() {
        return rating;
    }
}

class FamilyMovie extends Movie {
    private int duration;   
    private double rating; 

    public FamilyMovie(String title, String director, int duration, double rating) {
        super(title, director);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    String getGenre() {
        return "Drama";
    }

    @Override
    int getDuration() {
        return duration;
    }

    @Override
    double getRating() {
        return rating;
    }
}

   