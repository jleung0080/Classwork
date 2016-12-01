package sort;

public class RecursionIntro {


	public static void main(String[] args){
		int n = 100;
		System.out.println("The " + n + "th Fibonacci is "+fibonacci(n));
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
		
		
//		hanoiSolution(4, "A", "B", "C");
	}

	private static int fibonacci(int n) {
		if(n<=1){
			return 1;
		}else{
			int previous = fibonacci(n-1);
			int beforePrevious = fibonacci(n-2);
			return previous+beforePrevious;
		}
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
			print("Move " +startPeg+" to "+endPeg);
		}else{
			System.out.println("In order to move "+numberOfDiscs+" over to peg "+endPeg+", we must move"
					+ " "+ (numberOfDiscs-1) +" over to peg "+midPeg+" first");
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1, startPeg, midPeg, endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
	
	private static int count = 1;
	
	public static void print(String s){
		System.out.println("Move #"+count+":"+s);
		count++;
	}
}
