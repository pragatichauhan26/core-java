package com.neosoft;

public class LabUnit2 {
	static int var1=10, var2= 6, i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(var1++);
		System.out.println(++var2);
		System.out.println(var1+=5);
		System.out.println(var1 > var2);
		System.out.println(var2 |= 4);
		System.out.println(var2%=4);
		System.out.println(var1 > 10 && var2 < 12);
		System.out.println("==================================");
		for (i=0; i<5; i++)
		{
			System.out.println(+i);
			
		}
		System.out.println("==================================");
		int j=0;
		while(j<3) {
			System.out.println(j);
			j++;
		}System.out.println("==================================");
		String[] country = {"India", "Australia", "Japan", "Taiwan", "USA", "South Korea", "North Korea", "Nepal"};
		System.out.println(country.length);
		System.out.println("==================================");
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[0][1];
		System.out.println(x);
		System.out.println("==================================");
		int a, b, rows =5;
		for (a = 1; a <= rows; a++)   
		{  
		for (b = 1; b <= a; b++)  
		{  
		if(j%2 == 0)  
		{  
		System.out.print(0);  
		}  
		else  
		{  
		System.out.print(1);  
		}  
		}  
		System.out.println();  
		}
		System.out.println("==================================");
		int a1, b1,n=5; 
		for(a1=0; a1<n;a1++) {
			int num=1;
			for (b1=0; b1<=a1; b1++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
}
// Ex 2.7
class SortArray
{
 public static void main (String args [ ] )
 {
 int [] arr = {234,6,846,85,96,198,545,12,60,34,4,87,7,1};
 int i, j, l, temp;
 temp = 0;
 l= arr.length;
 for (i=0;i<arr.length;i++)
 {
 for (j=i+1;j<arr.length;j++)
 {
	 if(arr[i] > arr[j]) {
 temp = arr [i];
 arr[i] = arr[j];
 arr[j] = temp;
 }
 }
 }
for (i=0;i<l;i++)
 {
 System.out.println (arr[i]); 
 }
 }
} 
// Ex 2.9.1
class Addition
{
public static void main(String a1[])
{
int i, j, k;
int a[][]={ {4,4,4},{3,3,3},{2,2,2},{1,1,1}};
int b[][]={ {1,1,1},{2,2,2},{3,3,3},{4,4,4}};
int c[][];
c = new int[3][3];
for(i=0;i<3;i++)
 for(j=0;j<3;j++)
 c[i][j]=a[i][j]+b[i][j];
for(i=0;i<3;i++)
{
 System.out.println("\n");
 for(j=0;j<3;j++)
 System.out.print(c[i][j]);
 }
 }
} 
// Ex 2.9.2
class Multiplication
{
public static void main(String a1[])
{
 int a[][]={ {1,1,1},{2,2,2} };
 int b[][]={ {1,1,1},{2,2,2},{3,3,3} };
 int c[][];
 c = new int[2][3];
 int i, j, k;
 for(i=0;i<2;i++)
 for(j=0;j<3;j++)
 {
 c[i][j]=0;
 for(k=0;k<3;k++)
 c[i][j]+=a[i][k]*b[k][j];
 }
for(i=0;i<2;i++)
{
 System.out.println("\n");
 for(j=0;j<3;j++)
 System.out.print("\b" + c[i][j] + " " );
} 
}
}
	