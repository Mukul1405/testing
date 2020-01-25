import java.util.Scanner;

public class Email {
private String Fname;
private String Lname;
private String Password;
private String Department;
private String email;
private String alternateEmail;
private int mailBoxCapacity;
private int defaultPassLength=10;
private String company="bnm.com";

public Email(String Fname,String Lname)
{
this.Fname=Fname;
this.Lname=Lname;
//System.out.println(this.Fname+" "+this.Lname);
this.Department=setDepartment();
//System.out.println(this.Department);
this.Password=randomPass(defaultPassLength);
//System.out.println(this.Password);
email=Fname.toLowerCase()+"."+Lname.toLowerCase()+"@"+Department+company;
System.out.println(email);
}
 
private String setDepartment()
{
	System.out.println("Enter the Department\n1 for sales\n2 for Accounting\n3 for Development\n4 and for None\nEnter the code for Department :");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	if(choice==1) 
	{
		return "sales";
	}
	else if(choice==2)
	{
		return "acct";
	}
	else if(choice==3)
	{
		return "devp";
	}
	else
	{
		return "";
	}
}

public String randomPass(int length)
{
	String setPass="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()abcdefghijklmnopqrstuvwxyz";
	char Pass[]=new char[length];
	String Password="";
	for(int i=0;i<length;i++)
	{
		int random= (int)(Math.random() *setPass.length());
		Pass[i]=setPass.charAt(random);
		Password=Password+Pass[i];
	}
	return Password;
}


}
