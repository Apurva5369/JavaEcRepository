package task5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the String name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String reverse="";
        
        for(int i=name.length()-1; i>=0;i--)
        {
        	reverse=reverse+name.charAt(i);
        }
        System.out.println("The reverse string is:- "+reverse);
	}
}



