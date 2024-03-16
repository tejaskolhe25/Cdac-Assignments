package com.example;


import java.util.Scanner;

import com.sample.Student;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);
	public static int menuList() {
		System.out.println("0, Exit");
		System.out.println("1. Get data");
		System.out.println("2. Display data");
		System.out.println("Enter choice:-");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Student std = new Student();

		
		int ch ;
		while ((ch=Program.menuList()) != 0) {
	
			switch (ch) {
			case 1:
				std.getData();
				break;
			case 2:
				std.displayData();
				break;
			default:
				System.out.println("enter valid choice");

			}
		}

	}

}
