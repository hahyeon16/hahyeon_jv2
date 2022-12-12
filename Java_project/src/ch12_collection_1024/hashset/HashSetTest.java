package ch12_collection_1024.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String("거북이5"));
		hashSet.add(new String("거북이2"));
		hashSet.add(new String("거북이3"));
		hashSet.add(new String("거북이2"));
		hashSet.add(new String("거북이5"));
		
		System.out.println(hashSet);
	}
}
