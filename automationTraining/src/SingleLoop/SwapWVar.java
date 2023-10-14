package SingleLoop;

import java.util.Scanner;

public class SwapWVar {

	public static void main(String[] args) {
		// Swap of two var with temp var
		
		int temp;
		
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y=sc.nextInt();
		
		temp=x;
		x=y;
		y=temp;
		
		

		System.out.println("After swap value of x :"+x);
		System.out.println("After swap value of y :"+y);
		
		

	}

}
