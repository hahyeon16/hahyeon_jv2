package ch10_interfaceex_1021;

public class CustomerTest {

	public static void main(String[] args) {

		//문제) 고객 환불 인터페이스 만들기
		//refund라는 추상 메서드 만들기
		//고객 환불 인터페이스 구현하기
		//해당 고객으로 환불 받아보기
		//다형성으로 환불 인터페이스형으로 선언해서, 사용해보기
		
		Customer customer = new Customer();
		//인터페이스의 다형성 개념으로 Customer 클래스를, 해당 인터페이스 형으로 할당.
		Buy buyer = customer;
		
		buyer.buy(); 
		buyer.order();//메서드 부모,자식 다있을때 자식꺼먼저 출력
		
		//인터페이스의 다형성 개념으로 Customer 클래스를, 해당 인터페이스 형으로 할당.
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		Refund refund = customer;
		refund.refund();
		refund.order();
		
		if( seller instanceof Customer){ //형변환 되는지 확인
			Customer customer2 = (Customer)seller; //형변환
			customer2.buy();
			customer2.sell();
		}
		
		customer.order();
		
		
	}
}


