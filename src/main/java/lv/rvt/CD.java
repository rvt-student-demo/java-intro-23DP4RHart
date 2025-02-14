package lv.rvt;

public class CD implements Packable {
    private String artist;
    private String title;
    private int gads;

    public CD(String artist, String title, int publicationYear) {
        this.artist = artist;
        this.title = title;
        this.gads = publicationYear;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + title + " (" + gads + ")";
    }
}
