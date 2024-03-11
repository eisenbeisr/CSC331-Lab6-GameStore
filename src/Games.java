public class Games {
    private String name;
    private int numPlayers;
    private int maxPlayers;
    private int year;
    private double price;
    private int avgPlaytime;
    private double avgRating;
    Games(String name, int numPlayers, int maxPlayers, int year, double price, int avgPlaytime, double avgRating) {
        this.name = name;
        this.numPlayers = numPlayers;
        this.maxPlayers = maxPlayers;
        this.year = year;
        this.price = price;
        this.avgPlaytime = avgPlaytime;
        this.avgRating = avgRating;
    }

    public String getName() {
        return name;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public int getAvgPlaytime() {
        return avgPlaytime;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvgPlaytime(int avgPlaytime) {
        this.avgPlaytime = avgPlaytime;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String toString() {
        return String.format("%s %s%n %s %d%n %s %d%n %s %d%n %s %s%.2f%n %s %d %s%n %s %.1f%s", "Name:", getName(), "Player Count:",
                getNumPlayers(), "Max Players:", getMaxPlayers(), "Year:", getYear(), "Price:", "$", getPrice(),
                "Average Playtime:", getAvgPlaytime(), "minutes", "Average Rating:", getAvgRating(), "/10");
    }
}
