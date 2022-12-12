package ch12_collection_1024.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("거북이5");
		treeSet.add("거북이2");
		treeSet.add("거북이3");
		treeSet.add("거북이2");
		treeSet.add("거북이5");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
	}
}
