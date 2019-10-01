package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	@Test
	//verify instance
	public void testCalculator() {
		AddingMachine myCalculator = new AddingMachine();
		assertNotNull(myCalculator);
	}
	
	@Test
	//verify toString prints correctly
	public void testToString() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(1);
		myCalculator.subtract(3);
		myCalculator.add(5);
		assertTrue(myCalculator.toString().equals("0 + 1 - 3 + 5"));
	}
	
	@Test
	//verify getTotal returns correctly
	public void testGetTotal() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(1);
		myCalculator.subtract(3);
		myCalculator.add(5);
		assertTrue(myCalculator.getTotal() == 3);
	}
	
	@Test
	//verify clear clears correctly
	public void testClear() {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(1);
		myCalculator.subtract(3);
		myCalculator.add(5);
		myCalculator.clear();
		assertTrue(myCalculator.toString().equals("0") && myCalculator.getTotal() == 0);
	}

}
