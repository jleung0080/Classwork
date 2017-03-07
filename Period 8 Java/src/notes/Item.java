package notes;

public class Item {
	
	private String description;
	private boolean purchased;
	
	public Item(String description){
		this.description = description;
		purchased = false;
	}
	
	public void setPurchased(boolean b){
		this.purchased = b;
	}

	public boolean isPurchased() {
		// TODO Auto-generated method stub
		return purchased;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	
	
	
	
}
