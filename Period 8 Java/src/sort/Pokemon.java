package sort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level) {
		this.name = name;
		this.level = level;
		this.poisoned = false;
		hp = 100;
	}
	
	public void attack(Pokemon target, Attack attack){
		if(Math.random()<.9){
			attack.attack(target);
			System.out.println("The attack hit");
		}else{
			System.out.println("The attack missed");
		}
	}
	
	private void iChooseYou(){
		System.out.println(name+ " " +name);
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
