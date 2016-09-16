package introduction;

public class Junior extends Student {

	int scheduleLength;
	
	public Junior(String name, int start, int end) {
		super(name);
		this.scheduleLength = end-start+1;
	}

	public void complain(){
		System.out.println("My day is "+this.scheduleLength+" periods long!");
	}
}
