package com.neosoft;

public class LabUnit6 {

}
// Ex 6.1
interface A2
{
void meth1();
void meth2();
}
interface B2 extends A2
{
void meth3();
}
class MyClass implements B2
{
public void meth1()
{
System.out.println("Implement meth1()");
}
public void meth2()
{
System.out.println ("Implement meth2()");
}
public void meth3()
{
System.out.println ("Implement meth()");
}
}
class IFExtend
{
public static void main(String arg[])
{
MyClass ob = new MyClass();
ob.meth1();
ob.meth2();
ob.meth3();
}
}

// Ex 6.4
class Outer{
String sout = ("This is Outer Class");
void display()
{
System.out.println(sout);
}
class Inner{
String sin = ("This is inner Class");
void display() {
	System.out.println(sin);
}
}

class MainDemo{
public void main(String args[]){
Outer outer = new Outer();
Inner inner = new Inner();
outer.display();
inner.display();
}
}
}

