import java.util.Scanner;


public class PokemonADV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String player,playerpoke;
		String charmander, squirtle, bulbasaur;
		String choice1,choice2,choicepoke,moveset,choice3;
		String badpeeps,badpoke,rivalname,rivalpoke,eve2,eve3;
		boolean playerdeath,rivaldeath,gymj,gymh,gymw;
		
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
			eve2 = "Charmeleon";
			eve3 = "Charizard";
			
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
					System.out.println(rivalname + "'s health is " + rivalpokehealth);
				}
				else if (moveset.equalsIgnoreCase("Growl")){
					System.out.println(playerpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
					System.out.println(rivalname + "'s health is " + rivalpokehealth);
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
					System.out.println(" . . . " + player +" has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("Charmander learned ember!");
			System.out.println("OAK: Hey " + player + " you should challange Jessie Pinkman!");
			System.out.println("OAK: He's the gym leader in Albuquerque town!");
			System.out.println(player + ": That's a good idea! I'll go right now!");
			System.out.println(" - Albuquerque town - ");
			System.out.println(player + ": Excuse me, are you the gym leader");
			System.out.println("Jessie Pinkman: Yea that's me... beach...");
			System.out.println(player + ": I'd like to challange you!");
			System.out.println("Jessie Pinkman: ...hmm... Alright... you're on.......beach...");
			System.out.println(player + ": Wait... Why do you end with your sentences with 'beach'");
			System.out.println("Jessie Pinkman: I really like the beach... beach...");
			System.out.println(player + ": Well alrighty then... well... lets start this battle!");
			
			playerdeath = false;
			gymj = false;
			String gymleader = "Jessie Pinkman";
			String gympoke = "Piplup";
			
			int playerpokehealth2 = 20;
			int gymjpokehealth = 20;
			
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Ember', or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Ember")){
			        	System.out.println( playerpoke + " used Ember!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Ember' or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(gymleader +": Well... you won fair and square. Here's your badge... beach");
		                System.out.println("You received the Beach Badge!");
		                System.out.println(playerpoke + " learned flamethrower!");
		    			System.out.println("What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve2);
		    			playerpoke = eve2;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//finish while statement for gym
			
			//start walk to forest
			System.out.println(player + ": Alright time to ho home!");
			System.out.println(" - Algarm Forest - ");
			System.out.println("???: STOP RIGHT THERE!");
			System.out.println(player + ": ...?");
			System.out.println(badpeeps + ": We're " + badpeeps + " and we're here to steal your pokemon!");
			System.out.println(player + ": Oh you're on! Get ready for battle");
			
			//battle start with team whatever
			
			
			
			playerdeath = false;
			gymj = false;
			gymleader = badpeeps + " grunt";
			gympoke = "Blastoise";
			
			playerpokehealth2 = 30;
			gymjpokehealth = 45;
			
			System.out.println(gymleader + " challanges you ");
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Ember', 'Flamethrower' or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Ember")){
			        	System.out.println( playerpoke + " used Ember!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Flamethrower")){
		                System.out.println(playerpoke + " used Flamethrower!");
		                gymjpokehealth = gymjpokehealth - 20;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Ember', 'Flamethrower' or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(player + ": THAT'S RIGHT, YOU RUN! GET REKT M8!");
		    			System.out.println(player + ": What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve3);
		    			playerpoke = eve3;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//battle ends with grunt
			
			System.out.println(" - Home - ");
			System.out.println("MOM: Honey you're home!");
			System.out.println(player + ": Yup! I just beat a gym leader and got a badge!");
			System.out.println("MOM: Good job kiddo! Where are you gonna go now!");
			System.out.println(player + ": ... that's a good question... Let me ask " +rivalname +"." );
			System.out.println(" * you call " + rivalname + " on the phone * ");
			System.out.println(player + ": Hey " + rivalname + ", I just beat the gym leader Oak told me to challange!");
			System.out.println(rivalname + ": DUDE THAT'S AWESOME!");
			System.out.println(player + ": It is... but I don't know where to go after that");
			System.out.println(rivalname + ": You should challange the Pokemon champion!");
			System.out.println(player + ": Oh yea! That's a good idea! I'll go right now!");
			System.out.println(rivalname + ": GOOD LUCK!");
			System.out.println(" - Pokemon League - ");
			System.out.println(player + ": I'm finally here... the Pokemon League... I wonder who the Pokemon Master is...");
			System.out.println("  -  * You open the doors*  -  ");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(player + ": ...No way...");
			System.out.println("???: Welcome home...son");
			System.out.println(player + ": You...you peice of s-");
			System.out.println("rage boils inside of your heart... Will you 'attack' your father, or will you 'calm down'");
			
			choice3 = input.nextLine();
			
			if(choicepoke.equalsIgnoreCase("attack")){
				System.out.println(player + ": You were here... this entire time?");
				System.out.println(player + ": You could have helped me and mom out...");
				System.out.println("FATHER: Now now... what was I supposed to do...? You left me-");
				System.out.println(player + ": THAT'S A LIE, YOU LEFT US");
				System.out.println("  * You run to your father, in an attempt to punch him*  ");
				System.out.println(" * Your father moves to the side and puts you into a choke hold * ");
				System.out.println(" * With his other hand, he pulls out his cell phone and calls the police * ");
				System.out.println(" * The police come to arrest you * ");
				System.out.println("POLICE: You're coming with us sonny");
				System.out.println("Will you 'run away' or 'let them take you'");
				choice3 = input.nextLine();
				
				if(choice3.equalsIgnoreCase("run away")){
					System.out.println(" * You break free and run away * ");
					System.out.println(" * You run out of the building and hide in a shack for a copuple of days* ");
					System.out.println(" * You come out of hiding, and realise you're a fugitive for attacking the champion  * ");
					System.out.println(player + ": ... I can't go anywhere");
					System.out.println(player + ": MOM and " +rivalname + " probably hate me");
					System.out.println(player + ": ... I have nowhere to go");
					System.out.println(player + ": ... I...I...I guess I have to do this");
					System.out.println(" * You start crying, regretting the attack * ");
					System.out.println(player +": " +playerpoke + "I choose you...");
					System.out.println(player +": " +playerpoke + "...Use Tackel on me... and then run away");
					System.out.println(player +": " +playerpoke + "goodbye...");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game videotaped by: Kevin Wong");
					System.exit(0);
					
				}
				else if(choice3.equalsIgnoreCase("let them take you")){
					System.out.println(" * You let them take you * ");
					System.out.println(player + ": I.. I'm sorry");
					System.out.println("COP: Tell it to the judge");
					System.out.println( " * " + player +" will be spending the rest of his life in jail * ");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game Videotaped by: Kevin Wong");
				}
				else{
					 System.out.println("Please type in 'run away' or 'let them take you'. Restart the program to continue.");
		             System.exit(0);
				}
			}
			else if (choice3.equalsIgnoreCase("calm down")){
				System.out.println(" * you breathe in and out to calm down * ");
				System.out.println(" I'm all fired up now... I WILL beat you...");
				System.out.println("DAD : heh.... In your dreams");
				
				//battle start with master
				
				
				
				playerdeath = false;
				gymj = false;
				gymleader = "DAD";
				gympoke = "Salamence";
				
				playerpokehealth2 = 45;
				gymjpokehealth = 60;
				
				System.out.println(gymleader + " challanges you ");
				System.out.println(gymleader + " sent out " + gympoke);
				System.out.println("You sent out " + playerpoke);
				
				while(playerdeath == false && gymj == false){
			        System.out.println("What will " + playerpoke + " do!");
			        System.out.println("Moves: 'Pound', 'Ember', 'Flamethrower' or 'Growl'");
					moveset = input.nextLine();
					if (moveset.equalsIgnoreCase("Pound")){
				        	System.out.println( playerpoke + " used Pound!");
				        	gymjpokehealth = gymjpokehealth - 7;
				        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
				            playerpokehealth2 = playerpokehealth2- 12;
				        	}
				            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Ember")){
				        	System.out.println( playerpoke + " used Ember!");
				        	gymjpokehealth = gymjpokehealth - 15;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Growl")){
			                System.out.println(playerpoke + " used Growl!");
			                System.out.println(playerpoke + "'s defense went down");
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used slash!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Flamethrower")){
			                System.out.println(playerpoke + " used Flamethrower!");
			                gymjpokehealth = gymjpokehealth - 20;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used Scratch!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else{
				                System.out.println("Please type in 'Pound', 'Ember', 'Flamethrower' or 'Growl'. Restart the program to continue.");
				                System.exit(0);
				        }

			        //check death
			        if (gymjpokehealth <= 0){
			        		gymj = true;
			                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
			                System.out.println("DAD: what... how did I lose");
			                System.out.println(player + ": Easy. You suck. Leave this League. I am the master now.");
			                System.out.println(" * DAD walks out with shame. * ");
			                System.out.println(" * You decide to call your mother and your rival * ");
			                System.out.println(player + ": Hey mom!");
			                System.out.println("MOM: OH HONEY HELLOOOOO!");
			                System.out.println(player + ": Guess who kicked dads butt and became pokemon champion");
			                System.out.println("MOM: OH HONEY I'M SO PROUD OF YOU!");
			                System.out.println(player + ": Thanks MOM! I couldn't do it without you...");
			                System.out.println("MOM: You should tell " + rivalname);
			                System.out.println(player + ": That's a good idea! Let me call him now! Bye MOM!");
			                System.out.println(" * you hang up the phone and dial " + rivalname + "'s number");
			                System.out.println(rivalname + ": Hello?");
			                System.out.println(player + ": Dude... Guess what");
			                System.out.println(rivalname + ": Hmmmm?");
			                System.out.println(player + ": I'm Pokemon Champion now!");
			                System.out.println(rivalname + ": REALLY? NO WAY! CONGRATULATIONS!!");
			                System.out.println(player + ": Thanks man!");
			                System.out.println(rivalname + ": ...but... I hate to break this to you but...");
			                System.out.println(player + ": ...?");
			                System.out.println(rivalname + ": I'm about to take that title away from you");
			                System.out.println(player + ": OH YOU'RE ON!");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			        else if (playerpokehealth2 <= 0){
			                playerdeath = true;
			                System.out.println(player +" I... I lost.... I can't be the best anymore...");
			                System.out.println("DAD: Go home kid... You lost");
			                System.out.println(" * you walk back home, in utter despair * ");
			                System.out.println("MOM: oh you're home! What happened!");
			                System.out.println(player + ": I...I lost...");
			                System.out.println("MOM: That's alright honey! You can't always win right?");
			                System.out.println(player + ": ...I lost...to dad");
			                System.out.println(" * MOM walks towards you and gives you a hug * ");
			                System.out.println("MOM: It's alright, shhhh...");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			//end death check
					
					
				}
				
				//battle ends with master
				
			}
			else {
				 System.out.println("Please type in 'calm down' or 'attack'. Restart the program to continue.");
	             System.exit(0);
			}
			//end
			
		}
		
		//end charmander
		
		
		else if(choicepoke.equalsIgnoreCase("Squirtle")){
			badpeeps="Team Rocket";
			badpoke	= "Persian";
			playerpoke = "Squirtle";
			rivalpoke = "Bulbasaur";
			eve2 = "Wartortle";
			eve3 = "Blastoise";
			
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
					System.out.println(rivalname + "'s health is " + rivalpokehealth);
				}
				else if (moveset.equalsIgnoreCase("Growl")){
					System.out.println(playerpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println(rivalname +"'s "+ rivalpoke + " used Growl!");
					System.out.println(playerpoke + "'s defense went down");
					System.out.println("Your health is " + playerpokehealth);
					System.out.println(rivalname + "'s health is " + rivalpokehealth);
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
					System.out.println(playerpoke + " learned Bubble Beam!");
					System.out.println(rivalname +": Wow, you're so strong!");
				}
				else if (playerpokehealth <= 0){
					playerdeath = true;
					System.out.println(player +"'s "+ playerpoke + " has fainted!");
					System.out.println(rivalname +"haha I win! This part isn't even suposed to be possilble! I don't even know why this If statement is here!");
					System.out.println(" . . . " + player +" has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("OAK: Hey " + player + " you should challange Hank Schrader!");
			System.out.println("OAK: He's the gym leader in DEA town!");
			System.out.println(player + ": That's a good idea! I'll go right now!");
			System.out.println(" - DEA town - ");
			
			
			playerdeath = false;
			gymj = false;
			String gymleader = "Hank Schrader";
			String gympoke = "Nidoking";
			
			int playerpokehealth2 = 20;
			int gymjpokehealth = 20;
			
			System.out.println(player + ": Are you Hank Schrader?");
			System.out.println(gymleader +": Well howdy partner!");
			System.out.println(player + ": Hey, I'm here to challange you");
			System.out.println(gymleader +": well that's sounds like a blast m8");
			System.out.println(player + ": m8...really...");
			System.out.println(gymleader +": Let me be hip, ok? Lets do this.");
			
			
			
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Bubble Beam', or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Bubble Beam")){
			        	System.out.println( playerpoke + " used Bubble Beam!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Bubble Beam' or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(gymleader +": Well I'll be darned... here's your badge!");
		                System.out.println("You received the DEA Badge!");
		                System.out.println(playerpoke + " learned Watergun!");
		    			System.out.println("What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve2);
		    			playerpoke = eve2;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//finish while statement for gym
			
			//start walk to forest
			System.out.println(player + ": Alright time to ho home!");
			System.out.println(" - Algarm Forest - ");
			System.out.println("???: STOP RIGHT THERE!");
			System.out.println(player + ": ...?");
			System.out.println(badpeeps + ": We're " + badpeeps + " and we're here to steal your pokemon!");
			System.out.println(player + ": Oh you're on! Get ready for battle");
			
			//battle start with team whatever
			
			
			
			playerdeath = false;
			gymj = false;
			gymleader = badpeeps + " grunt";
			gympoke = "Persian";
			
			playerpokehealth2 = 30;
			gymjpokehealth = 45;
			
			System.out.println(gymleader + " challanges you ");
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Bubble Beam', 'Watergun' , or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        		System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			        		playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Bubble Beam")){
			        	System.out.println( playerpoke + " used Bubble Beam!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        		System.out.println(gymleader +"'s "+ gympoke + " used Scratch!");
			        		playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        		System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Watergun")){
		                System.out.println(playerpoke + " used Watergun!");
		                gymjpokehealth = gymjpokehealth - 20;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        		System.out.println(gymleader +"'s "+ gympoke + " used Scratch!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Bubble Beam','Watergun', or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(player + ": THAT'S RIGHT, YOU RUN! GET REKT M8!");
		    			System.out.println(player + ": What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve3);
		    			playerpoke = eve3;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//battle ends with grunt
			
			System.out.println(" - Home - ");
			System.out.println("MOM: Honey you're home!");
			System.out.println(player + ": Yup! I just beat a gym leader and got a badge!");
			System.out.println("MOM: Good job kiddo! Where are you gonna go now!");
			System.out.println(player + ": ... that's a good question... Let me ask " +rivalname +"." );
			System.out.println(" * you call " + rivalname + " on the phone * ");
			System.out.println(player + ": Hey " + rivalname + ", I just beat the gym leader Oak told me to challange!");
			System.out.println(rivalname + ": DUDE THAT'S AWESOME!");
			System.out.println(player + ": It is... but I don't know where to go after that");
			System.out.println(rivalname + ": You should challange the Pokemon champion!");
			System.out.println(player + ": Oh yea! That's a good idea! I'll go right now!");
			System.out.println(rivalname + ": GOOD LUCK!");
			System.out.println(" - Pokemon League - ");
			System.out.println(player + ": I'm finally here... the Pokemon League... I wonder who the Pokemon Master is...");
			System.out.println("  -  * You open the doors*  -  ");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(player + ": ...No way...");
			System.out.println("???: Welcome home...son");
			System.out.println(player + ": You...you peice of s-");
			System.out.println("rage boils inside of your heart... Will you 'attack' your father, or will you 'calm down'");
			
			choice3 = input.nextLine();
			
			if(choicepoke.equalsIgnoreCase("attack")){
				System.out.println(player + ": You were here... this entire time?");
				System.out.println(player + ": You could have helped me and mom out...");
				System.out.println("FATHER: Now now... what was I supposed to do...? You left me-");
				System.out.println(player + ": THAT'S A LIE, YOU LEFT US");
				System.out.println("  * You run to your father, in an attempt to punch him*  ");
				System.out.println(" * Your father moves to the side and puts you into a choke hold * ");
				System.out.println(" * With his other hand, he pulls out his cell phone and calls the police * ");
				System.out.println(" * The police come to arrest you * ");
				System.out.println("POLICE: You're coming with us sonny");
				System.out.println("Will you 'run away' or 'let them take you'");
				choice3 = input.nextLine();
				
				if(choice3.equalsIgnoreCase("run away")){
					System.out.println(" * You break free and run away * ");
					System.out.println(" * You run out of the building and hide in a shack for a copuple of days* ");
					System.out.println(" * You come out of hiding, and realise you're a fugitive for attacking the champion  * ");
					System.out.println(player + ": ... I can't go anywhere");
					System.out.println(player + ": MOM and " +rivalname + " probably hate me");
					System.out.println(player + ": ... I have nowhere to go");
					System.out.println(player + ": ... I...I...I guess I have to do this");
					System.out.println(" * You start crying, regretting the attack * ");
					System.out.println(player +": " +playerpoke + "I choose you...");
					System.out.println(player +": " +playerpoke + "...Use Tackel on me... and then run away");
					System.out.println(player +": " +playerpoke + "goodbye...");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game videotaped by: Kevin Wong");
					System.exit(0);
					
				}
				else if(choice3.equalsIgnoreCase("let them take you")){
					System.out.println(" * You let them take you * ");
					System.out.println(player + ": I.. I'm sorry");
					System.out.println("COP: Tell it to the judge");
					System.out.println( " * " + player +" will be spending the rest of his life in jail * ");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game Videotaped by: Kevin Wong");
				}
				else{
					 System.out.println("Please type in 'run away' or 'let them take you'. Restart the program to continue.");
		             System.exit(0);
				}
			}
			else if (choice3.equalsIgnoreCase("calm down")){
				System.out.println(" * you breathe in and out to calm down * ");
				System.out.println(" I'm all fired up now... I WILL beat you...");
				System.out.println("DAD : heh.... In your dreams");
				
				//battle start with master
				
				
				
				playerdeath = false;
				gymj = false;
				gymleader = "DAD";
				gympoke = "Salamence";
				
				playerpokehealth2 = 45;
				gymjpokehealth = 60;
				
				System.out.println(gymleader + " challanges you ");
				System.out.println(gymleader + " sent out " + gympoke);
				System.out.println("You sent out " + playerpoke);
				
				while(playerdeath == false && gymj == false){
			        System.out.println("What will " + playerpoke + " do!");
			        System.out.println("Moves: 'Pound', 'Bubble Beam', 'Watergun' , or 'Growl'");
					moveset = input.nextLine();
					if (moveset.equalsIgnoreCase("Pound")){
				        	System.out.println( playerpoke + " used Pound!");
				        	gymjpokehealth = gymjpokehealth - 7;
				        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        		System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
				        		playerpokehealth2 = playerpokehealth2- 12;
				        	}
				            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Bubble Beam")){
				        	System.out.println( playerpoke + " used Bubble Beam!");
				        	gymjpokehealth = gymjpokehealth - 15;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        		System.out.println(gymleader +"'s "+ gympoke + " used Scratch!");
				        		playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Growl")){
			                System.out.println(playerpoke + " used Growl!");
			                System.out.println(playerpoke + "'s defense went down");
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        		System.out.println(gymleader +"'s "+ gympoke + " used Air dash!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Watergun")){
			                System.out.println(playerpoke + " used Watergun!");
			                gymjpokehealth = gymjpokehealth - 20;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        		System.out.println(gymleader +"'s "+ gympoke + " used Scratch!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else{
				                System.out.println("Please type in 'Pound', 'Bubble Beam','Watergun', or 'Growl'. Restart the program to continue.");
				                System.exit(0);
				        }

			        //check death
			        if (gymjpokehealth <= 0){
			        		gymj = true;
			                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
			                System.out.println("DAD: what... how did I lose");
			                System.out.println(player + ": Easy. You suck. Leave this League. I am the master now.");
			                System.out.println(" * DAD walks out with shame. * ");
			                System.out.println(" * You decide to call your mother and your rival * ");
			                System.out.println(player + ": Hey mom!");
			                System.out.println("MOM: OH HONEY HELLOOOOO!");
			                System.out.println(player + ": Guess who kicked dads butt and became pokemon champion");
			                System.out.println("MOM: OH HONEY I'M SO PROUD OF YOU!");
			                System.out.println(player + ": Thanks MOM! I couldn't do it without you...");
			                System.out.println("MOM: You should tell " + rivalname);
			                System.out.println(player + ": That's a good idea! Let me call him now! Bye MOM!");
			                System.out.println(" * you hang up the phone and dial " + rivalname + "'s number");
			                System.out.println(rivalname + ": Hello?");
			                System.out.println(player + ": Dude... Guess what");
			                System.out.println(rivalname + ": Hmmmm?");
			                System.out.println(player + ": I'm Pokemon Champion now!");
			                System.out.println(rivalname + ": REALLY? NO WAY! CONGRATULATIONS!!");
			                System.out.println(player + ": Thanks man!");
			                System.out.println(rivalname + ": ...but... I hate to break this to you but...");
			                System.out.println(player + ": ...?");
			                System.out.println(rivalname + ": I'm about to take that title away from you");
			                System.out.println(player + ": OH YOU'RE ON!");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			        else if (playerpokehealth2 <= 0){
			                playerdeath = true;
			                System.out.println(player +" I... I lost.... I can't be the best anymore...");
			                System.out.println("DAD: Go home kid... You lost");
			                System.out.println(" * you walk back home, in utter despair * ");
			                System.out.println("MOM: oh you're home! What happened!");
			                System.out.println(player + ": I...I lost...");
			                System.out.println("MOM: That's alright honey! You can't always win right?");
			                System.out.println(player + ": ...I lost...to dad");
			                System.out.println(" * MOM walks towards you and gives you a hug * ");
			                System.out.println("MOM: It's alright, shhhh...");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			//end death check
					
					
				}
				
				//battle ends with master
				
			}
			else {
				 System.out.println("Please type in 'calm down' or 'attack'. Restart the program to continue.");
	             System.exit(0);
			}
			//end
			
		}
		//end squirtle
		
		
		else if(choicepoke.equalsIgnoreCase("Bulbasaur")){
			badpeeps="Team Magma";
			badpoke	= "Charizard";
			playerpoke = "Bulbasaur";
			rivalpoke = "Charmander";
			eve2 = "Ivysaur";
			eve3 = "Bulbasaur";
			
			
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
					System.out.println(playerpoke + " learned Razor Leaf!");
					System.out.println(rivalname +": Wow, you're so strong!");
				}
				else if (playerpokehealth <= 0){
					playerdeath = true;
					System.out.println(player +"'s "+ playerpoke + " has fainted!");
					System.out.println(rivalname +"haha I win! This part isn't even suposed to be possilble! I don't even know why this If statement is here!");
					System.out.println(" . . . " + player +" has blacked out!");
					System.out.println("Restart the program to continue.");
					System.exit(0);
				}
			//end death check
			};
			//endwhile
			
			//challnge gym leader beggining 
			System.out.println("OAK: Hey " + player + " you should challange Walter White!");
			System.out.println("OAK: He's the gym leader in New Mexico!");
			System.out.println(player + ": That's a good idea! I'll go right now!");
			System.out.println(" - New Mexico - ");
			
			
			playerdeath = false;
			gymj = false;
			String gymleader = "Walter White";
			String gympoke = "Missingno";
			
			int playerpokehealth2 = 20;
			int gymjpokehealth = 20;
			System.out.println(player + ": Are you Walter White?");
			System.out.println(gymleader +": No... I am GOD");
			System.out.println(player + ": er.... did you help in the development of Hotline Miami?");
			System.out.println(gymleader +": No... I did not...");
			System.out.println(player + ": YOU'RE NO SPENCER YAN! YOU WISH YOU WERE A GOD.");
			System.out.println(gymleader +": Alright alright, lets get this over with, I still need to cook.");
			
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Razor Leaf', or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Razor Leaf")){
			        	System.out.println( playerpoke + " used Razor Leaf!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Razor Leaf' or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(gymleader +": ...My God.... Here's you badge...");
		                System.out.println(player +": *cough*   *Spencer_Yan   *cough*");
		                System.out.println("You received the Crystal Badge!");
		                System.out.println(playerpoke + " learned Vine Whip!");
		    			System.out.println("What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve2);
		    			playerpoke = eve2;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//finish while statement for gym
			//start walk to forest
			System.out.println(player + ": Alright time to ho home!");
			System.out.println(" - Algarm Forest - ");
			System.out.println("???: STOP RIGHT THERE!");
			System.out.println(player + ": ...?");
			System.out.println(badpeeps + ": We're " + badpeeps + " and we're here to steal your pokemon!");
			System.out.println(player + ": Oh you're on! Get ready for battle");
			
			//battle start with team whatever
			playerdeath = false;
			gymj = false;
			gymleader = badpeeps + " grunt";
			gympoke = "Charizard";
			
			playerpokehealth2 = 30;
			gymjpokehealth = 45;
			
			System.out.println(gymleader + " challanges you ");
			System.out.println(gymleader + " sent out " + gympoke);
			System.out.println("You sent out " + playerpoke);
			
			while(playerdeath == false && gymj == false){
		        System.out.println("What will " + playerpoke + " do!");
		        System.out.println("Moves: 'Pound', 'Razor Leaf', 'Vine Whip', or 'Growl'");
				moveset = input.nextLine();
				if (moveset.equalsIgnoreCase("Pound")){
			        	System.out.println( playerpoke + " used Pound!");
			        	gymjpokehealth = gymjpokehealth - 7;
			        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2- 12;
			        	}
			            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Razor Leaf")){
			        	System.out.println( playerpoke + " used Razor Leaf!");
			        	gymjpokehealth = gymjpokehealth - 15;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else if (moveset.equalsIgnoreCase("Growl")){
		                System.out.println(playerpoke + " used Growl!");
		                System.out.println(playerpoke + "'s defense went down");
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used Boulder Dash!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
				
			        else if (moveset.equalsIgnoreCase("Vine Whip")){
		                System.out.println(playerpoke + " used Vine Whip!");
		                gymjpokehealth = gymjpokehealth - 20;
		                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
			        	if (gymjpokehealth > 0){
			        	System.out.println(gymleader +"'s "+ gympoke + " used Rock Scratch!");
			            playerpokehealth2 = playerpokehealth2 - 12;
			        	}
			        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
			        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
			            System.out.println(gymleader + "'s health is " + gymjpokehealth);
			        }
			        else{
			                System.out.println("Please type in 'Pound', 'Razor Leaf' or 'Growl'. Restart the program to continue.");
			                System.exit(0);
			        }

		        //check death
		        if (gymjpokehealth <= 0){
		        		gymj = true;
		                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
		                System.out.println(player + ": THAT'S RIGHT, YOU RUN! GET REKT M8!");
		    			System.out.println(player + ": What?");
		    			System.out.println(playerpoke + " is evolving!");
		    			System.out.println("Congratulations your " + playerpoke + " has evolved to " + eve3);
		    			playerpoke = eve3;
		        }
		        else if (playerpokehealth2 <= 0){
		                playerdeath = true;
		                System.out.println(player +"'s "+ playerpoke + " has fainted!");
		                System.out.println(player +" I... I lost.... I can't be the best anymore...");
		                System.out.println(" . . . " + player +" has blacked out!");
		                System.out.println("Restart the program to continue.");
		                System.exit(0);
		        }
		//end death check
				
				
			}
			
			//battle ends with grunt
			
			System.out.println(" - Home - ");
			System.out.println("MOM: Honey you're home!");
			System.out.println(player + ": Yup! I just beat a gym leader and got a badge!");
			System.out.println("MOM: Good job kiddo! Where are you gonna go now!");
			System.out.println(player + ": ... that's a good question... Let me ask " +rivalname +"." );
			System.out.println(" * you call " + rivalname + " on the phone * ");
			System.out.println(player + ": Hey " + rivalname + ", I just beat the gym leader Oak told me to challange!");
			System.out.println(rivalname + ": DUDE THAT'S AWESOME!");
			System.out.println(player + ": It is... but I don't know where to go after that");
			System.out.println(rivalname + ": You should challange the Pokemon champion!");
			System.out.println(player + ": Oh yea! That's a good idea! I'll go right now!");
			System.out.println(rivalname + ": GOOD LUCK!");
			System.out.println(" - Pokemon League - ");
			System.out.println(player + ": I'm finally here... the Pokemon League... I wonder who the Pokemon Master is...");
			System.out.println("  -  * You open the doors*  -  ");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.out.println(player + ": ...No way...");
			System.out.println("???: Welcome home...son");
			System.out.println(player + ": You...you peice of s-");
			System.out.println("rage boils inside of your heart... Will you 'attack' your father, or will you 'calm down'");
			
			choice3 = input.nextLine();
			
			if(choicepoke.equalsIgnoreCase("attack")){
				System.out.println(player + ": You were here... this entire time?");
				System.out.println(player + ": You could have helped me and mom out...");
				System.out.println("FATHER: Now now... what was I supposed to do...? You left me-");
				System.out.println(player + ": THAT'S A LIE, YOU LEFT US");
				System.out.println("  * You run to your father, in an attempt to punch him*  ");
				System.out.println(" * Your father moves to the side and puts you into a choke hold * ");
				System.out.println(" * With his other hand, he pulls out his cell phone and calls the police * ");
				System.out.println(" * The police come to arrest you * ");
				System.out.println("POLICE: You're coming with us sonny");
				System.out.println("Will you 'run away' or 'let them take you'");
				choice3 = input.nextLine();
				
				if(choice3.equalsIgnoreCase("run away")){
					System.out.println(" * You break free and run away * ");
					System.out.println(" * You run out of the building and hide in a shack for a copuple of days* ");
					System.out.println(" * You come out of hiding, and realise you're a fugitive for attacking the champion  * ");
					System.out.println(player + ": ... I can't go anywhere");
					System.out.println(player + ": MOM and " +rivalname + " probably hate me");
					System.out.println(player + ": ... I have nowhere to go");
					System.out.println(player + ": ... I...I...I guess I have to do this");
					System.out.println(" * You start crying, regretting the attack * ");
					System.out.println(player +": " +playerpoke + "I choose you...");
					System.out.println(player +": " +playerpoke + "...Use Tackel on me... and then run away");
					System.out.println(player +": " +playerpoke + "goodbye...");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game videotaped by: Kevin Wong");
					System.exit(0);
					
				}
				else if(choice3.equalsIgnoreCase("let them take you")){
					System.out.println(" * You let them take you * ");
					System.out.println(player + ": I.. I'm sorry");
					System.out.println("COP: Tell it to the judge");
					System.out.println( " * " + player +" will be spending the rest of his life in jail * ");
					System.out.println(". . .");
					System.out.println(" Game Made by: Ali Malik");
					System.out.println(" Game Videotaped by: Kevin Wong");
					System.exit(0);
				}
				else{
					 System.out.println("Please type in 'run away' or 'let them take you'. Restart the program to continue.");
		             System.exit(0);
				}
			}
			else if (choice3.equalsIgnoreCase("calm down")){
				System.out.println(" * you breathe in and out to calm down * ");
				System.out.println(" I'm all fired up now... I WILL beat you...");
				System.out.println("DAD : heh.... In your dreams");
				
				//battle start with master
				
				
				
				playerdeath = false;
				gymj = false;
				gymleader = "DAD";
				gympoke = "Salamence";
				
				playerpokehealth2 = 45;
				gymjpokehealth = 60;
				
				System.out.println(gymleader + " challanges you ");
				System.out.println(gymleader + " sent out " + gympoke);
				System.out.println("You sent out " + playerpoke);
				
				while(playerdeath == false && gymj == false){
			        System.out.println("What will " + playerpoke + " do!");
			        System.out.println("Moves: 'Pound', 'Razor Leaf', 'Vine Whip', or 'Growl'");
					moveset = input.nextLine();
					if (moveset.equalsIgnoreCase("Pound")){
				        	System.out.println( playerpoke + " used Pound!");
				        	gymjpokehealth = gymjpokehealth - 7;
				        	if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				            System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
				            playerpokehealth2 = playerpokehealth2- 12;
				        	}
				            if (playerpokehealth2 <= 0){playerpokehealth2 = 0; } //if it's less than 0, health goes to 0
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Razor Leaf")){
				        	System.out.println( playerpoke + " used Razor Leaf!");
				        	gymjpokehealth = gymjpokehealth - 15;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used tackle!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				            if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else if (moveset.equalsIgnoreCase("Growl")){
			                System.out.println(playerpoke + " used Growl!");
			                System.out.println(playerpoke + "'s defense went down");
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used Boulder Dash!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
					
				        else if (moveset.equalsIgnoreCase("Vine Whip")){
			                System.out.println(playerpoke + " used Vine Whip!");
			                gymjpokehealth = gymjpokehealth - 20;
			                if (gymjpokehealth <= 0){gymjpokehealth = 0; }
				        	if (gymjpokehealth > 0){
				        	System.out.println(gymleader +"'s "+ gympoke + " used Rock smash!");
				            playerpokehealth2 = playerpokehealth2 - 12;
				        	}
				        	if (playerpokehealth2 <= 0){playerpokehealth2 = 0; }
				        	if (playerpokehealth2 > 0){System.out.println("Your health is " + playerpokehealth2);}
				            System.out.println(gymleader + "'s health is " + gymjpokehealth);
				        }
				        else{
				                System.out.println("Please type in 'Pound', 'Razor Leaf' or 'Growl'. Restart the program to continue.");
				                System.exit(0);
				        }

			        //check death
			        if (gymjpokehealth <= 0){
			        		gymj = true;
			                System.out.println(gymleader +"'s "+ gympoke + " has fainted!");
			                System.out.println("DAD: what... how did I lose");
			                System.out.println(player + ": Easy. You suck. Leave this League. I am the master now.");
			                System.out.println(" * DAD walks out with shame. * ");
			                System.out.println(" * You decide to call your mother and your rival * ");
			                System.out.println(player + ": Hey mom!");
			                System.out.println("MOM: OH HONEY HELLOOOOO!");
			                System.out.println(player + ": Guess who kicked dads butt and became pokemon champion");
			                System.out.println("MOM: OH HONEY I'M SO PROUD OF YOU!");
			                System.out.println(player + ": Thanks MOM! I couldn't do it without you...");
			                System.out.println("MOM: You should tell " + rivalname);
			                System.out.println(player + ": That's a good idea! Let me call him now! Bye MOM!");
			                System.out.println(" * you hang up the phone and dial " + rivalname + "'s number");
			                System.out.println(rivalname + ": Hello?");
			                System.out.println(player + ": Dude... Guess what");
			                System.out.println(rivalname + ": Hmmmm?");
			                System.out.println(player + ": I'm Pokemon Champion now!");
			                System.out.println(rivalname + ": REALLY? NO WAY! CONGRATULATIONS!!");
			                System.out.println(player + ": Thanks man!");
			                System.out.println(rivalname + ": ...but... I hate to break this to you but...");
			                System.out.println(player + ": ...?");
			                System.out.println(rivalname + ": I'm about to take that title away from you");
			                System.out.println(player + ": OH YOU'RE ON!");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			        else if (playerpokehealth2 <= 0){
			                playerdeath = true;
			                System.out.println(player +" I... I lost.... I can't be the best anymore...");
			                System.out.println("DAD: Go home kid... You lost");
			                System.out.println(" * you walk back home, in utter despair * ");
			                System.out.println("MOM: oh you're home! What happened!");
			                System.out.println(player + ": I...I lost...");
			                System.out.println("MOM: That's alright honey! You can't always win right?");
			                System.out.println(player + ": ...I lost...to dad");
			                System.out.println(" * MOM walks towards you and gives you a hug * ");
			                System.out.println("MOM: It's alright, shhhh...");
							System.out.println(" Game Made by: Ali Malik");
							System.out.println(" Game Videotaped by: Kevin Wong");
			                System.exit(0);
			        }
			//end death check
					
					
				}
				
				//battle ends with master
				
			}
			else {
				 System.out.println("Please type in 'calm down' or 'attack'. Restart the program to continue.");
	             System.exit(0);
			}
			//end
			
			
		}
		//end bulbasaur

		else{
			System.out.println("Please type in 'Charmander' 'Squirtle' or 'Bulbasaur'. Restart the program to continue.");
			System.exit(0);
			//if you dun goofed m8
		}
		
	}

}

//Game Made by: Ali Malik
//Game Videotaped by: Kevin Wong