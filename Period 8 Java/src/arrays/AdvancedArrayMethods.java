package arrays;

public class AdvancedArrayMethods {
	static int[] array;
	public static void main(String[] args) {
		listPrimes(120);

	}
	private static void listPrimes(int limit){
		int lastToCheck = (int)(Math.sqrt(limit));
		boolean[] numbers = new boolean[limit+1];
		for(int i = 0; i<limit+1; i++){
			numbers[i] = true;
		}
		numbers[0] = false;
		numbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n" +prime + " is prime, crossing off:");
				for(int i = (int)(Math.pow(prime, 2)); i<limit+1; i+=prime){
					System.out.print(i+", ");
					numbers[i]= false;
				}
			}
		}
		System.out.println("\nThe primes are:");
		for(int index = 0; index<numbers.length; index++){
			if(numbers[index]){
				System.out.print(index + ", ");
			}
		}
	}







}
