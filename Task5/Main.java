import java.util.ArrayList;
import java.util.regex.Pattern;

class Main{
	static GameMenu gm;
	
	public static void main(String[] args){
		// declare and instantiate the ations
		ArrayList<String> Actions = new ArrayList<String>();
		for(String s: new String[]{"1) Start game","2) Resume game","3) Pause game","4) End game"}){
			Actions.add(s);
		}
		gm = new GameMenu(Actions);
		// declare and instantiate the menu
		
		
		// test displayMenu function in the GameMenu class
		//gm.displayMenu();
		
		String choice = gm.getAction();
		doAction(choice);
	}
	
	public static void doAction(int action){
		switch(action){
			case 0:
				System.out.println("Invalid Action.");
			case 1:
				System.out.println("Starting the game now");
				break;
			case 2:
				System.out.println("Fetching previously saved game data");
				break;
			case 3:
				System.out.println("Game paused");
				break;
			case 4:
				System.out.println("Ending game");
				break;
		}
	}
	
	public static void doAction(String action){
		doAction(gm.getActionIndexFromAction(action));
	}
	
	public static boolean isNumber(String string) {
		String regex = "-?[\\d]*";
		return Pattern.matches(regex, string);
	}
}