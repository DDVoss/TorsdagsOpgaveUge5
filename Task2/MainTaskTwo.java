import java.util.Scanner;

class MainTaskTwo{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type your name");
		String name = scanner.nextLine();

		System.out.println("Hello " + name);

		System.out.println("Please type your age");
		int age = scanner.nextInt();

		System.out.println("You are " + age + " Years old");

		System.out.println("you have " + (100-age) + " Years until retirement");
	}
}