package com.OopsConcept;

abstract class Vehicle {
	
	int speed=1;
	long distance=1;
	
	abstract void run();
	abstract void stop();
	public void fuel(int x, int y)
	{
		
	}
	public void fuel(float x, String y)
	{
		
	}
	public void fuel(char x,int y)
	{
		
	}
	public Vehicle()
	{
		//System.out.println("Default constructor");
	}
	Vehicle(int x,int y)
	{
		
	}
	void display()
	{
		
	}
}
	 class two extends Vehicle
	{
		void run()
		{
			System.out.println("Run");
		}
		void stop()
		{
			System.out.println("Stop");
		}
		int speed=40;
		long distance=450;
		int notire=2;
		public two(){
			//System.out.println("Default");
		}
		void display()
		{
		System.out.println("No.of tires " +notire + " Speed "+speed + " Distance "+distance);
		System.out.println("Variables of Parent Class: " +super.speed +super.distance);
		}
	}
	 class three extends Vehicle
	{
		void run()
		{
			System.out.println("Run");
		}
		void stop()
		{
			System.out.println("Stop");
		}
		int speed=45;
		long distance=150;
		int notire=3;
		public three(){
			//System.out.println("Default");
		}
		void display()
		{
		System.out.println("No.of tires " +notire + " Speed "+speed + " Distance "+distance);
		System.out.println("Variables of Parent Class: " +super.speed +super.distance);
		}
	}
	 class four extends Vehicle
	{
		void run()
		{
			System.out.println("Run");
		}
		void stop()
		{
			System.out.println("Stop");
		}
		int speed=60;
		long distance=550;
		int notire=4;
		public four(){
			//System.out.println("Default");
		}
		void display()
		{
		System.out.println("No.of tires " +notire + " Speed "+speed + " Distance "+distance);
		System.out.println("Variables of Parent Class: " +super.speed +super.distance);
		}
	}
	 class eight extends Vehicle
	{
		void run()
		{
			System.out.println("Run");
		}
		void stop()
		{
			System.out.println("Stop");
		}
		int speed=80;
		long distance=250;
		int notire=8;
		public eight(){
			//System.out.println("Default");
		}
		void display()
		{
		System.out.println("No.of tires " +notire + " Speed "+speed + " Distance "+distance);
		System.out.println("Variables of Parent Class: " +super.speed +super.distance);
		}
	}
public class Absraction
 {
		 
	public static void main(String args[])
	{
		Vehicle obj=new two();
		Vehicle obj1=new three();
		Vehicle obj2=new four();
		Vehicle obj3=new eight();
		obj.run();
		obj.stop();
		obj.display();
		obj1.run();
		obj1.stop();
		obj1.display();
		obj2.run();
		obj2.stop();
		obj2.display();
		obj3.run();
		obj3.stop();
		obj3.display();
	}
	




}