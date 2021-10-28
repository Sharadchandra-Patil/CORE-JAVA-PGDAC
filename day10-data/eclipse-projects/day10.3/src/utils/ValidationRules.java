package utils;

import static com.app.vehicles.Vehicle.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.vehicles.Category;
import com.app.vehicles.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class ValidationRules {
	private static Date strtDate, endDate;
	static {
		try {
			strtDate = sdf.parse("2021-4-1");
			endDate = sdf.parse("2022-3-31");
		} catch (ParseException e) {
			System.out.println("Err in static init block " + e);
		}
	}

//add a static method to parse n validate manufacturing date
	public static Date parseAndValidateManufactureDate(String manuDate)
			throws ParseException, VehicleHandlingException {
		// parse
		Date d1 = sdf.parse(manuDate);
		// =>parsing successful --- validation

		if (d1.before(strtDate) || d1.after(endDate))
			throw new VehicleHandlingException("Invalid Manufacture Date!!!!!");
		// => parsing n validation : success
		return d1;// ret parsed n validated date cls instance to the caller (Tester)

	}

	// add a static method to check for dup chasis no : based upon Vehicle's equals
	// method
	public static String checkForDuplicate(String chasisNo, Vehicle[] showroom) throws VehicleHandlingException {
		// iterate over the Vehicle[] --equals -- true =>dup is found -->throw exc
		// equals : false for all existing vehicles in the showroom => no dup --->
		// chasisNo
		// Encapsulate chasis no details in the Vehicle class instance : call overloaded
		// ctor
		Vehicle newVehicle = new Vehicle(chasisNo);
		for (Vehicle v : showroom)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup Chasis found!!!!");
		return chasisNo;//rets validated non dup chasis no to the caller.
	}
	//add static method for : parsing (string ---> Category:Enum) + validatation
	public static Category parseAndValidateCategory(String categoryName)
	{
		return Category.valueOf(categoryName.toUpperCase());
	}
	
}
