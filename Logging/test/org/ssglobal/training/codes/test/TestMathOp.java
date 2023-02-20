package org.ssglobal.training.codes.test;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.MathOp;

public class TestMathOp {
	private MathOp mo;

	@BeforeEach
	public void setup() {
		mo = new MathOp();
	}

	@AfterEach
	public void teardown() {
		mo = null;
	}

	@Test
	public void testDivOp() {
		assertDoesNotThrow(() -> {
			int result = mo.div(10, 2);
			assertEquals(5, result);
		});
	}
	
	@Test
	public void testDivOpRainy() {
		assertThrows(ArithmeticException.class, () -> {
			int result = mo.div(10, 0);
			assertEquals(0, result);
		});
	}
	
	@Test
	public void TestDisplayArray() {
		int[] testData = {1, 2, 3, 4, 5};
		int[] result = mo.display(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void TestDisplayArrayRainy() {
		int[] testData = null;
		int[] result = mo.display(testData);
		assertSame(testData, result);
	}
	
	@Test
	public void testAddOp() {
		int result = mo.add(2, 3);
		assertEquals(5, result);
	}
	
}
