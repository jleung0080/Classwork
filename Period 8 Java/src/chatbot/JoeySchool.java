package chatbot;

public class JoeySchool extends Object implements Chatbot {
	
	private boolean inSchoolLoop;
	private String schoolResponse;
	
	
	
	public void talk() {
		inSchoolLoop = true;
		while(inSchoolLoop){
			JoeyMain.print("(Type 'quit' to go back.)");
			//static call on prompt input method from JoeyMain class
			schoolResponse = JoeyMain.promptInput();
			if(schoolResponse.indexOf("quit")>=0){
				inSchoolLoop = false;
				JoeyMain.promptForever();
			}
			JoeyMain.print("That's my favorite part about school.");
		}

	}

}
