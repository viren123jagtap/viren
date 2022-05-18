import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		int n, i;
		
		int f, ld;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		int temp = n;
		int total=0;
		while(n != 0) {
			i=1;
			f=1;
			ld=n%10;
			while(i <= ld) {
					f= f* i;
					i++;
			}
			total=total+f;
			n= n / 10;
			}
		if(total == temp)
			System.out.println(temp + "number is a strong");
		else
			System.out.println(temp + "number is not a strong");
		System.out.println();
	}

}
