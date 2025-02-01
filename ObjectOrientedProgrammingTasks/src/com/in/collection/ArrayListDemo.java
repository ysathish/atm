package com.in.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args)
	{
		List<Character> list=new ArrayList<>();
		list.add('a');
		 list.add('b');
		 list.add('c');
		 list.add('d');
		 list.remove('c');
		 System.out.println(list);
		

	}

}
