package p1;

public class NetworkPrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Sending  "+message+" to the server");
	}
	//can imple class add new functionailty ? : YES
	public void encrypt(String mesg)
	{
		System.out.println("Encrypting a mesg : "+mesg);
	}
}
