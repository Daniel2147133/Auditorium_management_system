import java.io.*;
import java.util.*;
class Company
{

	static String name;
	static String phone_no;
	Company(String name, String phone_no)
	{
		this.name=name;
		this.phone_no=phone_no;
	}

}

class Bus_class extends Company
{
	int Reg_no;
	String Bus_name;
	String source;
	String destination;
	Bus_class(String name, String phone_no)
	{
		super(name,phone_no);
	}

	void add_bus()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the reg number");
		Reg_no=sc.nextInt();
		System.out.println("Enter the Bus name");
		sc.nextLine();
		Bus_name=sc.nextLine();
		System.out.println("Enter the source");
		source=sc.nextLine();
		System.out.println("Enter the destination");
		destination=sc.nextLine();
		System.out.println("Bus Added");
			
	}

	void dis()
	{
		System.out.println("---------Company Details-----------");
		System.out.println("Company Name :"+name);
		System.out.println("Company Contact :"+phone_no);
		System.out.println("---------Bus Details-----------");
		System.out.println("Bus_No: "+Reg_no);
		System.out.println("Bus_name: "+Bus_name);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);

	}

}

class Command
{
	public static void main(String args[])
	{		
		Scanner sc=new Scanner(System.in);
		int choise=0;
		Bus_class bus=new Bus_class(args[0],args[1]);
		do
		{

		System.out.println("\n--------Enter 1 to add a bus\nEnter 2 to display the details\nEnter 0 to exit-------");
		choise =sc.nextInt();
		switch(choise)
		{
			case 1 : bus.add_bus();
					 break;
			case 2 : bus.dis();
					 break;
			case 0 : break;

			default : System.out.println("Wrong entry");
		}
		}while(choise>0);
		
		
	}
}