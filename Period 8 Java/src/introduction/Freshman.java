package introduction;

public class Freshman extends Student {
	
	String status;
	
	public Freshman(String name, String location) {
		super(name);
		this.status = location;
	}

	public void where(){
		if(this.status == "lost")
			System.out.println("I'm lost");
		else
			System.out.println("I found my class!");
	}
}
