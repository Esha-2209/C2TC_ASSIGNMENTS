package Assignment.Three.Framework;

public abstract class ShopAcc {
	private final int accNo;
	private String accNm;
	private final float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	public abstract void bookProduct(float books); // abstract subclass of abstract class
	
	public void items(float amount) { // It includes a concrete method items to book items with a specified amount.
		System.out.println("Items booked with amount :" + amount);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
	
	
	
	
	
	
	

}
