package com.neosoft;

public class LabUnit3_SimpleObject {
	String name;
	int age;
	LabUnit3_SimpleObject(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		LabUnit3_SimpleObject simple = new LabUnit3_SimpleObject("JOHN",40);
		System.out.println(simple.name);
		System.out.println(simple.age);
	}
}
//Ex 3.2
class Room
{
int roomNo;
String roomType;
float roomArea;
boolean acMachine;

void setData(int rmno, String rmt, float rmar, boolean rmac)
{
roomNo = rmno;
roomType = rmt;
roomArea = rmar;
acMachine = rmac;
}
void displayData()
{
System.out.println("The Room No Is " + roomNo);
System.out.println ("The Room Type is "+ roomType);
System.out.println ("The Room area is "+ roomArea + " Sq.Ft");
String s = (acMachine) ? "yes " : "no ";
System.out.println ("The A/c Machine needed " + s);
}
public static void main(String arg[])
{
Room room1 = new Room ( );
room1. setData (10, "Super-Class", 500.0f, true);
room1.displayData ( );
}
}
//Ex 3.3
class Test
{
public int a;
public int b;

void meth(int i, int j)
{
i *=2;
j /=2;
}
}
class CallByValue
{
public static void main (String args[])
{
Test ob = new Test();
int a =30, b = 40;
System.out.println ("Before call :a = "+ a +", b = " + b);
ob.meth (a, b );
System.out.println ("After call :a = " + a +", b = " + b );
} 
} 
class Test1
{
int a, b;
Test1(int i, int j)
{
a = i;
b = j;
}
//pass an object
void meth(Test1 ob) 
{
ob.a *=2;
ob.b /= 2;
}
}
class CallByRef
{
public static void main (String args[])
{
Test1 ob = new Test1(30,40);
System.out.println("Before call :a = "+ob.a+", b "+ob.b);
ob.meth (ob);
System.out.println("After call :a = "+ob.a+", b "+ ob.b);
}
} 
// Ex 3.4
class Employee{  
int Emp_Id;  
String Name;   
Employee(int empid ,String name){  
this.Emp_Id= empid;  
this.Name=name;   
}  
void display(){System.out.println(Emp_Id+": "+Name+" ");}  
}  
  
class TestThis2{  
public static void main(String args[]){  
Employee e1=new Employee(111,"Pragati");  
Employee e2=new Employee (112,"Kavita");  
e1.display();  
e2.display();  
}} 
