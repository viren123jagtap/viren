class Palin{
 public staic void main(String[] args)
{
int n;
java.util.Scanner sc=new java.util.Scanner(System.in);
System.out.println("Enter the Number: ");
n=sc.nextString();
int sum=0;
int a=n;
while(n!=0)
{
   int r=n%10;
   sum=sum*+r;
   n=n/10;
}
if (sum==a)
{
	System.out.println("Number is Palindrome: ");
}

else{
	System.out.println(" Number is Not Palindrome: ");
}

}
}