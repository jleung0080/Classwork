package arrays;

public class ArraysPractice {
	
	static boolean[] boos3;

	public static void main(String[] args) {
		//how do you time a process?
		
		long currentTime = System.currentTimeMillis();
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
		
		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took "+(endTime-currentTime)+" milliseconds.");
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
