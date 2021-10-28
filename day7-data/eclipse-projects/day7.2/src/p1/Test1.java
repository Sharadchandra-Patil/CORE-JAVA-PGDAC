package p1;
import static p1.Printer.DATA;

public class Test1 {

	public static void main(String[] args) {
		//direct referencing 
		ConsolePrinter p1=new ConsolePrinter();
		p1.print("Test Message");
		FilePrinter p2=new FilePrinter();
		p2.print("Test Message 2");
		NetworkPrinter p3=new NetworkPrinter();
		p3.print("Test Message 3");
		//can non imple class access i/f constants directly (w/o any i/f name) : NO
		System.out.println("i/f constant "+DATA);

	}

}
