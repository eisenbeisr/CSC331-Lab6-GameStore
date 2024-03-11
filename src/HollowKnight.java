// updated HollowKnight class

public class HollowKnight extends VideoGames {
    private int healthBars;

    private int score;

    HollowKnight(String name, int numPlayers, int maxPlayers, int year, double price, int avgPlaytime,
               double avgRating, String type, String platform, String pov, int healthBars, int score) {
        super(name, numPlayers, maxPlayers, year, price, avgPlaytime, avgRating, type, platform, pov);
        this.healthBars = healthBars;
        this.score = score;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHealthBars() {
        return healthBars;
    }

    public void minusHealth(int damage) {
        if (damage >= this.healthBars) {
            System.out.println("Your character is out of health. Game Over.");
        }
        else {
            this.healthBars = this.healthBars - damage;
            System.out.printf("Your health is now %d",this.healthBars);
        }
    }

    // made slight changes to toString method for formatting
    @Override
    public String toString() {
        return String.format("%s %n %s %d%n %s %,d", super.toString(), "Health Bars:", getHealthBars(), "Current Score:", getScore());
    }
}
