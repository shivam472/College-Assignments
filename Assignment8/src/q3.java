
class MarksOutOfBoundException extends Exception
{
	public MarksOutOfBoundException(String s) {
		System.out.println(s);
	}
}
class Student
{
	int m;
	void setMark(int m)
	{
		try
		{
			if(m > 100)
			{
				throw new MarksOutOfBoundException("Marks cannot be greater than 100");
			}
			else
				this.m = m;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	void display()
	{
		System.out.println(m);
	}
	
	
}

public class q3 {

	public static void main(String[] args) {
		Student s = new Student();
		s.setMark(101);
		s.display();

	}

}
