import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=sc.nextInt();
		int sum=0;
		
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println("the sum of digit: "+sum);
	}

}
