package com.usingcons;

public class Adition {

	private int a ;
	private int b;
	public Adition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("constructor    : int  , int ");
	}
	public Adition(double a , double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("constructor    : double  , doble ");
	}
	public void doSum() {
		
		System.out.println("sum is = " +(this.a+this.b));
	}
}
