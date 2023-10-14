package SingleLoop;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// Program to check whether a number is prime or not
		
		int x, y,flag=0;		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to be checked");
		x= sc.nextInt();
		y=x/2;
		
		if(x==0||x==1) {
			
			System.out.println("Number is not prime");
		}else
	    {
		
		for (int i=2;i<=y;i++) {
			if(x%i==0) {
				System.out.println("Number is not prime");
				flag=1;
				break;
			}
		}
		
		if (flag==0) {
			System.out.println(x+" Number is prime");
		}
		
		}

	}

}
