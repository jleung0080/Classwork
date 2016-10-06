package test;

import java.util.Scanner;

public class JoeyClass implements Chatbot{
	blackJackPlayer dealer = new blackJackPlayer("Dealer", 999999999);
	blackJackPlayer player = new blackJackPlayer("", 1000);
	private int annoyedCounter = 0;


	private String[] annoyed = {"Can you please do an action that actually exists?", "How many times do I have to tell you to"
			+ " do an action that actually exists?", "You aren't very good at following instructions.", "What kind of idiot can't follow instructions?", "Please listen to my instructions dumbo."};
	private String[] praiseBet = {"That's a big bet.", "How much money do you have?", "*Whistles* Ey boss."};
	private String[] praiseMove = {"Wow that's a brave move.", "Big baller shot caller huh?", "Feeling lucky today?"};
	private String[] bust = {"Feelsbadsmans", "That's a bust", "Bad move"};

	static Scanner input = new Scanner(System.in);
	private int playerBet;
	//to create blackjack; ai deals after player places a bet. deals 2 cards per player and player makes moves until bust or stand
	//then dealer goes until and if he has 17 or more he instantly stands if he doesn't he hits again


	public static void print(String s){
		System.out.println(s);
	}

	public void talk() {
		player.changeName(DanielMain.user);
		while (player.wealth > 0){
			
			buyIn();
			dealer.hit();
			dealer.hit();
			player.hit();
			player.hit();
			player.blackjackTest();
			while (!player.isBust() || !player.stand){
				promptAction();
				// ask them what they wanna do next : hit, stand
				//if hit -> player.hit()
				//if player.isBust()  -> results()
			}
			player.stand = false;
			while (dealer.handValue<17){
				dealer.hit();
			}

		}
	}

	private void promptAction(){
		print("Would you like to hit or stand?");
		String action = DanielMain.promptInput();
		if (!isHit(action) && !isStand(action)){
			print("Please select an action.");
		}
		if (isHit(action) && !isStand(action)){
			hitResponse();
			player.hit();
		}
		if (!isHit(action) && isStand(action)){
			standResponse();
			player.stand = true;
		}
		if (isHit(action) && isStand(action)){
			dumbResponse();
		}

	}

	private boolean isHit(String s){
		if(DanielMain.findKeyword(s, "hit", 0)>=0){
			return true;
		}
		return false;
	}
	private boolean isStand(String s) {
		if(DanielMain.findKeyword(s, "stand", 0)>=0){
			return true;
		}
		return false;
	}


	private void standResponse() {
		print("Okay, the value of your hand is "+ player.handValue);
	}

	private void dumbResponse() {
		//replies annoyingly if 4+ mistakes were made
		if(annoyedCounter>4){
			int responseSelection = (int)(Math.random()*annoyed.length);
			print(annoyed[responseSelection]);
		}else {
			print("I said, you may only select one action.");
		}
	}

	private void bustResponse(){
		if (player.isBust() == true){
			print(bust[(int)(Math.random()*bust.length)]);
		}
	}

	private void hitResponse(){
		//praises a hit if hand was already 15+
		int responseSelection = (int)(Math.random()*praiseMove.length);
		print(praiseMove[responseSelection]);
	}



	private static int getBet() {
		print("Please place your bet. (Must be minimum of 25 and maximum of 500)");
		String integerString = DanielMain.promptInput();
		boolean isInteger = false;
		int value = 0;
		while(!isInteger){
			try{
				value = Integer.parseInt(integerString);
				//will not continue if an error above is thrown
				isInteger = true;//exits loop if entry is valid
			}catch(NumberFormatException e){
				print("You must enter an number between 25 and 500. You better try again.");
				integerString = DanielMain.promptInput();
			}
		}
		return value;
	}

	private void buyIn(){
		boolean loop = true;
		while(loop){
			playerBet = getBet();
			if(playerBet<25){
				if(annoyedCounter>3){
					print(annoyed[(int)(Math.random()*praiseBet.length)]);
				}else{
					annoyedCounter++;
				}
			}
			if(playerBet>500){
				annoyedCounter++;
			}
			if(playerBet>=25 && playerBet<=500){
				loop = false;
				if(playerBet>250){
					int responseSelection = (int)(Math.random()*praiseBet.length);
					print(praiseBet[responseSelection]);
					print("Your current bet is "+playerBet);
				}else{
					print("Your current bet is "+playerBet);
				}
			}
		}

	}

	private void results(){
		if(player.isBust()){
			if(dealer.isBust()){
				print("This round is a draw.");
			}else{
				print("You lose.");
				player.wealth -= playerBet;
			}
		}else{
			if(dealer.isBust()){
				print("You win!");
				player.wealth += playerBet;
			}else{
				if(player.handValue < dealer.handValue){
					print("You lose.");
					player.wealth -= playerBet;
				}
				if(player.handValue == dealer.handValue){
					print("This round is a draw.");
				}
				if(player.handValue > dealer.handValue){
					print("You win!");
					player.wealth += playerBet;
				}
			}
		}
	}

	public void run(){
		while (player.wealth > 0){
			buyIn();
			dealer.hit();
			dealer.hit();
			player.hit();
			player.hit();
			while (!player.isBust() || !player.stand){
				// ask them what they wanna do next : hit, stand
				//if hit -> player.hit()
				//if player.isBust()  -> results()
			}
			while (dealer.handValue<17){
				dealer.hit();
			}
		}

		//you have run out of money
	}



	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		return false;
	}

}