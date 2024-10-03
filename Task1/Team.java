import java.util.ArrayList;

class Team{
	private String teamName;
	private int teamRank;
	//private String playerName;
	ArrayList<String> playerNameArr = new ArrayList <String>();
	
	public Team (String teamName){
	this.teamName = teamName;

	}
	
	public int getRank(){
		return this.teamRank;
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}	

	public ArrayList<String> getPlayerNameArr(){
		return this.playerNameArr;
	}


	public void addPlayer(String playerName){
		this.playerNameArr.add(playerName);
	}
	
	@Override
	public String toString(){
		String s = "Hold: " + this.teamName + " Rank:" + this.teamRank + " Top 3 players: " + this.playerNameArr;
		return s;
	}
}