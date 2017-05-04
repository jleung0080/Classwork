package notes;

public class Student extends College{
	
	
	
	public void attending(){
		System.out.print("yay");
		super.notGoing();
		System.out.print("why");
		going();
	}

	public void going(){
		System.out.print("haha");
	}
}

