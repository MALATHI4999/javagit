package com.scuba.inheritance;

class parent
{
   public void methodA()
   {
      System.out.println("method of Class A");
   }
}
class child1 extends parent
{
   public void methodB()
   {
      System.out.println("method of Class B");
   }
}
class child2 extends parent
{
  public void methodC()
  {
     System.out.println("method of Class C");
  }
}
class child3 extends parent
{
  public void methodD()
  {
     System.out.println("method of Class D");
  }
}
class HierarchicalInherit
{
  public static void main(String args[])
  {
	  child1 obj1 = new child1();
	  child2 obj2 = new child2();
	  child3 obj3 = new child3();
     //All classes can access the method of class A
     obj1.methodA();
     obj1.methodB();
     obj2.methodC();
     obj3.methodD();
  }
}

