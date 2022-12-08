package ch08_witharraylist_1020;

public class VVIPCustomer2 extends Customer{

	private int agentID;
	double saleRatio;
	private int parkingNum;
	// 발렛 파킹 번호

	public VVIPCustomer2(int customerID, String customerName, int agentID, int parking){
		super(customerID, customerName);
	
		customerGrade = "VVIP";
		bonusRatio = 0.15;
		saleRatio = 0.2;
		this.agentID = agentID;
		this.parkingNum = parkingNum;
	}
	
	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showCustomerInfo(){
		return super.showCustomerInfo() + " 담당 상담원 번호는 " + agentID + ", 발렛 파킹 번호" + parkingNum+ "입니다." ; 
	}

	public int getAgentID(){
		return agentID;
	}
}
