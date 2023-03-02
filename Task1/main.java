import java.util.ArrayList;

class Main{
	static ArrayList<Team> teams = new ArrayList<Team>();
	public static void main(String[] args){
		
		teams.add(new Team("Team A", 2, new String[]{"Hanni", "Ahmad", "Youssef", "Lasse", "Mikail"}));
		teams.get(0).setRank(1);
		
		teams.add(new Team("Team B", 5, new String[]{"Christian", "Nicolai", "Nicklas", "Søren", "Patrick", "Matthias"}));
		
		teams.add(new Team("Team C", 2, new String[]{"Mustafa", "Nikolai", "Mounir"}));
		
		teams.add(new Team("Team D", 4, new String[]{"Elsa", "Sumaia", "Signe", "Ingrid", "Sana"}));
		
		teams.add(new Team("Team E", 3, new String[]{"Vlademar", "Lauritz", "Alexander", "Tobias"}));
		
		
		for(Team team: teams){
			System.out.println(team.toString());
		}
	}
}