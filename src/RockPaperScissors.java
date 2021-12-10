import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int roundNum = 0; //for the round number, so we can show what round it is
        boolean gameStatus = false; //false if the game is not ended yet (still going on), and true if the game is ended.
        int userScore = 0;
        int comScore = 0;

        System.out.println("Welcome to the Rock-Paper-Scissors Game.");

        while (!gameStatus) {
            System.out.println("-----------------------------------------------------------------------------------------------------------");
            roundNum++;
            System.out.println("Round " + roundNum + ", Press \"1\" to pick Rock, \"2\" for Paper, \"3\" for Scissors. your pick..");
            int userPick = input.nextInt();
            int comPick = (int) (Math.random() * 3 + 1);

            if (userPick == comPick) {
                System.out.println("Tie! same picks, huh?");
            } else if (userPick == 1) {
                if (comPick == 2) {
                    System.out.println("You Lost. Computer picked Paper.");
                    comScore++;
                } else if (comPick == 3) {
                    System.out.println("You Won! Computer picked scissors.");
                    userScore++;
                }
            } else if (userPick == 2) {
                if (comPick == 1) {
                    System.out.println("You Won! Computer picked Rock.");
                    userScore++;
                } else if (comPick == 3) {
                    System.out.println("You Lost. Computer picked scissors.");
                    comScore++;
                }
            } else if (userPick == 3) {
                if (comPick == 1) {
                    System.out.println("You Lost. Computer picked Rock.");
                    comScore++;
                } else if (comPick == 2) {
                    System.out.println("You Won! Computer picked scissors.");
                    userScore++;
                }
            } else {
                System.out.println("Wrong Input, try again.");
            }

            System.out.println("Round " + roundNum + " has ended and the current result is " + userScore + " for You, and " + comScore + " for the Computer." );

            if (comScore == 5) {
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println("You Lost The Game. Well, Better Luck Next Time. Feel Free To Start A New Game.");
                gameStatus = true;
            } else if (userScore == 5) {
                System.out.println("-----------------------------------------------------------------------------------------------------------");
                System.out.println("You Won The Game! GG!");
                gameStatus = true;
            }


        }




    }

}
