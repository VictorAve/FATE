import java.util.Random;

public class Controller {
	
	public static void main(String args[]) {
		Display canvas = new Display();
		Dice myDice = new Dice();
		Random rand = new Random();
		
		String action = canvas.greet();
		System.out.println(String.format("You chose \'%s\'", action));
		int[] testResults = myDice.rollFour(rand);
		System.out.println(String.format("The test roll got a total of %1d from these four rolls: [%1d %1d %1d %1d]",
				testResults[4], testResults[0], testResults[1], testResults[2], testResults[3]));
		
	}
}