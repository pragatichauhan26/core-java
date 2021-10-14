package com.neosoft;

public class LabUnit4 {

	public static void main(String[] args) {
		

	}

}
// Ex 4.2
class ReuseRoomClass
{
Room r;
void createReuseRoomClass()
{
r = new Room();
}
void displayReuseRoomClass()
{
r.displayData();
}
public static void main (String args[])
{
ReuseRoomClass r = new ReuseRoomClass();
r.createReuseRoomClass();
r.displayReuseRoomClass();
}
}
//Ex 4.3
class A
{
int i, j;
void show()
{
System.out.println (" i and j: " + i +" " + j );
}
}
class B extends A
{
int k;
void show()
{
System.out.println ( "K: "+ k);
}
void sum()
{ 
	 System.out.println (" i + j + k: " + ( i + j + k ) );
}
}
//Ex 4.4
class vehicle{
int run() {return 0;}
	
}
class Bus{
	int run() {return 80;}
}
class Car{
	int run() {return 100;}
}
class Bike{
	int run() { return 120;}
	public static void main(String[] args) {
		Bus b= new Bus();
		Car c =  new Car();
		Bike bk =  new Bike();
		System.out.println("Speed of vehicles...");
		System.out.println("The Average speed of Bus is: " + b.run());
		System.out.println("The Average speed of Car is: " +c.run());
		System.out.println("The Average speed of Bike is: " +bk.run());
	}
}
//Ex 4.5
class Name{
	Name(){
		System.out.println("This is the Category of all names present!!!");
	}
	Name(int a){
		System.out.println("This is the Category of all French names present with letters in it as: " + a);
	}
}


class FName extends Name{
	FName(){
		// super(0);
		// System.out.println("This is the category of all french names...");
	}
	FName(int a){
		super(8);
	}
}
class HName extends Name{
	HName(int a, int b){
		super(a);
		System.out.println("This is the Category of all Hindi names with letters in it as: " +b);
	}
	
}
class SuperKeyword {
	public static void main(String[] args) {
		// Name name = new Name();
		FName fname =  new FName();
		HName hname = new HName(8, 9);
	}
}
