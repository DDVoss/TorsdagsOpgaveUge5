import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu{
	private ArrayList<String> actions = new ArrayList <String>();
	Scanner scanner = new Scanner(System.in);

	GameMenu(ArrayList<String> actions){
		this.actions = actions;
	}
	public void displayMenu(){
		for(String s: this.actions){
			System.out.println(s);
		}
	}
	public int getAction(){
		System.out.println("Type a number to choose an action");
		int choice = Integer.parseInt(scanner.nextLine());
		return choice;
	}
}