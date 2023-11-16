import java.util.Scanner;

public class NumberGuessingGame {
    public static void numberGuessingGame() {
        //Scanner class - to allow user input to be processed
        Scanner sc = new Scanner(System.in);

        //generate a random number between 1-50
        int randomNumber = (int)Math.round(Math.random()*50);

        //number of tries user has to guess the number
        int K = 0;

        //defining iteration and guess
        int i, guess;

        System.out.println(
                "Guess a number \n"
                + "between 1 and 50 \n"
                + "Select your difficulty: enter 1 for easy, 2 for medium, 3 for hard"
        );

        switch (sc.nextInt()) {
            case 1 :
                K = 7;
                break;
            case 2 :
                K = 5;
                break;
            case 3 :
                K = 3;
                break;
        }

        for (i=0; i < K; i++) {
            System.out.println("Guess the number :");
            guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break;
            } else if (randomNumber < guess) {
                System.out.println(
                        "The number is less than " + guess + ".\n" +
                                "You have " + (K-(1+i)) + " guesses remaining :");
            } else if (randomNumber > guess) {
                System.out.println(
                        "The number is greater than " + guess + ".\n" +
                                "You have " + (K-(1+i)) + " guesses remaining :");
            }
        }

        if (i==K) {
            System.out.println(
                    "Uh oh. You've run out of guesses\n" +
                    "The number was " + randomNumber + ". \n" +
                    "Better luck next time"
            );
        }
    }

    public static void main(String[] args) {
        numberGuessingGame();
    }
}
