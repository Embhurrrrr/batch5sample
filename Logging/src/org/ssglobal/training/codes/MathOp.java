package org.ssglobal.training.codes;

import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MathOp {
	
	//Step 1: Create or build the private logger object
	private Logger logger = Logger.getLogger(MathOp.class.getName());
	
	
	public MathOp() {
		//Step 2: Set the level of the logging
		logger.setLevel(Level.ALL);
		
		//Step 3: Create another Handler
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			
			//Step 4: Create Format
			SimpleFormatter txtFormatter = new SimpleFormatter();
			fileHandler.setFormatter(txtFormatter);
			
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public MathOp(int x, int y) {
		logger.setLevel(Level.ALL);
		
		try {
			FileHandler fileHandler = new FileHandler("./src/config/math.log", true);
			fileHandler.setLevel(Level.ALL);
			fileHandler.setEncoding("UTF-8");
			
			//Step 4: Create Format
			SimpleFormatter txtFormatter = new SimpleFormatter();
			fileHandler.setFormatter(txtFormatter);
			
			logger.addHandler(fileHandler);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	public int add(int x, int y) {
		logger.info("Start of method add() with parameters: x = %d y = %d".formatted(x, y));
		
		logger.warning("Using custom Date() object");
		Date xmas = new Date(123, 1, 32);
		System.out.println(xmas);
		
		int sum = x + y;
		logger.info("End of method add() with parameters: x = %d y = %d".formatted(x, y));
		return sum;
	}
	
	public int div(int x, int y) throws ArithmeticException, Exception {
		logger.info("Start of method div() with parameters: x = %d y = %d".formatted(x, y));
		if (y == 0) {
			logger.severe("Division by zero error");
			throw new ArithmeticException();
		}
		
		logger.info("End of method div() with parameters: x = %d y = %d".formatted(x, y));
		return x / y;
	}
	
	public int[] display(int[] arrData) {
		logger.info("Start of method diplayArray() with parameters: arrData = %s".formatted(Arrays.toString(arrData)));
		try {
			int len = arrData.length;
			System.out.println("Length of array: %d".formatted(len));
			System.out.println(Arrays.toString(arrData));
		} catch (NullPointerException e) {
			logger.severe(e.getMessage());
		}
		
		logger.info("End of method diplayArray() with parameters: arrData = %s".formatted(Arrays.toString(arrData)));
		return arrData;
	}
}
