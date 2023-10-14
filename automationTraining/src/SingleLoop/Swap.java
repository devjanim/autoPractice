package SingleLoop;
import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
	// Program to Swap two numbers without temp variable
	Scanner sc= new Scanner(System.in);
	int x= sc.nextInt();
	int y=sc.nextInt();
	
	x=x-y;
	y=x+y;
	x=y-x;
	
	System.out.println("After swap value of x :"+x);
	System.out.println("After swap value of y :"+y);
	
	}

}
