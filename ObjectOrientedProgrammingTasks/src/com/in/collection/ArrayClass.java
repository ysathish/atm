package com.in.collection;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args)
	{
int[] array=new int[5];
    for(int i=5;i>0;i--)
    {
    	array[5-i]=i;
    	 }
    Arrays.fill(array, 1,4,8);
    for(int i=0;i<5;i++)
    {
    	System.out.println(array[i]);
    }
	}
}
	
// 5 8 8 8 1
// 0 1 2 3 4
