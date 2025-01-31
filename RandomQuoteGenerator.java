

import java.util.Random;
import java.util.Scanner;

public class RandomQuoteGenerator {
    private static final String[] quotes = {
        "The best way to predict the future is to invent it. – Alan Kay",
        "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
        "Don’t watch the clock; do what it does. Keep going. – Sam Levenson",
        "Believe you can and you're halfway there. – Theodore Roosevelt",
        "It does not matter how slowly you go as long as you do not stop. – Confucius",
        "Act as if what you do makes a difference. It does. – William James",
        "The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
        "Your time is limited, so don’t waste it living someone else’s life. – Steve Jobs",
        "You miss 100% of the shots you don’t take. – Wayne Gretzky",
        "Whether you think you can or you think you can’t, you’re right. – Henry Ford"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Random Quote Generator!");
        
        String choice;
        do {
            int randomIndex = random.nextInt(quotes.length); // Get a random index
            System.out.println("\nHere is your quote:");
            System.out.println(quotes[randomIndex]);

            System.out.print("\nWould you like another quote? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        System.out.println("Thank you for using the Random Quote Generator!");
        scanner.close();
    }
}