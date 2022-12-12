package ch12_map.treemap_1024;

import java.util.Iterator;
import java.util.TreeMap;

import ch12_collection_1024.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap()
	{
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member){
		
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId){  //<ȫ>   )ȫ(  ȫ ȫ ȫ ȫ >ȫ<
		
		if(treeMap.containsKey(memberId)){
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "�� �������� �ʽ��ϴ�");
		return false;
	}
	
	public void showAllMember(){
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while (ir.hasNext()){
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}	
		System.out.println();
	}
}

// 내림차순으로 하는 법:
//package ch12_map.treemap_1024;
//
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.TreeMap;
//
//import ch12_collection_1024.Member;
//
//public class MemberTreeMap {
//
//	private TreeMap<Integer, Member> treeMap;
//	
//	//Comparator 존재하는 reverseOrder 메서드 이용해서 역(내림차순으로 정렬하기.)
//	Comparator<Integer> comparator = Comparator.reverseOrder();
//	
//	public MemberTreeMap()
//	{
//	//	treeMap = new TreeMap<Integer, Member>();
//		treeMap = new TreeMap<Integer, Member>(comparator);
//	}
//	
//	public void addMember(Member member){
//		
//		treeMap.put(member.getMemberId(), member);
//	}
//	
//	public boolean removeMember(int memberId){
//		
//		if(treeMap.containsKey(memberId)){
//			treeMap.remove(memberId);
//			return true;
//		}
//		
//		System.out.println(memberId + "테스트");
//		return false;
//	}
//	
//	public void showAllMember(){
//		Iterator<Integer> ir = treeMap.keySet().iterator();
//		while (ir.hasNext()){
//			int key = ir.next();
//			Member member = treeMap.get(key);
//			System.out.println(member);
//		}	
//		System.out.println();
//	}
//}
//
