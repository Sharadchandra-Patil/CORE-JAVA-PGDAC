package utils;

import java.util.ArrayList;

import com.app.core.Customer;

import custom_exception.CustomerHandlingException;

public class CustomerUtils {
//add a static method for user login(sign in)
	public static Customer authenticateCustomer(String email, String password, ArrayList<Customer> list)
			throws CustomerHandlingException {
		// find customer by email
		Customer cust = findByEmail(email, list);
		// => email is valid ...continue to pwd checking
		if (cust.getPassword().equals(password))
			return cust;
		throw new CustomerHandlingException("Invalid Password!!!");

	}

	// add a method to find customer details by PK : email
	public static Customer findByEmail(String email, ArrayList<Customer> list2) throws CustomerHandlingException {
		// wrap PK(email) in Customer class instance
		Customer c = new Customer(email);
		int index = list2.indexOf(c);
		if (index == -1)
			throw new CustomerHandlingException("Invalid Email!!!!");
		return list2.get(index);

	}

}
