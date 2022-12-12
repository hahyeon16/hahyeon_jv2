package ch12_map.treemap_1024;

import ch12_collection_1024.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap member = new MemberTreeMap();
		
		Member memberPark = new Member(1003, "�ڼ���");
		Member memberLee = new Member(1001, "������");
		Member memberHong = new Member(1004, "ȫ�浿");
		Member memberSon = new Member(1002, "�չα�");
		
		member.addMember(memberPark);
		member.addMember(memberLee);
		member.addMember(memberHong);
		member.addMember(memberSon);
		
		member.showAllMember();
		
		member.removeMember(1004);
		member.showAllMember();
	}
}
