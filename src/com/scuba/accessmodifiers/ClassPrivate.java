package com.scuba.accessmodifiers;
//private

class A  
{  
 private String msg="Try to access the private variable outside the class";

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}  
       
}  
public class ClassPrivate {  
public static void main(String[] args) {  
    A a=new A();  
   System.out.println(a.getMsg());  
      
}  
}  