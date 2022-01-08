import java.util.Random;

public class Controller {
	public static void main(String args[]) {
		Random rand = new Random();
		Dice myDice = new Dice();
		int[] testRoll = myDice.rollFour(rand);
		System.out.println(String.format("The test roll got a total of %1d with individual rolls of [%1d, %1d, %1d, %1d]",
				testRoll[4], testRoll[0], testRoll[1], testRoll[2], testRoll[3]));
	}
}
