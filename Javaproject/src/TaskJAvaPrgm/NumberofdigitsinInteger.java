package TaskJAvaPrgm;

import java.util.Scanner;

public class NumberofdigitsinInteger
{
public static void main(String args[])
{
	for(int g=1;g<=10;g++)
	{
	int count=0;
	System.out.println("Enter a Number");
	Scanner sc=new Scanner(System.in);
	int b=sc.nextInt();
	
	while(b!=0)
	{
	b=b/10;
	count++;
	}
	
	System.out.println("Number of digits in above integer is: "+count);
	}
}
}
