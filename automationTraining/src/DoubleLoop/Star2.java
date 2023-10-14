package DoubleLoop;

public class Star2 {

	public static void main(String[] args) {
		// Pattern printing	
		int row=6;
		for (int i=row-1;i>=0;i--) {			
			for (int j=0;j<=i;j++) {				
				System.out.print("*");
			}			
			System.out.println();
		}

	}

}
