import java.util.Scanner;


public class Display {
	
	static Scanner sc = new Scanner(System.in);
	String[] actionArray = new String[] {"actions"};
	
	public String greet() {
		System.out.println("Welcome to the automated FATE resources.");
		System.out.println("For a list of available actions, please enter \'actions\'. What would you like to do?");
		String action = getAction();
		return action;
		
	}
	
	public String getAction() {
		String action = sc.nextLine();
		boolean validAction = validAction(action);
		while (!validAction) {
			System.out.println("That is not a valid action. For a list of available actions, please enter \'actions\'.");
			System.out.println("What would you like to do?");
			action = sc.nextLine();
			validAction = validAction(action);
		}
		return action;
	}
	
	boolean validAction(String action) {
		boolean isValid = false;
		for (int i = 0; i < actionArray.length; i++) {
			if(action.equals(actionArray[i])) {
				isValid = true;
				break;
			}
		}
		return isValid;
	}
}
