package DoubleLoop;

public class NumberPattern2 {

	public static void main(String[] args) {
		// Number Pattern printing	
		int k=1;
		for (int i=1;i<=7;i++) {			
			for (int j=1;j<i+1;j++) {				
				System.out.print(k++ +" ");
				
			}			
			System.out.println();
		}
	}

}
