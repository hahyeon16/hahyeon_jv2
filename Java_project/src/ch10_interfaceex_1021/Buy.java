package ch10_interfaceex_1021;

public interface Buy {

	void buy();
	
	default void order(){
		System.out.println("Buy구매 주문");
	}
}



