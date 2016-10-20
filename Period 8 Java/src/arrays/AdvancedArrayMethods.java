package arrays;

public class AdvancedArrayMethods {
	static int[] array;
	public static void main(String[] args) {
		String[] array = {"a", "b", "c", "d", "e", "f", "g", "h"};
		swap(array, 0,array.length-1);
	}

	private static void swap(String[] arr, int i, int j) {


	}

	private static void methodA(int[] someArray){
		int[] newArray = new int[someArray.length];
	}





	public static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i=0; i<original.length;i++){
				target[i] = original[i];
			}
		}else{
			System.out.println("ERROR: tried to copy arrays of two different lengths");
		}
	}




}
