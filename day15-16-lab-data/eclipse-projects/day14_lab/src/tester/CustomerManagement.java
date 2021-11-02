package tester;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.CustomerPlan;
import static utils.ValidationRules.*;
import static utils.CustomerUtils.*;
import static com.app.core.Customer.sdf;

public class CustomerManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init : create AL<Customer>
			ArrayList<Customer> customers = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("Options : 1. Register New Customer 2. Customer Login 3. Display All" + "10.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // customer reg.
						System.out.println("Enter customer details : name,  email,  password,  regAmount, "
								+ " dob(day-mn-yr),  plan ");
						customers.add(validateCustomerInputs(customers, sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next()));
						System.out.println("Customer reg success!!!!");

						break;
					case 2:
						// email pwd : user i/ps
						// Hint : indexOf --> -1 => invalid email : throw exc
						// get(index) --> customer ref --> chk pwd --> login success or throw exc.

						System.out.println("Enter email n password for login");
						System.out.println("Login Successful , Your details "
								+ authenticateCustomer(sc.next(), sc.next(), customers));
						break;
					case 3: // display info of all custs
						System.out.println("Customer Info.");
						for (Customer c : customers)
							System.out.println(c);
						break;

					case 4:// change password
						System.out.println("Enter credentials : email pwd");
						Customer validCustomer = authenticateCustomer(sc.next(), sc.next(), customers);
						// =>login success
						System.out.println("Enter new password");
						validCustomer.setPassword(sc.next());
						System.out.println("password changed!!!");

						break;
					case 5:// Un subscribe customer (remove customer details) : i/p email
						System.out.println("Enter email for un subscribe option");
						validCustomer = findByEmail(sc.next(), customers);
						// =>email valid
						// ArrayList : remove(Object o)
						System.out.println("Un subscribed " + customers.remove(validCustomer));
						break;
					case 6: // Display all customer names , who have taken a specific plan
						// i/p plan (string --> enum)
						System.out.println("Enter plan");
						CustomerPlan plan = validatePlan(sc.next());
						System.out.println("Names of the customers under plan : " + plan);
						for (Customer c : customers)
							if (c.getPlan() == plan)
								System.out.println(c.getName());
						break;
					case 7:// Display all customer details , born after specific date
						System.out.println("Enter DoB(day-mon-yr)");
						Date d1 = parseValidateDoB(sc.next());
						System.out.println("Customer details born after Date : " + sdf.format(d1));
						for (Customer c : customers)
							if (c.getDob().after(d1))
								System.out.println(c);
						break;
					case 8://Display all customer details , with specified adhar card location.
						System.out.println("Enter card location");
						String location=sc.next();
						System.out.println("Customers having Adhar card from location "+location);
						//[c1,c2,c3,c4,c5......]
						for(Customer  c: customers)
							if(c.getCard() != null)//adhar card details are linked to customer
								if(c.getCard().getLocation().equals(location))
									System.out.println(c);
						break;
					case 9 ://link customer's adhar card after successful login
						System.out.println("Enter credentials em pwd");
						 validCustomer=authenticateCustomer(sc.next(), sc.next(), customers);
						 System.out.println("Enter Adhar card details : no location");
						 validCustomer.linkAdharCard(sc.next(), sc.next());
						 System.out.println("Adhar card linked....");
						
						break;

					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				// clr off pending i/ps from scanner
				sc.nextLine();

			}

		} // end of try with resources

	}

}
