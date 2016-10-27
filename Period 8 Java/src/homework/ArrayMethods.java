package homework;



public class ArrayMethods {

	public static void main(String[] args) {
		int[] nums = {9,6,3,4,3,8,9};
		int[] sorted = {9,6,3,4,3,6,7};
		int[] asd = {10,9,8,7,6,5,4,3,-2,-5};
		System.out.println(searchSorted(asd, -5));;
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

	public static int searchSorted(int[] array, int key){
		int bottom = 0;
		int top = array.length;
		for(int i=0; i<array.length; i++){
			int index = (bottom+top)/2;
			if(array[index] > key){
				bottom = index;
			}else{
				if(array[index]<key){
					top = index;
				}
				else{
					if(array[index] == key){
						return index;
					}
				}
			}
		}
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
		for(int i = 0;i< (int)(array.length/2); i++ ){
			swapInt(array, i, array.length-i-1);
		}
	}

	public static int countDifferences(int[] array1, int[] array2){
		int diff = 0;
		for(int i=0;i<array1.length;i++){
			if(array1[i] != array2[i]){
				diff++;
			}
		}
		return diff;
	}


	public static int longestConsecutiveSequence(int[] array){
		int counter = 1;
		int highest = 1;
		if(array.length <= 1){
			return 1;
		}else{
			for(int i = 1; i<array.length-1; i++){
				if(array[i] == array[i-1]+1){
					counter++;
				}else{
					if(counter>highest){
						highest = counter;			
						counter = 1;						
					}else{
						counter = 1;						
					}
				}
			}
			return highest;
		}
	}

public static int longestSharedSequence(int[] array1, int[] array2){
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
	        int longest = 1;
	        boolean isSequence = false;
	        int sequenceLength = 0;
	        if(array1.length > array2.length){
	            for(int i = 0; i < array1.length; i++){
	                for(int j = 0; j < array2.length; j++){
	                    if(array1[i] == array2[j]){
	                        isSequence = true;
	                    }else{
	                        isSequence = false;  
	                    }
	                    if(isSequence){
	                    	sequenceLength ++;
	                        i++;
	                    }else if(sequenceLength > longest){
	                        longest = sequenceLength;
	                        sequenceLength = 0;
	                    }else{
	                    	sequenceLength = 0;
	                    }
	                }
	            }
	        }else{
	            for(int i = 0; i < array2.length; i++){
	                for(int j = 0; j < array1.length; j++){
	                    if(array2[i] == array1[j]){
	                        isSequence = true;
	                    }else{
	                        isSequence = false;  
	                    }
	                    if(isSequence){
	                    	sequenceLength ++;
	                        i++;
	                    }else if(sequenceLength > longest){
	                        longest = sequenceLength;
	                        sequenceLength = 0;
	                    }else{
	                    	sequenceLength = 0;
	                    }
	                }
	            }
	        }
	        if(sequenceLength > longest){
	            return sequenceLength;
	        }else{
	            return longest;
	        }
	        
	    }

	public static int[] generateDistinctItemsList(int n){
		int[] list = new int[n];
		boolean same;
		int number;
		for(int i=0; i<n; i++){
			same = false;
			number = (int)(Math.random()*2*n+1);
			for(int j=0; j<i; j++){
				if(list[j] == number){
					same = true;
					break;
				}
			}
			if(same){
				i--;
			}else{
				list[i] = number;
			}
		}
		return list;
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