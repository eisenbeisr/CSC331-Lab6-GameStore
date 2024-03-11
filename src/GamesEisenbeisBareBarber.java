import java.util.Objects;
import java.util.Scanner;

public class GamesEisenbeisBareBarber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        Root root = new Root("Root", 2, 4, 2018, 60.00, 120, 8.2, "Board Game", 1);
        Fluxx fluxx = new Fluxx("Fluxx", 4, 6, 1997, 20.00, 20, 8.5, "Board Game", 4);
        Crokinole crokinole = new Crokinole("Crokinole", 2, 4, 1876, 100.00, 10, 8.0, "Board Game", 4);
        Everdell everdell = new Everdell("Everdell", 2, 4, 2018, 40.00, 60, 8.7, "Board Game", 2);
        LoveLetter loveLetter = new LoveLetter("Love Letter", 2, 4, 2012, 20.00, 20, 7.2, "Board Game", 3);
        SushiGo sushiGo = new SushiGo("Sushi Go", 3, 5, 2013, 20.00, 20, 7.0, "Board Game", 4);
        TicketToRide ticketToRide = new TicketToRide("Ticket to Ride", 4, 5, 2004, 45.00, 45, 7.4, "Board Game", 2);
        CthuluDice cthuluDice = new CthuluDice("Cthulu Dice", 3, 6, 2010, 40.00, 10, 5.2, "Board Game", 3);
        HollowKnight hollowKnight = new HollowKnight("Hollow Knight", 2, 4, 2010, 60.0, 120, 8.7, "Video Game", "Console", "Third Person", 3, 1000);

        Object[] BoardGamesArray = {root, fluxx, crokinole, everdell, loveLetter, sushiGo, ticketToRide, cthuluDice};
        Object[] VideoGamesArray = {hollowKnight};

        double rootPrice = root.getPrice();
        double fluxxPrice = fluxx.getPrice();
        double crokinolePrice = crokinole.getPrice();
        double everdellPrice = everdell.getPrice();
        double loveLetterPrice = loveLetter.getPrice();
        double sushiGoPrice = sushiGo.getPrice();
        double ticketToRidePrice = ticketToRide.getPrice();
        double cthuluDicePrice = cthuluDice.getPrice();
        double hollowKnightPrice = hollowKnight.getPrice();

        System.out.print("Welcome to EBB Game Store!\n");
        while (loop) {
            System.out.print("\nGame Type Selection\n");
            System.out.print("--------------------------------------\n");
            System.out.print(" 1. Video Games\n 2. Board Games\n");
            System.out.print("--------------------------------------\n");
            System.out.print("Choose a type of game to purchase (1 or 2): ");
            int type_choice = input.nextInt();

            if (type_choice == 1) {
                System.out.printf("%n%s%n%s %n %-21s %-15s %-15s %-15s %-20s %-15s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %3d %s %12.1f%s %n%s%n",
                        "Video Game Selection",
                        "--------------------------------------",
                        "Name", "Type", "Price", "Max Players", "Avg Playtime", "Avg Rating",
                        "1)", hollowKnight.getName(), hollowKnight.getType(), "$", hollowKnight.getPrice(), hollowKnight.getMaxPlayers(), hollowKnight.getAvgPlaytime(), "minutes", hollowKnight.getAvgRating(), "/10",
                        "--------------------------------------");

                try {
                    System.out.print("Choose a video game to purchase (1-4): ");
                    int game_choice = input.nextInt();
                    input.nextLine();

                    System.out.printf("%n%s%n%s%n%s%n%s%n",
                            "All data for this game",
                            "--------------------------------------",
                            VideoGamesArray[game_choice - 1].toString(),
                            "--------------------------------------");

                    System.out.print("Enter the number of copies of this game you would like to purchase: ");
                    int copies = input.nextInt();
                    input.nextLine();

                    double total = 0;
                    // Get number of copies purchased working
                    switch (game_choice) {
                        case 1:
                            total = hollowKnightPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        default:
                            System.out.print("\nInvalid input. Enter a number 1-4");
                    }
                }
                catch (Exception e) {
                    System.out.println("Invalid input.");
                    throw new IllegalArgumentException("Number must be between 1-4");
                }
            }

            if (type_choice == 2) {
                // Display name, type, price, maxPlayers, avg playtime, and avg rating in table format
                System.out.printf("%n%s%n%s %n %-21s %-15s %-15s %-15s %-20s %-15s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %3d %s %12.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %2d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %2d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %2d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %2d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %2d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %1d %s %13.1f%s %n" +
                                " %s %-18s %-15s %s%-14.2f %-15d %1d %s %13.1f%s %n%s%n",
                        "Board Game Selection",
                        "-------------------------------------",
                        "Name", "Type", "Price", "Max Players", "Avg Playtime", "Avg Rating",
                        "1)", root.getName(), root.getType(), "$", root.getPrice(), root.getMaxPlayers(), root.getAvgPlaytime(), "minutes", root.getAvgRating(), "/10",
                        "2)", fluxx.getName(), fluxx.getType(), "$", fluxx.getPrice(), fluxx.getMaxPlayers(), fluxx.getAvgPlaytime(), "minutes", fluxx.getAvgRating(), "/10",
                        "3)", crokinole.getName(), crokinole.getType(), "$", crokinole.getPrice(), crokinole.getMaxPlayers(), crokinole.getAvgPlaytime(), "minutes", crokinole.getAvgRating(), "/10",
                        "4)", everdell.getName(), everdell.getType(), "$", everdell.getPrice(), everdell.getMaxPlayers(), everdell.getAvgPlaytime(), "minutes", everdell.getAvgRating(), "/10",
                        "5)", loveLetter.getName(), loveLetter.getType(), "$", loveLetter.getPrice(), loveLetter.getMaxPlayers(), loveLetter.getAvgPlaytime(), "minutes", loveLetter.getAvgRating(), "/10",
                        "6)", sushiGo.getName(), sushiGo.getType(), "$", sushiGo.getPrice(), sushiGo.getMaxPlayers(), sushiGo.getAvgPlaytime(), "minutes", sushiGo.getAvgRating(), "/10",
                        "7)", ticketToRide.getName(), ticketToRide.getType(), "$", ticketToRide.getPrice(), ticketToRide.getMaxPlayers(), ticketToRide.getAvgPlaytime(), "minutes", ticketToRide.getAvgRating(), "/10",
                        "8)", cthuluDice.getName(), cthuluDice.getType(), "$", cthuluDice.getPrice(), cthuluDice.getMaxPlayers(), cthuluDice.getAvgPlaytime(), "minutes", cthuluDice.getAvgRating(), "/10",
                        "-------------------------------------");

                try {
                    System.out.print("Choose a board game to purchase (1-8): ");
                    int game_choice = input.nextInt();
                    input.nextLine();

                    System.out.printf("%n%s%n%s%n%s%n%s%n",
                            "All data for this game",
                            "------------------------------------",
                            BoardGamesArray[game_choice - 1].toString(),
                            "-------------------------------------");

                    System.out.print("Enter number of copies of this game would you like to purchase: ");
                    int copies = input.nextInt();
                    input.nextLine();

                    double total = 0;
                    // Get number of copies purchased working
                    switch (game_choice) {
                        case 1:
                            total = rootPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 2:
                            total = fluxxPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 3:
                            total = crokinolePrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 4:
                            total = everdellPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 5:
                            total = loveLetterPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 6:
                            total = sushiGoPrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        case 7:
                            total = ticketToRidePrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                            break;
                        default:
                            total = cthuluDicePrice * copies;
                            System.out.printf("%n%s%,.2f", "Your total is $", total);
                    }
                }
                catch (Exception e) {
                    System.out.println("\nInvalid input. Terminating program.");
                    throw new IllegalArgumentException("Enter an integer between 1-8");
                }
            }

            System.out.printf("%n%n%s", "Are you sure you want to purchase this game? [y/n]: ");
            String verifyGame = input.nextLine();

            if (Objects.equals(verifyGame, "y")) {
                loop = false;
            }
        }

        System.out.print("\nThank you for shopping at EBB Games Store, have a great day!");
    }
}
