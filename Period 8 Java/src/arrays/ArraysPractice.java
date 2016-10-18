package arrays;

public class ArraysPractice {

	static boolean[] boos3;

	public static void main(String[] args) {
		//how do you time a process?

		long currentTime = System.currentTimeMillis();

		int[] fiftyNumbers = new int[5000];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers, 1000);
		print(fiftyNumbers);
		rollDice(fiftyNumbers, 3);
		//count each die roll and provide a percentage
		print(fiftyNumbers);
		countResult(fiftyNumbers, 3);


		//long endTime = System.currentTimeMillis();
		//System.out.println("The process took "+(endTime-currentTime)+" milliseconds.");
	}


	private static void countResult(int[] z, int numberOfDice) {
		int[] results = new int[numberOfDice*6-1];
		for(int i=0; i<z.length; i++){
			for(int a=numberOfDice;a< numberOfDice*6+1;a++){
				if(z[i] == a){
					results[a-numberOfDice]++;
				}
			}
		}
		for(int i=0; i<results.length; i++){
			System.out.println((i+numberOfDice)+" was rolled "+(int)(100*(double)results[i]/z.length)+ "% of the time");
		}
	}

	private static void rollDice(int[] z, int numberOfDice) {
		// TODO Auto-generated method stub
		for(int i=0; i<z.length; i++){
			int roll = 0;
			for(int j=0;j<numberOfDice;j++){
				roll = roll + (int)(Math.random()*6+1);
			}
			z[i] = roll;
		}
	}


	private static void randomize(int[] z, int max) {
		// TODO Auto-generated method stub
		for(int i=0; i<z.length; i++){
			z[i] = (int)(Math.random()*max);
		}
	}


	private static void print(int[] z) {
		// TODO Auto-generated method stub
		for(int i=0; i<z.length; i++){
			System.out.println(z[i]);
		}
	}

	private static void populate(int[] z) {
		// TODO Auto-generated method stub
		for(int i=0; i<z.length; i++){
			z[i] = i+1;
		}
	}








	/**private void demonstratePassByValue(){

    }

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";

	}


	private static void print(String[] s) {
		for (int i = 0;i<s.length;i++){
			System.out.println(s[i]);
		}

	}


	private static void standardPopulate(String[] s) {
		for(int i = 0; i<s.length; i++){
			s[i] = "String #"+(i+1);
		}

	}

	private static int increase(int i){
		return i++;
		//only increases i not the actual number.
	}
	 */




	public static void initializingArraysExample(){
		// TODO Auto-generated method stub
		boolean[] boos1 = new boolean[3];
		//this can only be done at declaration bc it sets size and content;
		boolean[] boos2 = {false, false, false};
		//boos3 = {false, true, true};
		//this is all that will work
		boos3 = new boolean[3];


		/**2 ways of iterating through an array
		standard for loop
			- the index is important to keep track of 
			- you need to customize the order


		for (int i=0; i<boos1.length; i++){
			System.out.println(boos1[i]);
		}

	 		for each loop
		 		-the index isn't important
		 		-don't need to customize
		  		- auto assigns a "handle"





		for(boolean b: boos1){
			System.out.println(b);

		}
		 */

		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		//.. but it is repetitive


		//try a loop to instantiate;
		for(int i = 0; i<someStrings1.length;i++){
			someStrings1[i] = "a new String";
		}

		for(String s: someStrings1){
			System.out.println(s);
		}


	}

}
