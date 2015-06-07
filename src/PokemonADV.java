import java.util.Scanner;


public class PokemonADV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String player,playerpoke;
		String charmander, squirtle, bulbasaur;
		String choice1,choice2,choicepoke,moveset;
		String badpeeps,badpoke,rivalname,rivalpoke;
		boolean playerdeath,rivaldeath;
		
		System.out.println("???: Hello world!");
		System.out.println("???: Glad to meet you!");
		System.out.println("???: Welcome to the world of pokemon");
		System.out.println("OAK: My name is Oak!");
		System.out.println("OAK: This world is inhabited ...");
		System.out.println("ϞϞ(๑⚈ ․̫ ⚈๑)∩");  
		System.out.println("OAK: ...by creatures called pokemon!");
		System.out.println("OAK: Some people keep pokemon as pets!");
		System.out.println("OAK: I spend my life studying them.");
		System.out.println("OAK: First, are you a 'boy' or a 'girl'?");
		Scanner input = new Scanner(System.in);
		player = input.nextLine();
		System.out.println("OAK: What's your name!");
		player = input.nextLine().toUpperCase();
		System.out.println("OAK: What's your rivals name?");
		rivalname = input.nextLine().toUpperCase();
		
		System.out.println("OAK: Welcome to the world of pokemon");
		System.out.println("- Your room -");
		System.out.println( player + ": Todays the day I get my pokemon! Should I take Charmander the fire type, Squirtle the water type, or Bulbasaur the grass type");
		System.out.println( player + ": What should I do!");
		System.out.println("Would you like to 'Go downstairs' or ' Play Video Games' ");
		
		
		choice1 = input.nextLine();
		
		if (choice1.equalsIgnoreCase("Go downstairs")){ //thanks larocca , nextline + equalsignorecase
			System.out.println("You're now downstairs");
		}
		else if (choice1.equalsIgnoreCase("Play Video Games")){
			System.out.println( player + ": Now is not the time to be playing videogames! I should 'go downstairs'");
			choice1 = input.nextLine();
			if (choice1.equalsIgnoreCase("Go downstairs")){
				System.out.println("You're now downstairs");
			}
			else{
				System.out.println("Please type in 'Go downstairs'. Restart the program to continue.");
				System.exit(0);
			}
		}
		else{
			System.out.println("Please type in 'Go downstairs' or 'Play Video games'. Restart the program to continue.");
			System.exit(0);
		}
		//endloop
		
		System.out.println(" - Downstairs - ");
		System.out.println("Would you like to 'Watch TV' 'Confront Mother' or 'Leave'");
		
		
		choice2 = input.nextLine();
		
		if (choice2.equalsIgnoreCase("Watch TV")){
			System.out.println( player + ": Hey look...dad's on TV...");
			System.out.println("MOM: *turns TV off* Let him be, he left us");
			System.out.println( player + ": Yea but... don't you sometimes miss him?");
			System.out.println("MOM: No I don't, because he's a lying sh-");
			System.out.println(player + ": MOM DON'T CURSE!");
			System.out.println("MOM: Sorry honey!");
			System.out.println("MOM: On the bright side, are you excited for your pokemon adventure?");
			System.out.println( player + ": I sure am mom!");
			System.out.println("MOM: Well you should get going now! Professor Oak is waiting for you!");
			System.out.println("MOM: But wait, before you go, take this!");
			System.out.println("*MOM gives " + player + " a hug*");
			System.out.println("MOM: Show dad who's boss!");
			//goes outside
		}
		else if (choice2.equalsIgnoreCase("Confront Mother")){
			System.out.println( player + ": Hey mom!");
			System.out.println("MOM: Hey there! You excited for your pokemon adventure?");
			System.out.println( player + ": I sure am mom!");
			System.out.println("MOM: Well you should get going now! Professor Oak is waiting for you!");
			System.out.println("MOM: But wait, before you go, take this!");
			System.out.println("*mother gives " + player + " a hug*");
			System.out.println("MOM: Go get'em tiger!");
			//add a love meter or something that causes the kid to kill himself
		}
		else if(choice2.equalsIgnoreCase("Leave")){
			
		}
		else{
			System.out.println("Please type in 'Watch TV' 'Confront Mother' or 'Leave'. Restart the program to continue.");
			System.exit(0);
		}
		
		//endloop
		System.out.println("*You have left the house*");
		System.out.println( player + ": Time to get my first pokemon!");
		System.out.println( " - Professor Oaks Lab - ");
		System.out.println( player + ": Hey Prof. Oak!");
		System.out.println("OAK: Hello " + player + "!");
		System.out.println("OAK: Ready for your first pokemon?");
		System.out.println(player + ": Hell yea!");
		System.out.println("OAK: Alright so who will you choose?");
		System.out.println("OAK: Will you choose 'Charmander', the fire type?");
		System.out.println("OAK: Will you choose 'Squirtle', the water type?");
		System.out.println("OAK: Or will you choose 'Bulbasaur', the grass type?");
		
		choicepoke = input.nextLine();
		
		if(choicepoke.equalsIgnoreCase("Charmander")){
			badpeeps="Team Aqua";
			badpoke	= "Blastoise";
			playerpoke = "Charmander";
			rivalpoke = "Squirtle";
			
			System.out.println(rivalname + ": Hey " + player + ", we should battle!");
			System.out.println(rivalname + " sent out " + rivalpoke);
			playerdeath = false;
			rivaldeath = false;
			
			int playerpokehealth = 20;
			int rivalpokehealth = 20;

			while(playerdeath == false && rivaldeath == false){
				System.out.println("What will " + playerpoke + " do!");
				System.out.println("Moves: 'Pound' or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
					System.out.println( playerpoke + " used Pound!");
					rivalpokehealth = rivalpokehealth - 10;
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else if (moveset.equalsIgnoreCase("Growl")){
					System.out.println(playerpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else{
					System.out.println("Please type in 'Pound' or 'Growl'. Restart the program to continue.");
					System.exit(0);
				}
				//end loop
				//check death
				if (rivalpokehealth <= 0){
					rivaldeath = true;
					System.out.println(rivalname +"'s "+ rivalpoke + " has fainted!");
					System.out.println(rivalname +": Wow, you're so strong!");
				}
				else if (playerpokehealth <= 0){
					playerdeath = true;
					System.out.println(player +"'s "+ playerpoke + " has fainted!");
					System.out.println(rivalname +"haha I win! This part isn't even suposed to be possilble! I don't even know why this If statement is here!");
					System.out.println(" . . . " + player +"has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("OAK: Hey " + player + " you should challange Jessie Pinkman!");
			System.out.println("OAK: He's the gym leader in Albuquerque town!");
			
		}
		
		//end charmander
		
		
		else if(choicepoke.equalsIgnoreCase("Squirtle")){
			badpeeps="Team Rocket";
			badpoke	= "Persian";
			playerpoke = "Squirtle";
			rivalpoke = "Bulbasaur";
			System.out.println(rivalname);	
			
			System.out.println(rivalname + ": Hey " + player + ", we should battle!");
			System.out.println(rivalname + " sent out " + rivalpoke);
			playerdeath = false;
			rivaldeath = false;
			
			int playerpokehealth = 20;
			int rivalpokehealth = 20;

			while(playerdeath == false && rivaldeath == false){
				System.out.println("What will " + playerpoke + " do!");
				System.out.println("Moves: 'Pound' or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
					System.out.println( playerpoke + " used Pound!");
					rivalpokehealth = rivalpokehealth - 10;
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else if (moveset.equalsIgnoreCase("Growl")){
					System.out.println(playerpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else{
					System.out.println("Please type in 'Pound' or 'Growl'. Restart the program to continue.");
					System.exit(0);
				}
				//end loop
				//check death
				if (rivalpokehealth <= 0){
					rivaldeath = true;
					System.out.println(rivalname +"'s "+ rivalpoke + " has fainted!");
					System.out.println(rivalname +": Wow, you're so strong!");
				}
				else if (playerpokehealth <= 0){
					playerdeath = true;
					System.out.println(player +"'s "+ playerpoke + " has fainted!");
					System.out.println(rivalname +"haha I win! This part isn't even suposed to be possilble! I don't even know why this If statement is here!");
					System.out.println(" . . . " + player +"has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("OAK: Hey " + player + " you should challange Hank Schrader!");
			System.out.println("OAK: He's the gym leader in DEA town!");
		}
		//end squirtle
		
		
		else if(choicepoke.equalsIgnoreCase("Bulbasaur")){
			badpeeps="Team Magma";
			badpoke	= "Charizard";
			playerpoke = "Bulbasaur";
			rivalpoke = "Charmander";
			System.out.println(rivalname);	
			
			System.out.println(rivalname + ": Hey " + player + ", we should battle!");
			System.out.println(rivalname + " sent out " + rivalpoke);
			playerdeath = false;
			rivaldeath = false;
			
			int playerpokehealth = 20;
			int rivalpokehealth = 20;

			while(playerdeath == false && rivaldeath == false){
				System.out.println("What will " + playerpoke + " do!");
				System.out.println("Moves: 'Pound' or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
					System.out.println( playerpoke + " used Pound!");
					rivalpokehealth = rivalpokehealth - 10;
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else if (moveset.equalsIgnoreCase("Growl")){
					System.out.println(playerpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
				}
				else{
					System.out.println("Please type in 'Pound' or 'Growl'. Restart the program to continue.");
					System.exit(0);
				}
				//end loop
				//check death
				if (rivalpokehealth <= 0){
					rivaldeath = true;
					System.out.println(rivalname +"'s "+ rivalpoke + " has fainted!");
					System.out.println(rivalname +": Wow, you're so strong!");
				}
				else if (playerpokehealth <= 0){
					playerdeath = true;
					System.out.println(player +"'s "+ playerpoke + " has fainted!");
					System.out.println(rivalname +"haha I win! This part isn't even suposed to be possilble! I don't even know why this If statement is here!");
					System.out.println(" . . . " + player +"has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("OAK: Hey " + player + " you should challange Walter White!");
			System.out.println("OAK: He's the gym leader in New Mexico!");
		}
		//end bulbasaur
		
		
		
		else{
			System.out.println("Please type in 'Charmander' 'Squirtle' or 'Bulbasaur'. Restart the program to continue.");
			System.exit(0);
		}
		//if you dun goofed m8
	}

}
