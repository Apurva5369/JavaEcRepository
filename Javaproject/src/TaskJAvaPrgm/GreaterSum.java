package TaskJAvaPrgm;

import java.util.Scanner;

public class GreaterSum 
{
public static void main(String args[])
{
	System.out.println("Enter first number A");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	
	System.out.println("Enter Second number B");
	int b=sc.nextInt();
	
	System.out.println("Enter Third number C");
	int c=sc.nextInt();
	
	System.out.println("Enter Fourth number D");
	int d=sc.nextInt();
	
	if((a+b)>(c+d))
	{
		System.out.println("Addition of A and B are greater");
	}
	
	else
	{
		System.out.println("Addition of C and D are greater");
	}
}
}
