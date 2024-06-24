package Assignment.Three.Framework;

public abstract class PrimeAcc extends ShopAcc {
	private final boolean isPrime; //account is prime or not
	private static final float deliveryCharges = 0.0f;
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		
		
	}
	
	@Override
	public void bookProduct(float amount) { //This method overrides the abstract bookProduct method defined in the ShopAcc class.
		System.out.println("Product booked with amount ;" + amount + " No delivery charges for Prime Account.");
	}

	@Override
	public String toString() { //This method overrides the abstract bookProduct method defined in the ShopAcc class.
		return super.toString()+", isPrime=" + isPrime +"]";
	}
	

	

	
	
	
	
	
	

}
