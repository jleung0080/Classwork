package chatbot;

public class JoeyHello implements Chatbot{
	
	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponse = {"We already said hello. "
			+ "Let's move the conversation along.","You said hello already, "
					+ "did you forget?"};
	private String[] angryResponse = {"Okay seriously, stop saying hi.","What"
			+ " is wrong with you and saying hello?"};
	
	private int helloCount;
	
	public JoeyHello(){
		helloCount = 0;
		while(inHelloLoop){
			helloCount++;
			printResponse();//helper method
			helloResponse = JoeyMain.promptInput();
			//to negate use ! as not
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				JoeyMain.promptForever();
			}
		}
	}
	
	

	private void printResponse() {
		if(helloCount>4){
			int responseSelection = (int)(Math.random()*angryResponse.length);
			JoeyMain.print(angryResponse[responseSelection]);
		}else{
			int responseSelection = (int)(Math.random()*calmResponse.length);
			JoeyMain.print(calmResponse[responseSelection]);
		}
		
	}



	public void talk() {
		// TODO Auto-generated method stub
		
	}

	public boolean isTriggered(String userInput) {
		// TODO Auto-generated method stub
		if(JoeyMain.findKeyword(userInput, "hello", 0)>=0){
			return true;
		}
		if(JoeyMain.findKeyword(userInput, "hi", 0)>=0){
			return true;
		}
		if(JoeyMain.findKeyword(userInput, "hey", 0)>=0){
			return true;
		}
		return false;
	}

}
