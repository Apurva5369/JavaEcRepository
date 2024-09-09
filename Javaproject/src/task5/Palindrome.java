package task5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		for(int p=0;p<6;p++)
		{
        System.out.println("Enter the String name");
        Scanner sc=new Scanner(System.in);
        String name1=sc.nextLine();
        String rev="";
        
        for(int i=name1.length()-1; i>=0;i--)
        {
        	rev=rev+name1.charAt(i);
        }
        System.out.println("The reverse string is: -"+rev);
        
        if(name1.equals(rev))
        {
        	System.out.println("Sring is Palindrome");
        }
        else
        {
        	System.out.println("Sring is not Palindrome");
        }
		}

	}

}
