package Staticpackage;

public class Calculate 
{
	public static double add(int a ,double b)
	{
	double c = a+b;
	return c;
	}	
	public static double sub(int a ,double b)
	{
	double c = a-b;
	return c;
	}
	public static double Multi(int a ,double b)
	{
	double c = a*b;
	return c;
	}
	public static double div(int a ,double b)
	{
	double c = a/b;
	return c;
	}
	public static void main(String[] args) 
	{
		System.out.println(Calculate.add(8,7.5));
		System.out.println(Calculate.sub(10,5));
		System.out.println(Calculate.Multi(6,4));
		System.out.println(Calculate.div(8,2));
	}

}
