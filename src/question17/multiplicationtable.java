package question17;
import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.println("Enter n");
		n=sc.nextInt();
		System.out.println("Enter m");
		m=sc.nextInt();
		int num=1;
		while(num<n) {
			int M=num*5;
			System.out.println(num+"*"+n+"="+M);
			num++;
		}
			
		// TODO Auto-generated method stub

	}

}
