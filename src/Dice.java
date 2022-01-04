import java.util.Random;

public class Dice {
	int rollOne(Random rand) {
		int result = rand.nextInt(-1, 2);
		return result;
	}
	
	public int[] rollFour(Random rand) {
		int[] results = new int[5];
		int total = 0;
		for (int i = 0; i < 4; i++) {
			results[i] = rollOne(rand);
			total = total + results[i];
		}
		results[4] = total;
		return results;
	}
}
