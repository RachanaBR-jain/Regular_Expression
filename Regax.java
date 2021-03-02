import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> UC6-UpperCase


public class Regax {
	static Scanner user =new Scanner(System.in);

	public static void firstName()
	{
		String firstName = user.next();
		boolean name= Pattern.matches("^[A-Z]{1}[a-z]{3,10}$",firstName);
		if(name==true)
		{
			System.out.println(firstName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			firstName();
		}

	}

	public static void lastName()
	{
		String lastName = user.next();
		boolean name1= Pattern.matches("^[A-Z]{1}[a-z]{3,}$",lastName);
		if(name1==true)
		{
			System.out.println(lastName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			lastName();
		}

	}

	public static void email()
	{
		String email = user.next();
		boolean email1= Pattern.matches("^[A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$",email);
		if(email1==true)
		{
			System.out.println(email1+" is valid email");
		}
		else
		{ 
			System.out.println("InValid !!!,,Please reenter valid email");
			//email(); 
		}

	}
	public static void phoneNum()
	{
		String pnum = user.next(); 
		boolean num= Pattern.matches("^[0-9]{2}[ ][6-9]{1}[0-9]{9}$",pnum); 
		if(num==true)
		{  
			System.out.println(num+" is valid phone number");
		} 
		else
		{ 
			System.out.println("Invalid-->Please reenter valid phone number");
			//phoneNum();
		}
	}
<<<<<<< HEAD
	public static void password() 
	{
		String pwd= user.next(); 
		boolean password5= Pattern.matches("^[A-Za-z]{8}$",pwd);
		if(password5==true)  
=======

	public static void password() 
	{
		String pwd= user.next(); 
		//boolean password5= Pattern.matches("^[A-Za-z]{8}$",pwd);
		boolean password6= Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=[^$@!#%*?&]*[$#@!%*?&][^$@!#%*?&]*$).{8,}",pwd);
		if(password6==true)  
>>>>>>> UC6-UpperCase
		{ 
			System.out.println("you have entered valid password");  
		}
		else
		{  
			System.out.println("Invalid !!-->Please reenter valid password") ;
			password();
		}

	}



	public static void main(String[] args) {
		System.out.println("enter the user last name");
		firstName();
		System.out.println("enter the user last name");
		lastName();
		System.out.println("enter the user email id");
		email();
		System.out.println("enter the user phone-number ");
		phoneNum();
<<<<<<< HEAD
=======

>>>>>>> UC6-UpperCase
		System.out.println("enter your passward ");
		password();

	}
}
<<<<<<< HEAD
>>>>>>> UC5-password


public class Regax {
	static Scanner user =new Scanner(System.in);

	public static void firstName()
	{
		String firstName = user.next();
		boolean name= Pattern.matches("^[A-Z]{1}[a-z]{3,10}$",firstName);
		if(name==true)
		{
			System.out.println(firstName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			firstName();
		}
<<<<<<< HEAD
	}
	public static void lastName()
	{
		String lastName = user.next();
		boolean name1= Pattern.matches("^[A-Z]{1}[a-z]{3,10}$",lastName);
=======

	}

	public static void lastName()
	{
		String lastName = user.next();
		boolean name1= Pattern.matches("^[A-Z]{1}[a-z]{3,}$",lastName);
>>>>>>> UC3-email
		if(name1==true)
		{
			System.out.println(lastName+" is valid firstname");
		}
		else
		{ 
			System.out.println("Please reenter valid user name");
			lastName();
		}

	}

<<<<<<< HEAD
=======
	public static void email()
	{
		String email = user.next();
		boolean email1= Pattern.matches("^[A-Za-z0-9-\\\\+]+(\\\\.[A-Za-z0-9-]+)*@\" + \"[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$",email);
		if(email1==true)
		{
			System.out.println(email1+" is valid email");
		}
		else
		{ 
			System.out.println("InValid !!!,,Please reenter valid email");
			email(); 
		}

	}

>>>>>>> UC3-email
	public static void main(String[] args) {
		System.out.println("enter the user last name");
		firstName();
		System.out.println("enter the user last name");
		lastName();
<<<<<<< HEAD
=======
		System.out.println("enter the user email id");
		email();

>>>>>>> UC3-email
	}
}
=======
>>>>>>> UC6-UpperCase
