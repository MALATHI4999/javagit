package com.scuba.accessmodifiers;
//protected 
 
public class ClassProtected{  
protected void msg()
{
	System.out.println("Hello");
}  
}  
class B extends ClassProtected{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }
}