package dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	// Objective : accept join date of the employee from user (Scanner) n display
	// it.
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create single instance of java.text.SimpleDateFormat(String pattern)
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");// day-mon-yr
			System.out.println("Enter join date : day-mon-yr");
			Date joinDate = sdf.parse(sc.next());
			//=> parsing success
			System.out.println("join date "+joinDate);//Date's toString : un formatted
			System.out.println("formatted join date "+sdf.format(joinDate));
			System.out.println("end of try...");
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		System.out.println("main continues...");

	}

}
