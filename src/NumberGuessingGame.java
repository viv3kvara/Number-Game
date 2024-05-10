
    import java.util.Scanner;
    import java.util.Random;

    public class NumberGuessingGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            boolean playAgain = true;

            while (playAgain) {
                int randomNumber = random.nextInt(100) + 1;
                int attempts = 0;
                int maxAttempts = 5; // You can adjust this according to your preference

                System.out.println("Welcome to the Number Guessing Game!");
                System.out.println("I've selected a random number between 1 and 100. Can you guess it?");

                while (attempts < maxAttempts) {
                    System.out.print("Enter your guess (between 1 and 100): ");
                    int guess = scanner.nextInt();
                    attempts++;

                    if (guess == randomNumber) {
                        System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts!");
                        break;
                    } else if (guess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                }

                if (attempts == maxAttempts) {
                    System.out.println("Sorry, you've used all your attempts. The correct number was: " + randomNumber);
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String playChoice = scanner.next().toLowerCase();
                playAgain = playChoice.equals("yes");
            }

            System.out.println("Thank you for playing!");
            scanner.close();
        }
    }

