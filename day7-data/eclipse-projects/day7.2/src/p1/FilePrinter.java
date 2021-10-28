package p1;

public class FilePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Storing  "+message+" in a file");
		//Can implementation class DIRECTLY (w/o using i/f name.constant) access i/f constants? : YES
		System.out.println("i/f constant "+DATA);
	}
}
