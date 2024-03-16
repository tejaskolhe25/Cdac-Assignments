package com.sample;

import java.util.Scanner;

public class Student {
	private String name;
	private int roll_no;
	private float cgpa;
	Scanner sc =new Scanner (System.in);
	
	public void getData(){
		
		System.out.println("Enter name:- ");
		this.name=sc.nextLine();
		
		System.out.println("Enter Roll No.:- ");
		this.roll_no=sc.nextInt();
		
		System.out.println("Enter CGPA:- ");
		this.cgpa=sc.nextFloat();
		
	}
	public void displayData() {
		System.out.println("Name:- " +this.name);
		System.out.println("Roll no.:- " +this.roll_no);
		System.out.println("CGPA:- " +this.cgpa);
		
	}
}
