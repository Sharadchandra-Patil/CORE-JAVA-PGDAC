package utils;

import custom_exceptions.SpeedOutOfRangeException;

//helper class / utility class : for adding validation rule --static method
public class SpeedUtils {
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	static {
		MIN_SPEED = 30;
		MAX_SPEED = 80;
	}

//add a static method to validate speed of a vehicle
	public static void validateSpeed(int speed) throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow : causing the traffic jam!!!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast : FATAL");
		System.out.println("Speed within the range....");
			
		
	}
}
