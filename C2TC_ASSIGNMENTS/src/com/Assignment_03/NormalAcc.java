package com.Assignment_03;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}
	
	@Override
	public void bookProduct(float amount) { //This method overrides the bookProduct method from the ShopAcc class.
		System.out.println("Product Booked with amount: " + amount + " Delivery charges:" + deliveryCharges);
		
	}

	@Override
	public String toString() {
		return super.toString()+",deliveryCharges=" + deliveryCharges + "]";
	}
	
	}

//	@Override
//	public String toString() {
//		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
//	}
	
	
	
	
	
	


