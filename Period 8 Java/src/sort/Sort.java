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
		if(list1.length<1){
			return list2;
		}else if(list2.length<1){
			return list1;
		}else{

			int[] list = new int[list1.length+list2.length];
			int counter = 0;
			if(list1[0]<list2[0]){
				list[0] = list1[0];
				int[] newList = new int[list1.length-1];
				for(int i = 1; i<list1.length;i++){
					newList[i-1] = list1[i];
				}
				for(int i = 1; i<list.length;i++){
					list[i]= merge(newList,list2)[i-1];
				}
			}else{
				list[0] = list2[0];
				int[] newList = new int[list2.length-1];
				for(int i = 1; i<list2.length;i++){
					newList[i-1] = list2[i];
				}
				for(int i = 1; i<list.length;i++){
					list[i]= merge(list1,newList)[i-1];
				}
			}
			return list;
		}
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
