package notes;

import java.util.ArrayList;

public class ListRunner {
	
	static ArrayList<Item> shoppingList;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] justDescriptions = getDescriptions();
		initLists(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void printPurchasedItems() {
		// TODO Auto-generated method stub
		for(int i = 0; i<shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.print(shoppingList.remove(i).getDescription());
				i--;
			}
		}
	}

	private static void doSomeShopping() {
		// TODO Auto-generated method stub
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);

	}

	private static void initLists(String[] justDescriptions) {
		// TODO Auto-generated method stub
		shoppingList = new ArrayList<Item>();
		for(String s: justDescriptions){
			shoppingList.add(new Item(s));
		}
	}

	private static String[] getDescriptions() {
		// TODO Auto-generated method stub
		String[] text = {"coffee", "video games","potato chips","A life"};
		return text;
	}

}
