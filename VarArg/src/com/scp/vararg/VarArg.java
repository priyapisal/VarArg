package com.scp.vararg;

public class VarArg {
public static void sum(int... x)
{
	System.out.println("The no. of arg"+ x.length);
}
public static void main(String args[])
{
	sum();
	sum(10);
	sum(10,20);
	sum(10,20,30);
	sum(10,20,30,40);
}
}
