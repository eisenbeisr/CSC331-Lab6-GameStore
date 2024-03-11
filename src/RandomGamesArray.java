public class RandomGamesArray {
    public static void main(String[] args) {
        String[] games = {"Betrayal at House on the Hill", "Crokinole", "Cthulu Dice", "Doom", "Dungeons & Dragons",
                "Escape: Curse of the Temple", "Everdell", "Fluxx", "Hollow Knight", "Loonacy", "Love Letter", "Mario Kart",
                "Mysterium", "Night Cage", "Pathfinder", "Play Me", "Poetry for Neanderthals", "Roll for It", "Root",
                "Stardew Valley", "Sushi Go", "Tetris", "Ticket To Ride", "Warhammer", "World of Warcraft", "Zombie Dice"};

        for (int counter = 0; counter < 12; counter++) {
            int random = (int) (games.length * Math.random());

            System.out.println(games[random]);
        }
    }
}
