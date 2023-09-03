package student;

public class Student 
{
	int Age;
	int Roll_no;

	public void Display1()	
	{	
		System.out.println("Welcome All");
	}

	public void Display2()
	{
		System.out.println("Automation is easy");
	}
		
	public static void main(String[] args) {
			
	Student st=new Student();  // Creation of object for Student class
	
	st.Age=25;
	st.Roll_no=31;
	System.out.println("Student age is: "+ st.Age);
	System.out.println("Student roll number is: "+ st.Roll_no);
	st.Display1();
	st.Display2();

	}
	
}


