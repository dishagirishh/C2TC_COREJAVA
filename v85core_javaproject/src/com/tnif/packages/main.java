package com.tnif.packages;

import basics.carclass;

public class main {

	public static void main(String[] args) {
		carclass obj = new carclass("bmw","m5","black",600,250000);
		obj.displayBrand();
		obj.displayModel();
		
		Student s= new Student();
		s.setStudentName("dish");
		
		s.setStudentUSN("1EW20IS027");
		
		System.out.println(s);
		

	}

}
