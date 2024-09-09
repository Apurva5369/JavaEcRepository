package task5;

import java.util.Scanner;

public class Hotelstay {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Hotel Name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Enter the Month of the Stay: ");
		int month=sc.nextInt();
		System.out.println("Enter the Room prices per day: ");
		float price=(float) sc.nextDouble();
		System.out.println("Enter the Number of Day stay: ");
		int days=sc.nextInt();
		float tariif;
		
        switch(month)
        {
        case 1:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
        
        case 2:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 3:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 4:
            tariif= days*price*(price*20/100);
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 5:
            tariif= days*price*(price*20/100);
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 6:
            tariif= days*price*(price*20/100);
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
            
        case 7:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 8:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 9:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
            
        case 10:
            tariif= days*price;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
        case 11:
            tariif= days*price*20/100;
            System.out.println("Tariff is equal to"+tariif);
            break;
            
        case 12:
            tariif= days*price+(price*20/100);
            System.out.println("Tariff is equal to"+tariif);
        
        
        }
	}

}
