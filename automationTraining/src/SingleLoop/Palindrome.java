package SingleLoop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Program to check whether a number is palindrome
		
		int x, y,r=0,revNum=0;		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to be checked");
		x= sc.nextInt();		
		y=x;
		
		while(x!=0) {
			r= x % 10;
		revNum= revNum*10 + r;
		x= x/10;
		}	
		
		if ( y==revNum) {
			System.out.println(y+" Number is palindrome");
		}	
		else {
			System.out.println(y+" Number is not a palindrome");
		}

	}

}
