package com.aadilanalytics.www;

public class Calculator {
	
	/*public double modulus(int num1, int num2)
	{
	double result=num1%num2;
	return result;
	}*/
	
	public int multiply(int num1, int num2)
	{
	int r=num1*num2;
	return r;
	}
	
	public int divide(int num1, int num2)
	{
	int r=num1/num2;
	return r;
	}

	public int add(int num1, int num2)
	{
	int r=num1+num2;
	return r;
	}
	
	public int substract(int num1, int num2)
	{
	int r=num1-num2;
	return r;
	}
	
	public static void main(String[] args) {
		Calculator ref=new Calculator();
		
		int result1=ref.multiply(6,3);
		System.out.println("Multiplication of two numbers:"+result1);
		
		int result2=ref.divide(6,3);
		System.out.println("Division of two numbers:"+result2);
		
		int result3=ref.add(6,3);
		System.out.println("Addition of two numbers:"+result3);
		
		int result4=ref.substract(6,3);
		System.out.println("Substraction of two numbers:"+result4);
		
	}

}





