package com.sample;

public class Vehicle {
	
	public void car(String name,int model,double avg) {
		System.out.println("Name of car:- "+name);
		System.out.println("Model of car:- "+model);
		System.out.println("Average of car:- "+avg);
	}
	
	public void car(int model,double avg,String name) {
		System.out.println("Name of car:- "+name);
		System.out.println("Model of car:- "+model);
		System.out.println("Average of car:- "+avg);
	}

}
