package sort;

public class RecursionIntro {


	public static void main(String[] args){
//		System.out.println("Using a for loop:");
//		for(int i = 0; i<5; i++){
//			System.out.println("Hello world!");
//		}
//		System.out.println("Without using a for loop:");
//		forLoop(5, new Action() {
//
//			private int value = 0;
//
//			public void act() {
//				System.out.println("Hello world! x"+value);
//				value++;
//			}
//
//
//		});
		
		
		hanoiSolution(4, "A", "B", "C");
	}

	private static void forLoop(int i, Action action){
		if(i<=0){
			return;
		}else{
			action.act();
			forLoop(i-1, action);
		}
	}

	public static int factorial(int x){
		if(x>1){
			return x*factorial(x-1);
		}
		return 1;
	}
	
	public static void hanoiSolution(int numberOfDiscs, String startPeg, String midPeg, String endPeg){
		if(numberOfDiscs<=1){
			System.out.println("Move " +startPeg+" to "+endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
	
	
}
