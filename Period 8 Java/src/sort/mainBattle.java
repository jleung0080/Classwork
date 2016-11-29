package sort;

public class mainBattle {

	public static void main(String[] args) {
		Pokemon squirtle = new Pokemon("Squirtle", 26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur", 26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
		System.out.println("Squirtle is preparing to attack with water blast");
		squirtle.attack(bulbasaur, new Attack() {
			@Override
			public void attack(Pokemon target) {
				int newHP = target.getHP()/2;
				target.setHP(newHP);
			}
		});
		System.out.println("Bulbasaur is preparing to attack with poison.");
		bulbasaur.attack(squirtle, new Attack() {
			//poisons target
			@Override
			public void attack(Pokemon target) {
				target.setPoisoned(true);
			}
		});
		squirtle.lapse();
		bulbasaur.lapse();
		printScore(squirtle, bulbasaur);
		
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName()+", HP = "+p1.getHP());
		System.out.println(p2.getName()+", HP = "+p2.getHP());
	}

}
