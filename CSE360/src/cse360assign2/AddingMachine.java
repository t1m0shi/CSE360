/*
 * Name: Kendall Timothy
 * ID: 1202169440
 * Class ID: CSE 360 (85141)
 * Assignment: 2
 * Description: 
 */

package cse360assign2;

/**
 * AddingMachine class makes various calculations
 * @author Kendall Timothy
 * @version 2.0
 *
 */
public class AddingMachine {

	private int total;
	private String history;
	/**
	 * default constructor
	 * total is initially 0
	 * history is initially "0"
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/**
	 * 
	 * @return the current total
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * adds the param to the class's total variable
	 * history reflects the addition transaction
	 * @param value integer to be added to the total
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	/**
	 * subtracts the param from the class's total variable
	 * history reflects the subtract transaction
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	/**
	 * a history of the transactions
	 * @return transaction history string
	 */
	public String toString () {
		return history;
	}
	/**
	 * sets the Machine back to initial conditions
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
