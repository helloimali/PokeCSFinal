import java.util.Scanner;


public class PokemonADV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String player,rivalname,charmander, squirtle, bulbasaur;
		String choice1,choice2;
		
		System.out.println("Hello world!");
		System.out.println("Glad to meet you!");
		System.out.println("Welcome to the world of pokemon");
		System.out.println("My name is Oak!");
		System.out.println("This world is inhabited ...");
		System.out.println("...by creatures called pokemon!");
		// insert pikachu here!!!!! ϞϞ(๑⚈ ․̫ ⚈๑)∩ 
		System.out.println("Some people keep pokemon as pets!");
		System.out.println("I spend my life studying them.");
		System.out.println("First, are you a 'boy' or a 'girl'?");
		Scanner input = new Scanner(System.in);
		player = input.nextLine();
		System.out.println("What's your name!");
		player = input.nextLine();
		System.out.println("What's your rivals name?");
		rivalname = input.nextLine();
		System.out.println("Welcome to the world of pokemon");
		System.out.println("- Your room -");
		System.out.println(" Todays the day I get my pokemon! Should I take Charmander the fire type, Squirtle the water type, or Bulbasaur the grass type");
		System.out.println("What should I do!");
		System.out.println("Would you like to 'Go downstairs' or ' Play Video Games' ");
		
		
		choice1 = input.nextLine();
		
		if (choice1.equalsIgnoreCase("Go downstairs")){ //thanks larocca , nextline + equalsignorecase
			System.out.println("You're now downstairs");
		}
		else if (choice1.equalsIgnoreCase("Play Video Games")){
			System.out.println("Now is not the time to be playing videogames! I should 'go downstairs'");
			choice1 = input.nextLine();
			if (choice1.equalsIgnoreCase("Go downstairs")){
				System.out.println("You're now downstairs");
			}
			else{
				System.out.println("Please type in 'Go downstairs'. Restart the program to continue.");
			}
		}
		else{
			System.out.println("Please type in 'Go downstairs' or 'Play Video games'. Restart the program to continue.");
		}
		//endloop
		
		
	}

}
