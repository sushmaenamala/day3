package question14;
import java.util.Scanner;

public class sumofnnumbers {

	public static void main(String[] args) {
		int n,a,i=1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		while(i<=n) {
			System.out.println("Enter the number");
			a=sc.nextInt();
			sum=sum+a;
			i++;
			}
			System.out.println("The sum is "+sum);

		// TODO Auto-generated method stub

	}

}
