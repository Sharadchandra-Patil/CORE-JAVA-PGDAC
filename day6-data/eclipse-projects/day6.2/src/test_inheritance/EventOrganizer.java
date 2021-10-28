package test_inheritance;

import java.util.Scanner;

import inheritance.Faculty;
import inheritance.Person;
import inheritance.Student;

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
			System.out.println("Options 1. Register Student 2. Faculty Registration 3. Display Pariticipants' details "
					+ "4. Display Specific participant's details 10.Exit");
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
					// {s1,s2,f1,f2,f3,null....null}
				for (Person p : participants)// p=participants[0].....p=participants[participants.length-1]
					if (p != null)
						System.out.println(p);// run time polymorphism = dynamic method dispatch
				break;
			case 4:
				System.out.println("Enter your seat no");
				// validate seat no --valid --display details (toString)
				//// {s1,s2,f1,f2,f3,null....null}
				int index = sc.nextInt() - 1;
				if (index >= 0 && index < counter) {
					Person p = participants[index];
					System.out.println(p);// run time polymorphism = dynamic method dispatch : no explicit type casting
											// required since : Person class has a method toString
					if (p instanceof Student)
						((Student) p).study();// javac resolves by type of ref --p : Person --whr will javac check for
												// study
												// method?
					// in Person class -- not found --javac err
					// how to satisfy javac : explicit type cast is needed for it. -- downcasting
					// in case of invalid casting : JVM throws exception :
					// java.lang.ClasscastException : Faculty can't be cast in to Student
					else if (p instanceof Faculty)
						((Faculty) p).teach();
					else
						System.out.println("Invalid type !!!!");
				} else
					System.out.println("Invalid Seat no!!!!");

				break;

			case 10:
				exit = true;
				break;
			}
		}
		sc.close();

	}

}
