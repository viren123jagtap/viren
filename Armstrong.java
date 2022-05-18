class Armstrong 
{
public static void main(String[] args)

{
int n;
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the First number: ");
n=scn.nextInt();
int a=n;
int sum=0;
while(n!=0)
{
 int r=n%10;
 sum+=r*r*r;
 n=n/10;
}
 

if(sum==a)
{
	System.out.println("the number is Armstrong: ");
}
else{
	System.out.println("the number is not Armstrong: ");
}
}

}