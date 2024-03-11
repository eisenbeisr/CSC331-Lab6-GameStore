public class BoardGames extends Games {
    private String type;

    BoardGames(String name, int numPlayers, int maxPlayers, int year, double price, int avgPlaytime,
               double avgRating, String type) {
        super(name, numPlayers, maxPlayers, year, price, avgPlaytime, avgRating);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format(" %s %s%n %s", "Type:", getType(), super.toString());
    }
}
