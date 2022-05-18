import java.io.*;
import java.util.*;
abstract class Company
{

	static String name;
	static int phone_no;

}

class Bus_class extends Company
{
	int Reg_no;
	String Bus_name;
	String source;
	String destination;
	Bus_class(String name, int phone_no)
	{
		super.name=name;
		super.phone_no=phone_no;
	}

	final void add_bus()
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
		System.out.println("\nName: "+name);
		System.out.println("Contact: "+phone_no);
		System.out.println("\n---------Bus Details-----------");
		System.out.println("\nBus_No: "+Reg_no);
		System.out.println("Bus_name: "+Bus_name);
		System.out.println("Source: "+source);
		System.out.println("Destination: "+destination);

	}

}

class Bus
{
	public static void main(String args[])
	{
		System.out.println("\nEnter Bus company name");
		Scanner sc=new Scanner(System.in);
		String Comp_name=sc.nextLine();
		System.out.println("Enter contact number");
		int phone=sc.nextInt();
		int choise=0;
		Bus_class bus=new Bus_class(Comp_name,phone);
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
