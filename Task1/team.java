import java.util.ArrayList;

class Team{
	private String nameOfTeam = "";
	private int teamRank = 0;
	private ArrayList<String> teamMates;
	public Team(String teamName, int rank, ArrayList<String> teamMates){
		this.nameOfTeam = teamName;
		this.teamRank = rank;
		this.teamMates = teamMates;
	}
	public Team(String teamName, int rank, String[] teamMates){
		this.nameOfTeam = teamName;
		this.teamRank = rank;
		this.teamMates =  new ArrayList<String>();
		for(String name: teamMates){
			this.teamMates.add(name);
		}
	}
	public Team(String teamName, int rank){
		this(teamName, rank, new ArrayList<String>());
	}
	
	public int setRank(int newRank){
		int oldRank = teamRank;
		teamRank = newRank;
		return oldRank;
	}
	
	public int getRank(){
		return teamRank;
	}
	
	@Override
	public String toString(){
		String output = "Team: " + nameOfTeam + " - Rank: " + teamRank + ".";
		if(teamMates.size()>0){
			output += " Consisting of:";
		}
		for(String person: teamMates){
			output += "\n -- " + person + ".";
		}
		return output;
	}
}