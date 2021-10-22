package test_inheritance;

import java.util.Scanner;
import inheritance.*;

public class EventOrganizer {

	public static void main(String[] args) {
		// scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter event capacity");
		// create suitable array , to hold all participant(Student / Faculty.......)
		// details
		Person[] participants = new Person[sc.nextInt()];// 1 array object
		int counter = 0;
		boolean exit = false;
		while (!exit) {
			System.out.println(
					"Options 1. Register Student 2. Faculty Registration 3. Display Pariticipants' details 10.Exit");
			System.out.println("Choose Option");
			switch (sc.nextInt()) {
			case 1:// student reg
				if (counter < participants.length) {
					System.out.println("Enter student details : fn,  ln,  gradYear,  courseName,  fees,  marks");
					participants[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(),
							sc.nextDouble(), sc.nextInt());// up casting
				} else
					System.out.println("Event Full!!!!!");

				break;
			case 2:// faculty reg
				if (counter < participants.length) {
					System.out.println("Enter Faculty details : fn,  ln,  exp in yrs sme");
					participants[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());// up casting
				} else
					System.out.println("Event Full!!!!!");

				break;
			case 3:// display all particiapnts details
				for (Person p : participants)
					if (p != null)
						System.out.println(p);// run time poly.
				break;

			case 10:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
