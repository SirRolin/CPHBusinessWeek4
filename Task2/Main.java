import java.util.Scanner;

class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		System.out.print("Please input your name, thank you:");
		String name = sc.nextLine();
		System.out.println();
		System.out.print("Greetings " + name + ".\nPlease input your age:");
		int age = sc.nextInt();
		System.out.println();
		if(age < 67){
			System.out.println("You'll be elligible for pension in " + (66 - age) + " to " + (67 - age) + " years."); 
		} else {
			System.out.println("You are elligible for pension.");
		}
	}
}