
public class Euro {

	private int amount;
	
	private static final double CENTS_PER_EURO = 100; 

	/**
	 * Instantiates a new euro.
	 *
	 * @param amount the amount
	 */
	public Euro(final double amount) {
		this.amount = (int) (amount * CENTS_PER_EURO);
	}

	@Override
	public String toString() {
		return String.format("EUR %.2f",  (double) amount / CENTS_PER_EURO);
	}

	@Override
	public boolean equals(final Object o) {
		return (o instanceof Euro) && amount == ((Euro) o).amount; 
	}

	public Euro minus(final Euro euro) {
		Euro result = new Euro(0);
		result.amount = amount - euro.amount;
		return result; 
	} 


}
