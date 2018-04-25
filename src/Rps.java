import java.util.Scanner;
import java.util.Random;

public class Rps {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		myMethod();
	}

	public static void myMethod() {
		
		System.out.println("How many times do you want to play");
		int userInput = myScannerMethodInt();
		
		int i = 0;
		int userWinCount = 0;
		int compWinCount = 0;

		while (i <= userInput) {
			String rpComp = computerChoice();
			String input = myScannerMethod();
			if (input.equals("rock") & rpComp.equals("rock")) {

				System.out.println("Its a draw bro");

			} else if (input.equals("rock") & rpComp.equals("paper")) {

				System.out.println("Computer wins with Paper");
				compWinCount++;
			} else if (input.equals("rock") & rpComp.equals("scissors")) {
				System.out.println("You win with Rock");
			    userWinCount++;

			} else if (input.equals("paper") & rpComp.equals("rock")) {
				System.out.println("You win with Paper");
				userWinCount++;

			} else if (input.equals("paper") & rpComp.equals("paper")) {

				System.out.println("Its a draw bro");

			} else if (input.equals("paper") & rpComp.equals("scissors")) {
				System.out.println("Computer wins with Scissors");
				compWinCount++;

			} else if (input.equals("scissors") & rpComp.equals("rock")) {
				System.out.println("Computer wins with Rock");
				compWinCount++;

			} else if (input.equals("scissors") & rpComp.equals("paper")) {
				System.out.println("You win with Scissors");
				userWinCount++;

			} else if (input.equals("scissors") & rpComp.equals("scissors")) {
				System.out.println("Its a draw fam");

			} else if (input.equals("q")) {
				
				System.out.println("The User has won " + userWinCount + " and " + "The computer has won " + compWinCount);
				s.close();
				System.exit(0);
			}
			i++;
		}
		System.out.println("The User has won " + userWinCount + " and " + "The computer has won " + compWinCount);

	}

	public static String computerChoice() {

		Random randNum = new Random();
		int n = randNum.nextInt(3) + 1;

		String compute;

		if (n == 1) {
			compute = "rock";
			return compute;
		} else if (n == 2) {
			compute = "paper";
			return compute;
		} else {
			compute = "scissors";
			return compute;
		}
	}

	public static String myScannerMethod() {

		System.out.println("Rock Paper or Scissors?ejhdgjed ");
		return s.nextLine().trim().toLowerCase(); 
	}

	public static int myScannerMethodInt() {

		return s.nextInt();
	}
}
