package sort;

public class Pokemon {
	int level;
	int hp;
	String name;
	boolean poisoned;

	private void status(int lev, int startHp){
		level = lev;
		hp = startHp;
	}
	
	private void iChooseYou(){
		System.out.print(name);
		System.out.print(name);
	}
	
	private String getName(){
		return name;
	}
	
	private void setHP(int newHP){
		hp = newHP;
	}
	
	private void setPoisoned(boolean b){
		poisoned = b;
	}
	
	private void lapse(){
		if(poisoned){
			hp -= 15;
		}
	}
	
}
