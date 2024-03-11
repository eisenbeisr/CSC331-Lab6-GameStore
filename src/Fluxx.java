public class Fluxx extends BoardGames {
    private int numRounds;

    Fluxx(String name, int numPlayers, int maxPlayers, int year, double price, int avgPlaytime, double avgRating,
              String type, int numRounds) {
        super(name, numPlayers, maxPlayers, year, price, avgPlaytime, avgRating, type);
        this.numRounds = numRounds;
    }

    public int getNumRounds() {
        return numRounds;
    }

    public void setNumRounds(int numRounds) {
        this.numRounds = numRounds;
    }

    @Override
    public String toString() {
        return String.format("%s %n %s %d", super.toString(), "Number of Rounds:", getNumRounds());
    }
}
