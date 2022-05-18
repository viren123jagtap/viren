class Evenodd
{
public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the value: ");
int a=scn.nextInt();

if(a%25==0)
{
	System.out.println("Number id Even");
}
else
{
	System.out.println("Number is Odd");
}
}
}