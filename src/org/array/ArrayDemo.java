package org.array;

import java.util.LinkedList;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		
		int a=10;
		Object b=10;
		
		//mm sollunga no  yes
	List li= new LinkedList();
	li.add(23);
	li.add("karthic");
	li.add(123.123f);
	li.add(987654321l);
	
	li.add(0, "Ruth");
	System.out.println(li);
	li.set(3, "Master");
	System.out.println(li);
	int indexOf = li.indexOf("Ruth");
	System.out.println(indexOf);
	li.add(23);
	System.out.println(li);
	int lastIndexOf = li.lastIndexOf(23);
	System.out.println(lastIndexOf);
	
	Object object = li.get(3);
	System.out.println(object);
	
	/*System.out.println(li);
	int size = li.size();
	System.out.println("size :"+size);
	boolean contains = li.contains("Karthic");
	System.out.println(contains);
	boolean add = li.add("ruth");
	System.out.println(add);
	System.out.println(li);
	
	Object object = li.get(1);
	System.out.println(object);
	
	boolean equals = li.equals(23);
	System.out.println(equals);
	Object remove = li.remove(2);
	System.out.println(li);
	System.out.println(remove);
	
	
	
	List li2=new LinkedList();
	boolean equals2 = li2.equals(li);
	
	
	System.out.println();
	int a[]=new int[5];
	a[0]=10;
	a[1]=20;
	int length = a.length;
	System.out.println(length);
	//System.out.println(a[]);
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}*/
	
	//int=0
	
	
	
	
}
	
	
}
