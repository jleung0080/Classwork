package test;

public class blackJackPlayer {
        private String name;
        private int handValue;
        private int aceCounter;

        private String[] card = {"Ace", "Two", "Three", "Four","Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        private int[] values = {11,2,3,4,5,6,7,8,9,10,10,10,10};

        public blackJackPlayer(String nameInput){
            name = nameInput;
            handValue = 0;
            aceCounter = 0;
        }

        public int getHandValue(){
                return handValue;
        }


        private void hit(){
            int pick = (int)(Math.random()*card.length);
            
            if(pick == 0){
                JoeyClass.print(name + " was dealt an "+card[pick]);
                handValue += values[pick];
                aceCounter++;
            } else{
                JoeyClass.print("was dealt a"+card[pick]);
                handValue += values[pick];
            }
            
            if(isBust() && aceCounter>0){
                aceCounter--;
                handValue-=10;
            }
            
        }
        
        private boolean isBust(){
        return handValue > 21;
    
    }
}