package p1;

public class Test4 {

	public static void main(String[] args) {
		// LHS : array type of ref ---> array : of references(i/f type of ref)
		Printer[] printers = { new ConsolePrinter(), new FilePrinter(), new NetworkPrinter() };
		// printers[0] ---> ConsolePrinter , printers[1] ---> FilePrinter ,printers[2]
		// ---> NetworkPrinter ,
		// invoke print method on all these different type of printers
		for (Printer p : printers) {
			p.print("Some Message!!!!");// run time poly
			if (p instanceof NetworkPrinter)
				((NetworkPrinter) p).encrypt("password");
			else
				System.out.println("Invalid type : no encryption facility!!!!!");
		}
	}

}
