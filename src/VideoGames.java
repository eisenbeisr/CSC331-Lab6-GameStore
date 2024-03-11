// updated VideoGames class

public class VideoGames extends Games {
    private String platform;
    private String pov;
    private String type;


    //constructor for VideoGames class that calls superclass constructor
    // added name as first variable for formatting, added type variable as well
    VideoGames(String name, int numPlayers, int maxPlayers, int year, double price, int avgPlaytime,
               double avgRating, String type, String platform, String pov) {
        super(name, numPlayers, maxPlayers, year, price, avgPlaytime, avgRating);
        this.type = type;
        this.platform = platform;
        this.pov = pov;
    }

    /**
     * 2
     *
     * @return returns the instance variable platform. This tells the user
     * what platform the video game is played on.
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @param platform lets the user set which platform this specific game is played on
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * @return returns the instance variable pov. This tells the user
     * what point of view the video game is played from.
     */
    public String getPov() {
        return this.pov;
    }

    /**
     * @param pov lets the user set which point of view this specific
     *            game is played from
     */
    public void setPov(String pov) {
        this.pov = pov;
    }

    // added getter and setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // made slight changes to the toString method for formatting
    @Override
    public String toString() {
        return String.format(" %s %s%n %s %s%n %s %s%n %s", "Platform:", getPlatform(), "Point of view:", getPov(), "Type:", getType(), super.toString());
    }
}
