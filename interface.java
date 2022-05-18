import java.io.*;
import java.util.*;
interface Traveller
{

	public void get_traveller();
	public void dis_traveller();


} 
class User implements Traveller
{
	
	String name,email,username,password,c_password;
	int age;
	 public void get_traveller()
	 {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter Name:");
	 	name=sc.nextLine();
	 	System.out.println("Enter Email:");
	 	email=sc.nextLine();
	 	System.out.println("Enter age:");
	 	age=sc.nextInt();
	 	if(age<0)
	 	{
	 		System.out.println("Not a valid entry");
	 		System.out.println("Enter age:");
	 		age=sc.nextInt();

	 	}
	 	System.out.println("Enter username:");
	 	sc.nextLine();
	 	username=sc.nextLine();
	 	System.out.println("Enter password:");
	 	password=sc.nextLine();
	 	check :
	 	System.out.println("Enter password once again:");
	 	c_password=sc.nextLine();
	 	if(password.compareTo(c_password)==0)
	 	{
	 		System.out.println("Password matching.... New user created with username :"+username);
	 	}
	 	else
	 	{
	 		System.out.println("password doesn't matches....");
			//break check;
	 	}

	 	
	 }

	public void dis_traveller()
	{
		System.out.println("---------User Profile----------\n");
		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Age :"+age);
		
	}

 

}
class Inter
{
	public static void main(String args[])
	{
		int choise=0;
		do
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("\n--------------Enter your choise------------");
			System.out.println("press 1 to create new user\npress 0 to exit\n");
			choise= sc.nextInt();
			switch(choise)
			{
				case 1:	User u1=new User();
						u1.get_traveller();
						System.out.println("Enter 1 to display the user details\nEnter 0 to go back to the main menu");
						int x=sc.nextInt();
						switch(x)
						{
							case 1: u1.dis_traveller();
									break;
							default: break;

						}
						break;
				case 0: break;

				default: System.out.println("Wrong entry....");
			}
		}while(choise>0);

	}
}