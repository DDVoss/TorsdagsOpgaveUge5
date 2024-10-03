class Main{
	public static void main(String[]args){
		Team myTeam = new Team("Krigerne");
		myTeam.setRank(2);
		myTeam.addPlayer("Kristoffer");
		myTeam.addPlayer("Peter");
		myTeam.addPlayer("Helge");
		System.out.println(myTeam);


		Team myTeam1 = new Team("Tissemyrerne");
		myTeam1.setRank(3);
		myTeam1.addPlayer("Sten");
		myTeam1.addPlayer("Stoffer");
		myTeam1.addPlayer("Fader Paul");
		System.out.println(myTeam1);

		Team myTeam2 = new Team("De Kedelige");
		myTeam2.setRank(1);
		myTeam2.addPlayer("Vilde Villads");
		myTeam2.addPlayer("Paul Coke");
		myTeam2.addPlayer("Stripper Jesus");
		myTeam2.addPlayer("Den Fulde Grønlænder");
		System.out.println(myTeam2);
	}
}