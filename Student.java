

public class Student {
	
	static int nextId = 0;
	
	final int id;
	final String firstName, lastName;
	
	Student (String fn, String ln)
	{
		id = nextId;
		nextId++;
		
		firstName = fn;
		lastName = ln;
	}
	
	String getFirstName()
	{
		return firstName;
	}
	
	String getLastName()
	{
		return lastName;
	}
	void registerForCourse(Courses c)
	{
		c.registerStudent(this);
	}
	void unregisteredForCourse(Courses c)
	{
		c.unregisteredStudent(this);
	}
	
}
