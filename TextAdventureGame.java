import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a dark forest. What do you do?");
        System.out.println("1. Go deeper into the forest.");
        System.out.println("2. Look for a path to exit.");

        int choice = getUserChoice(scanner, 1, 2);

        if (choice == 1) {
            exploreDeepForest(scanner);
        } else {
            findExit(scanner);
        }

        scanner.close();
    }

    public static int getUserChoice(Scanner scanner, int min, int max) {
        int choice;
        do {
            System.out.print("Enter your choice (" + min + "-" + max + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < min || choice > max) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            }
        } while (choice < min || choice > max);
        scanner.nextLine(); // Consume the newline character
        return choice;
    }

    public static void exploreDeepForest(Scanner scanner) {
        System.out.println("You venture deeper into the forest.");
        System.out.println("You encounter a fork in the path.");
        System.out.println("1. Take the left path.");
        System.out.println("2. Take the right path.");

        int choice = getUserChoice(scanner, 1, 2);

        if (choice == 1) {
            System.out.println("You discover a hidden treasure!");
        } else {
            System.out.println("You are attacked by a wild animal and narrowly escape.");
        }
    }

    public static void findExit(Scanner scanner) {
        System.out.println("You search for a path to exit the forest.");
        System.out.println("You find a way out and safely exit the forest.");
    }
}
