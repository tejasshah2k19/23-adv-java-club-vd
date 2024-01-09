package com.util;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		int a[] = new int[10];

		a[0] = 10;
		a[1] = 20;
		// limit till a[9]

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); // list[0] X
		list.add(20);
		list.add(30);
		// no limit

		System.out.println(list.get(0)); // 10
		System.out.println(list.get(1)); // 20
		// must access via index
		// index starts with zero => 0

		System.out.println(list.size());

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}
}
