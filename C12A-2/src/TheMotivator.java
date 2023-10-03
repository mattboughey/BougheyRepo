



public class TheMotivator {
	
	
	
	
	public void other() {
		System.out.println("This should throw some errors hopefully");
		feedback(35);
		
	}
	
	
	
	
	public void feedback(int score) {
		if (score == 100)
			System.out.println("Conflict");
		
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60) {
			System.out.println("That's good ");
			System.out.println("This should hopefully bring an error??");
	}
		else
			System.out.println("Well, what can I say?");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}