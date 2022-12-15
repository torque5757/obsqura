package Staticpackage;

public class Staticmath
{
	static int a = 20;
	static int b = 10;
	public static void add()
	{
	int c = a+b;
		System.out.println(c);
	}
	public static void sub()
	{
	int c = a-b;
		System.out.println(c);
	}
	public static void multi()
	{
	int c = a*b;
		System.out.println(c);
	}
	public static void div()
	{
	int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Staticmath.add();
		Staticmath.sub();
		Staticmath.multi();
		Staticmath.div();
		

	}

}
