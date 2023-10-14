package DoubleLoop;

public class NumberPattern1 {

	public static void main(String[] args) {
		// Number Pattern printing				
		for (int i=0;i<=7;i++) {	
			int number =1;
			for (int j=0;j<=i;j++) {				
				System.out.print(number+" ");
				number++;
			}			
			System.out.println();
		}

	}

}
