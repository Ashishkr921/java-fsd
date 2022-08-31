package com.OopsConcept;

public class Polymorphism
{
    public int sub(int x, int y) 
    { 
        return (x - y); 
    } 
    public int sub(int x, int y, int z) 
    { 
        return (x - y - z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	 Polymorphism s = new  Polymorphism(); 
        System.out.println(s.sub(50, 20)); 
        System.out.println(s.sub(90, 20, 30)); 
        System.out.println(s.sum(35.5, 60.5)); 
    } 
}