import java.util.ArrayList;

class Main{
	
	public static void main(String[] args){
		// declare and instantiate the ations
		ArrayList<String> Actions = new ArrayList<String>();
		for(String s: new String[]{"1) Start game","2) Resume game","3) Pause game","4) End game"}){
			Actions.add(s);
		}
		
		// declare and instantiate the menu
		GameMenu gm = new GameMenu(Actions);
		
		
		// test displayMenu function in the GameMenu class
		gm.displayMenu();
	}
}