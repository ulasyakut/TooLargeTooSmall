/**
 * Created by iyasuwatts on 10/17/17.
 */


import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;



public class Main {

    public static void main(String[] args){

        System.out.println("Guess the number between 1 and 100");

        playGuessingGame();

        while (true) {
            System.out.println("Do you want to play again? Type y / n and hit enter");

            Scanner scan = new Scanner(System.in);
            String playAgain = scan.next();

            if (playAgain.charAt(0) == 'y') {
                System.out.println("Okay, I picked a new number. Good luck!");
                playGuessingGame();
            } else {
                System.out.println("Thanks for playing!");
                break;
            }
        }

    }

    public static void playGuessingGame() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int guess;
        int number = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        System.out.println(number);

        guess = scan.nextInt();

        while (true) {
            if (guess < number)        {
                System.out.println("Higher!");
                numberOfTries++;        }
            else if (guess > number) {
                System.out.println("Lower!");
                numberOfTries++;      }
            else if (guess == number) {
                System.out.println("Correct!"+" You tried "+ numberOfTries+ " Times");
                break;
            }

            guess = scan.nextInt();
        }
    }
}










////        int random = ThreadLocalRandom.current().nextInt(20, 81);
////        int num;
////        boolean check;
////        //System.out.println(random);
////        Scanner in = new Scanner(System.in);
////        System.out.print("Type your number: ");
////        num = in.nextInt();
////        //System.out.println(num);
////
////
////        //do while statement needed
////        do {
////
////            if (random == num) {
////                System.out.println("Your guess is correct!");
////                check = false;
////            } else if (num > random) {
////                System.out.println("Your guess is too large!");
////                check = true;
////
////            } else {
////                System.out.println("Your guess is too small!");
////                check = true;
////            }
////        }while(check);
////
//
//
////        while (true) {
////            int computerValue = ThreadLocalRandom.current().nextInt(100);
////            int numberOfTries = 0;
////            int guess = 0;
////            while (true) {
////                System.out.println("please enter an integer betwen 1 and 100 inclusive: ");
////                Scanner in = new Scanner(System.in);
////                System.out.print("Type your number: ");
////                guess  = in.nextInt();
////                numberOfTries++;
////                System.out.println(computerValue);
////
////                if (guess < 1 || guess > 100) System.out.println("Invalid input");
////                else if (guess == computerValue) {
////                    System.out.println("Congratulations you won! Your numbers of tries was: " + numberOfTries + " and the number was: " + computerValue);
////                    // leave the first loop
////                    break;
////                } else if (guess < computerValue) System.out.println("Your guess is too low!");
////                else if (guess > computerValue) System.out.println("Your guess is too high!");
////            }
////
////            System.out.println("Do you want to play again? (1:Yes/2:No)");
////            // if input is not yes leave second loop
////            if (guess != 1) break;
////        }
//        System.out.println("Guess the number between 1 and 100");
//
//        playGuessingGame();
//
//        while (true) {
//            System.out
//                    .println("Do you want to play again? Type y / n and hit enter");
//
//            Scanner scan = new Scanner(System.in);
//            String playAgain = scan.next();
//
//            if (playAgain.charAt(0) == 'y') {
//                System.out.println("Okay, I picked a new number. Good luck!");
//                playGuessingGame();
//            } else {
//                System.out.println("Thanks for playing!");
//                break;
//            }
//            public static void playGuessingGame () {
//                Scanner scan = new Scanner(System.in);
//                Random rand = new Random();
//
//                int guess;
//                int number = rand.nextInt(100) + 1;
//
//                guess = scan.nextInt();
//
//                while (guess != number) {
//                    if (guess < number)
//                        System.out.println("Higher!");
//                    else if (guess > number)
//                        System.out.println("Lower!");
//                    else if (guess == number) {
//                        System.out.println("Correct!");
//                    }
//                    guess = scan.nextInt();
//                }
//            }
//
//
//        }
//    }
//}