package components;

public class Tyres {
    private double width;
    private String seasons;

    public Tyres(double width, String seasons) {
        this.width = width;
        this.seasons = seasons;
    }

    public double getWidth() {
        return width;
    }

    public String getSeasons() {
        return seasons;
    }
}
