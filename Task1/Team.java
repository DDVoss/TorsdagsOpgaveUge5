class Team{
	private String teamName;
	private int teamRank;
	private String playerName;
	
	public Team (String teamName){
	this.teamName = teamName;
	this.teamRank = teamRank;
	this.playerName = playerName;
	}
	
	public int getRank(){
		return this.teamRank;
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}	
	
	@Override
	public String toString(){
		String s = "Hold: " + this.teamName + " Rank:" + this.teamRank;
		return s;
	}
}