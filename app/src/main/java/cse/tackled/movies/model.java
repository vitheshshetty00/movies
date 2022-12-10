package cse.tackled.movies;

public class model {
    String Director,Genre,Overview,Poster,Rating,Release,Runtime,Title;

    public model() {
    }

    public model(String director, String genre, String overview, String poster, String rating, String release, String runtime, String title) {
        Director = director;
        Genre = genre;
        Overview = overview;
        Poster = poster;
        Rating = rating;
        Release = release;
        Runtime = runtime;
        Title = title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public String getPoster() {
        return Poster;
    }

    public void setPoster(String poster) {
        Poster = poster;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getRelease() {
        return Release;
    }

    public void setRelease(String release) {
        Release = release;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
