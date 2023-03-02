import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	private ArrayList<String> actions;
	GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	
	public void displayMenu(){
		for(String action: actions){
			System.out.println(action);
		}
	}
	
	public String getAction(){
		System.out.println("Type a number to chose an action");
		this.displayMenu();
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		return choice;
	}
	
	public int getActionIndexFromAction(String action){
		int index = 0;
		for(int ite = 0; ite < actions.size(); ++ite){
			if(actions.get(ite).equalsIgnoreCase(action)){
				index = ite + 1;
			}
		}
		return index;
	}
}