package ch08_inheritance_1020;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "나몰라", 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() +" 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원입니다.");
		// 메서드 자식꺼먼저 호출되어서 vip로 할인이 된 것이 결과로 나옴.
	}
}
