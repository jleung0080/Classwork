package introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void talk(){
		super.talk();
		System.out.println("...and I am a senior!");
	}
	
}
