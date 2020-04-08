package com.nit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo 
{
	public static void main(String[] args) {
		Vector v = new Vector();
		ArrayList ar = new ArrayList();
		LinkedList l = new LinkedList();
		Stack s = new Stack();
		
		System.out.println("Initial capacity: "+v.capacity());
//		ar.add(arg0);
//		ar.add(arg0, arg1);
		v.add("a");
		v.add("b");
		v.add(5);
		
		
		System.out.println("-c-apacity: "+v.capacity());
		System.out.println("size: "+v.size());
		for(int i =0;i<v.size();i++) {
		System.out.println(v.get(i));
		}
		
		
		
		
	}
	
}