package com.in.collection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector(4,2);
		v.addElement(new Integer(3));
		v.addElement(new Integer(2));
		v.addElement(new Integer(6));
//		System.out.println(v.elementAt(1)); //2
//		System.out.println(v.capacity()); //4
		v.insertElementAt(new Integer(8), 2);
//		System.out.println(v);   //[3,2,8,6]
		v.removeAll(v);
		System.out.println(v.isEmpty());//true
		

	}

}
