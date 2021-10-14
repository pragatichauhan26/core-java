package com.neosoft;

public class LabUnit5 {

	public static void main(String[] args) {

	}

}
// Ex 5.1
class Shape
{
void draw()
{
System.out.println("Shape draw()");
}
void erase() 
{
	 System.out.println ("Shape erase()");
	 }
	 }
	class Circle extends Shape
	 {
	 void draw()
	 {
	 System.out.println ("Circle draw()");
	 }
	void erase()
	 {
	 System.out.println ("Circle erase()");
	 }
	}
	class Triangle extends Shape
	 {
	 void draw()
	 {
	 System.out.println("Triangle erase()");
	 }
	}
	class Square extends Shape
	 {
	 void draw()
	 {
	 System.out.println ("Square draw()");
	 }
	void erase()
	 {
	 System.out.println ("Square erase()");
	 }
	}
	class Shapes
	 {
	 public static Shape randshape()
	 {
	 switch((int)(Math.random()*3))
	 {
	 case 0: return new Circle();
	 case 1: return new Square();
	 case 2: return new Triangle();
	 default : System.out.println("default");
	 return new Shape();
	 }
	}
	 public static void main (String arg[])
	 {
	 Shape s[] = new Shape[9];
	 for(int i = 0;i< s.length; i++) 
		 s[i] = randshape();
	 for(int i= 0;i < s.length; i++)
	 s[i].draw();
	 }
	} 








//Ex 5.2

abstract class Car1{  
	abstract void run();  
}  
class Ciaz extends Car1{  
	void run(){System.out.println(" Ciaz is running safely!!!");}  
public static void main(String args[]){  
 Ciaz obj = new Ciaz();  
 obj.run();  
}  
}  

