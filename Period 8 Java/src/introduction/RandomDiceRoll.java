package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		
		int[] results = new int[6];
		int totalRolls = 10000;
		
		for(int index = 0; index < totalRolls; index++){
			int result = rollUnfairDie();
			System.out.println("Roll #"+ (index+1)+ ": " +result);
			results[result-1]++;
			
			}
		
		for(int i = 0; i<6; i++){
			System.out.println((i+1)+" appeared " + (double)((int)((double)1000*results[i]/totalRolls)/10.0) + " % of the time.");
		}
		
	}
	
	
	
	//return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random();//returns a double (0,1)
		int roll = (int)(6*rand);//[0,5]
		roll = roll+1;
		return roll;
	}
	
	public static int rollUnfairDie(){
		double random1 = Math.random();
		double random2 = Math.random();
		int roll = (int)(3*(random1+random2));
		roll = roll+1;
		return roll;
	}
	
	
}
