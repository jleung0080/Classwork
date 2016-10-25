package homework;



public class ArrayMethods {

	public static void main(String[] args) {
		double[] nums = {1.5, 6.66, -10.13, 15.99, .25, -.77,0};
		int[] numss = {1, 16, 10, 11, 5, -6};
		int[] sorted = {9,6,3};
		printDouble(getStats(nums));
	}

	private static void printDouble(double[] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}
	private static void printInt(int[] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

	public static int searchUnsorted(int[] arrayToSearch, int key){
		for(int i = 0; i<arrayToSearch.length; i++){
			if (arrayToSearch[i] == key){
				return i;
			}
		}
		return -1;
	}

	public static int searchSorted(int[] sortedArrayToSearch, int key){
		for(int i = 0; i<sortedArrayToSearch.length; i++){
			if (sortedArrayToSearch[i] == key){
				return i;
			}
		}
		/**
		 * this method is exactly like the one above, except the parameter sortedArrayToSearch will
		 * always be sorted in DESCENDING order. Again return the index of the key or return -1
		 * if the key is not in the array
		 * 
		 * Note: You should attempt to write a method that is more efficient that searchUnsorted
		 * */
		return -1;
	}

	public static boolean isSorted(int[] array){
		int yesCount = 0;
		for(int i = 0; i < array.length-1;i++){
			if(array[i] >= array[i+1]){
				yesCount++;
			}
		}
		if(yesCount == array.length-1){
			return true;
		}else{
			return false;
		}
	}
	
	private static void sortDouble(double[] array){
		for(int i = 0;i<array.length-1; i++ ){
			for(int index = 0; index<array.length-1; index++){
				if(array[index]<array[index+1]){
					swapDouble(array, index, index+1);
				}
			}
			
		}
	}
	private static void sortInt(int[] array){
		for(int i = 0;i<array.length-1; i++ ){
			for(int index = 0; index<array.length-1; index++){
				if(array[index]<array[index+1]){
					swapInt(array, index, index+1);
				}
			}
			
		}
	}

	public static double[] getStats(double[] array){
		double[] stats = new double[6];
		double lower = 0;
		double higher = 0;
		double sum = 0;
		sortDouble(array);
		stats[1] = array[0];
		stats[2] = array[array.length-1];

		for(int i=0; i<array.length; i++){
			sum = sum+array[i];
		}
		stats[0] = sum/array.length;


		for(int i=0; i<array.length; i++){
			if(array[i]<stats[0]){
				lower++;
			}else{
				higher++;
			}
		}
		stats[4] = higher;
		stats[5] = lower;

		if(array.length%2 == 0){
			stats[3] = ((double)array[array.length/2]+(double)array[array.length/2-1])/2;
		}else{
			stats[3] = array[(array.length-1)/2];
		}

		return stats;
	}

	public static void reverseOrder(int[] array){
		int holder;
		for(int i = 0;i< (int)(array.length/2); i++ ){
			swapInt(array, i, array.length-i-1);
		}

		/**
		 * this method reverses the order of the array passed to it.
		 * Not that this method does not have a return type. You do not need to copy the array first
		 * Furthermore, note that the array is not necessarily in any *particular* order. It may be 
		 * in a random order, though you still need to reverse whatever order it is in
		 * 
		 * Example:
		 * array = {5, 1, 9, 10, 16, -6}
		 * after calling this method
		 * array = {-6, 16, 10, 9, 1, 5}
		 * 
		 * */
	}

	public static int countDifferences(int[] array1, int[] array2){
		/**Here, you will write an method that returns the number of values in two arrays 
		 * that are NOT the same (either in value OR location).
		 * The arrays ALWAYS have the same length
		 * Examples:
		 * countDifferences({1,2,3},{1,2,3}) returns 0, since these arrays are exactly the same
		 * countDifferences({3,2,3,4},{3,2,5,4}) returns 1, since '3','2', and '4' are same value, same location, but the 3 and 5 are different
		 * countDifferences({4,4,4,4},{1,2,3,4}) returns 3, since '4' is only at the same index ONE time and three others are not
		 * countDifferences({1,2,3},{1,3,2}) returns 2, since '2' and '3' are both present, but different locations
		 * 
		 * */
		return 0;
	}


	public static int longestConsecutiveSequence(int[] array1){

		/**This method counts the longest consecutive sequence in an array.
		 * It does not matter where the sequence begins
		 * If there are no consecutive numbers, the method should return '1'
		 * 
		 * Examples:
		 * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
		 * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
		 * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
		 * */

		return 0;
	}

	public static int longestSharedSequence(int[] array1, int[] array2){
		int max = 0;
		int count = 0;

		for(int seqStart = 0; seqStart < array1.length; seqStart++){
			int seqEnd = seqStart;
			int[] seq = getSequence(seqStart, seqEnd, array1);
			if(checkSequence(seq, array2)){
				count++;
				if(count>max){
					max = count;
				}
			}
		}

		/**This method counts the longest unbroken, shared sequence in TWO arrays.
		 * The sequence does NOT have to be a consecutive sequence
		 * It does NOT matter where the sequence begins, the arrays might not be the same length
		 * 
		 * Examples:
		 * longestSequence({9,6,3,4,3,8,9}, {9,6,3,4,3,6,7}) returns '5', since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long 
		 * longestSequence({0,9,6,3,4,3,8,9}, {1,2,9,6,3,4,3,6,7}) returns '5', 
		 *          since the sequence '9,6,3,4,3' is in both arrays and is 5 integers long, it doesn't matter that the sequence begins at different indices 
		 * longestSequence({9,6,1,4,3,6,7,9}, {9,6,5,8,3,6,7,0}) returns '3', since the sequence '3,6,7' is in both arrays and is 3 integers long
		 * */

		return 0;
	}

	private static boolean checkSequence(int[] seq, int[] array2) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int[] getSequence(int seqStart, int seqEnd, int[] array1) {
		//returns a sub array containing the elements in array1 from seqStart to seqEnd.
		return null;
	}

	public static int[] generateDistinctItemsList(int n){
		/**
		 * This method needs to generate an int[] of length n that contains distinct, random integers
		 * between 1 and 2n 
		 * The method will be tested by verifying that the array you return is n items long,
		 * contains only entries between 1 and 2n (inclusive) and has no duplicates
		 * 
		 * */
		return null; 
	}


	public static void cycleThrough(int[] array, int n){
		if(n>0){
			for(int i = n; i>0; i--){
				for(int index = array.length-1; index > 0; index --){
					swapInt(array,0,index);
				}
			}
		}else{
			for(int i = n; i<0; i++){
				for(int index = 0; index < array.length-1; index++){
					swapInt(array,index,array.length-1);
				}
			}
		}



		/** This problem represents people moving through a line.
		 * Once they get to the front of the line, they get what they've been waiting for, then they 
		 * immediately go to the end of the line and "cycle through" again.
		 * 
		 * This method reorders the array so that it represents what the array would look like
		 * after it had been cycled through an n number of times.
		 * For example, cycleThrough({2,1,5,6}}, 1) after executing, array == {1,5,6,2} 
		 * because '2' (the person at the front of the line) cycled through and is now at the end of the line
		 * 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 2) after executing, array == {4,2,8,6,2,9,3,7} 
		 * because '3' and '7' (the TWO people at the front of the line) cycled through and are now at the end of the line
		 * 
		 * Likewise,
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 0) after executing, array == {3,7,4,2,8,6,2,9}  (no movement)
		 * and the most interesting case, 
		 * cycleThrough({3,7,4,2,8,6,2,9}}, 49) after executing, array == {7,4,2,8,6,2,9,3}  
		 * Because after cycling through 49 times, everyone had a chance to go through 6 times, but '3'
		 * was able to go through one more time than anyone else
		 * 
		 * CHALLENGE
		 * For extra credit, make your method handle NEGATIVE n
		 * */
	}

	private static void swapDouble(double[] array, int first, int second){
		double holder = array[first];
		array[first] = array[second];
		array[second] = holder;
	}


	private static void swapInt(int[] array, int first, int second){
		int holder = array[first];
		array[first] = array[second];
		array[second] = holder;
	}
}