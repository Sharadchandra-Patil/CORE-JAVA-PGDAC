package tester;

public class TestCheckedExcception2 {
//throws : used to inform javac : main method is NOT handling the Interruptedexc --BUT delegating it 
	//to the caller : main thread
	public static void main(String[] args) throws InterruptedException {

		System.out.println("Before");
		Thread.sleep(2000);// javac FORCES handling of the checked exc : InterruptedException
		System.out.println("After");
		System.out.println("main continued..");

	}

}
