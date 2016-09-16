package introduction;

public class OOPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student jillian = new Senior("Jillian");
		Student jordan = new Junior("Jordan", 2, 10);
		Freshman josh = new Freshman("Josh", "lost");

		
				
		jillian.talk();
		
		
		((Junior)jordan).complain();
		josh.where();
				
				
	}
}
