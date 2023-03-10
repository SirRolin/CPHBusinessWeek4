import java.util.ArrayList;

class GameMenu{
	ArrayList<String> actions;
	GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	
	void displayMenu(){
		for(String action: this.actions){
			System.out.println(action);
		}
	}
}