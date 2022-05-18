class Prime
{
public static void main(String[] args)

{
int n;
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter the number: ");
n=scn.nextInt();
int a=1;
for(int i=2;i<n;i++)

{
if(n%i==0)
  {
    a=0;
    break;
  }
}
if(a==1)
{
	System.out.println("the number is Prime: ");
}
else{
	System.out.println("the number is Not Prime:");
}
}

}