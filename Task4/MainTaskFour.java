import java.util.ArrayList;

class MainTaskFour{
	public static void main (String[]args){
		ArrayList<String> actions = new ArrayList <String>();
		actions.add("1) Start game");
		actions.add("2) Resume game");
		actions.add("3) Pause game");
		actions.add("4) End game");
		
		GameMenu myGameMenu = new GameMenu(actions);
		myGameMenu.displayMenu();
	}
}