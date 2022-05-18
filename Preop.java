//Concatenation using scanner class

class Preop
{

public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter price: ");
int a=scn.nextInt();

System.out.println("Enter Amount: ");
int b=scn.nextInt();

System.out.println(" the sum of " + a + " and " + b + " is " + (a+b));

}
}