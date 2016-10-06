package test;

import java.util.Scanner;

public class JoeyClass implements Chatbot{
    private int annoyedCounter;
    
    
    private String[] annoyed = {"Can you please do an action that actually exists?", "How many times do I have to tell you to"
            + " do an action that actually exists?", "You aren't very good at following instructions."};
    private String[] praiseBet = {"That's a big bet.", "How much money do you have?", "*Whistles* Ey boss."};
    private String[] praiseMove = {"Wow that's a brave move.", "Big baller shot caller huh?", "Feeling lucky today?"};
    private String[] card = {"Ace", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private int[] values = {1,2,3,4,5,6,7,8,9,10,10,10,10};
    private String[] bust = {"Feelsbadsmans", "That's a bust", "Bad move"};
    
    static Scanner input = new Scanner(System.in);
    //to create blackjack; ai deals after player places a bet. deals 2 cards per player and player makes moves until bust or stand
    //then dealer goes until and if he has 17 or more he instantly stands if he doesn't he hits again
    
    
    private int myHandValue;
    private int dealerHandValue;
    private int playerBet;
    private int currentWealth;
    
    public JoeyClass(){
            myHandValue = 0;
            myCards = "";
            dealerHandValue = 0;
            dealersCards = "";
            playerBet = 0; //??
    }
    
    public static void print(String s){
        System.out.println(s);
    }
    
    public void talk() {
        
    }

    public boolean isStand(String s) {
        if(DanielMain.findKeyword(s, "stand", 0)>=0){
            return true;
        }
        return false;
    }
    

    private void standResponse() {
        print("Okay, the value of your hand is "+myHandValue);
    }
    
    private void dumbResponse() {
        //replies annoyingly if 3+ mistakes were made
        if(annoyedCounter>3){
            int responseSelection = (int)(Math.random()*annoyed.length);
            print(annoyed[responseSelection]);
        }else {
            print("I said, please choose to stand or hit.");
        }
    }
    
    private void praiseMove(){
        //praises a hit if hand was already 15+
            int responseSelection = (int)(Math.random()*praiseMove.length);
            print(praiseMove[responseSelection]);
    }
    
    
    
    
    private void buyIn(){
        //find out how to move the name and input over
        //find out how to retrieve int from input
        print("Welcome "+DanielMain.user+", enter a number of dollars you wish to bet.");
        playerBet = input.nextInt();
        if(playerBet<25){
            if(annoyedCounter>3){
                print(annoyed[(int)(Math.random()*praiseBet.length)]);
            }else{
                print("That bet is too low, the minimum bet is $25, and the maximum bet is $500");
                annoyedCounter++;
            }
        }
        if(playerBet>500){
            print("That bet is too high, please place a bet lower than $500.");
            annoyedCounter++;
        }
        if(playerBet>=25 && playerBet<=500){
            if(playerBet>250){
                int responseSelection = (int)(Math.random()*praiseBet.length);
                print(praiseBet[responseSelection]);
                print("Your current bet is "+playerBet);
            }else{
                print("Your current bet is "+playerBet);
            }
        }
        
        
    }
        
   private void revealFacedown(){
        int pick = (int)(Math.random()*card.length);
        
        if(pick == 0){
            print("My other card was an "+card[pick]);
            dealerHandValue = dealerHandValue + values[pick];
        }
        else{
            print("My other card was a "+card[pick]);
            dealerHandValue = dealerHandValue + values[pick];
        }
   }

@Override
public boolean isTriggered(String userInput) {
	// TODO Auto-generated method stub
	return false;
}
   
   
    
}