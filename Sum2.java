 import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) {
		long sum,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		num=sc.nextInt();
		
		for(sum=0;num!=0;num=num/10)
		{
			sum=sum+num%10;
		}
		System.out.println("the sum of digit: "+sum);
	}

}
