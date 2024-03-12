import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dice Roller!");
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("\nRoll the dice? (y/n): ");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("y")) {
                break;
            }

            Dice dice = new Dice();
            dice.roll();
            dice.printRoll();

        } while (true);

        scanner.close();
    }
}
