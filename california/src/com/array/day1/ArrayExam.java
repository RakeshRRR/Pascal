package com.array.day1;


import java.util.ArrayList;

 class ArrayExam {
	 static int age = 12;
	 

	public static void main(String[] args) {
		Object []a = new Object[5];
		a[0]= 1;
		a[1]=2;
		a[2]=3;
		a[3]="4";
		Person p = new Person(12, "rakesh");
		ArrayList<Object> l = new ArrayList<Object>();
		//l.add("a");
		//System.out.println(p.name +"     "+p.age);
		
		
	
		l.add(p);
				
		System.out.println(l);
	}
 }
 
