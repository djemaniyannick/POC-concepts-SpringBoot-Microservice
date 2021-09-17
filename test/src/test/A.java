package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class A {
	private static String name="test1";
	private static A a =new A();
   static {
	   name="test2";
	   
   }
   
   public A() {
	   name="test3";
	   
   }
   public static String print() {
	   return a.name;
   }
   
   @Override
   public String toString() {
	   return print();
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(A.print());
//String mycher="framboise".get
//System.out.println(mycher);
//if(mycher instanceof String) {
	
	int a=1;
	int b=0;
	int c=a/b;
	System.out.println(c);
	


	}

}
