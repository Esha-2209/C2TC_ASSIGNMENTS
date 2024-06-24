package com.Assignment_03;

public class GSShopFactory extends ShopFactory {
	
	public GSPrimeAcc getNewPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime) {
		return new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		
	}
	
	public GSNormalAcc getNewNormalAcc(int AccNo, String accNm, float charges, float deliveryCharges) {
		return new GSNormalAcc(AccNo, accNm, charges, deliveryCharges);
	}
	
	

}
