package sort;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arrayToSort={133,0,-5,31,12,12,2};
//		System.out.println("- - - SELECTION SORT - - -");
//		System.out.println(Arrays.toString(arrayToSort));
//		selectionSort(copy(arrayToSort));
		
		int[] arrayToSort={133,0,-5,31,12,12,2};
		int[] sorted = mergeSort(arrayToSort);
		for(int a:sorted){
			System.out.println(a);
		}
		
	}
	
	private static int[] mergeSort(int[] list){
		if(list.length==1){
			return list;	
		}else{
			int[] front = new int[list.length/2];
			int[] back = new int[list.length-front.length];
			for(int i = 0; i<front.length;i++){
				front[i] = list[i];
			}
			for(int i = front.length; i<list.length;i++){
				back[i-front.length] = list[i];
			}
			return merge(mergeSort(front),mergeSort(back));
		}
	}

	private static int[] merge(int[] list1, int[] list2) {
		// TODO Auto-generated method stub
		int[] list = new int[list1.length+list2.length];
		int counter = 0;
		for(int i = 0; i < list1.length;i++){
			for(int j = 0; j < list2.length;j++){
				if(list1[i]<list2[j]){
					list[counter]=list1[i];
					counter++;
					break;
				}else{
					list[counter]=list2[j];
					counter++;
				}
			}
		}
		return list;
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}

}
