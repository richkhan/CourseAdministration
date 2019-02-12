
public class Program {

	public static void main (String [] args)
	{
		p("Welcome to the course administration program");
		p("--------------------------------------------");
		p("");
		
		p("Creating two courses...");
		Courses courseA = new Courses("First Course");
		Courses courseB = new Courses("Second Course");
		
		p("- courseA id is: " + courseA.id);
		p("- courseA name is: " + courseA.getName());
		
		p("- courseB id is: " + courseB.id);
		p("- courseB name is: " + courseB.getName());
		p("");
		
		p("Create two students...");
		p("");

		Student student1 = new Student ("Alice", "The Student");
		Student student2 = new Student ("Bob", "McStudent");
		
		p("- student1 id is: " + student1.id);
		p("- student1 name is: " + student1.getFirstName() + ", " + student1.getLastName());
		
		p("- student2 is: " + student2.id);
		p("- student2 name is: " + student2.getFirstName() + ", " + student2.getLastName());
		p("");
		
		p("Registering for courses...");
		student1.registerForCourse(courseA);
		student1.registerForCourse(courseB);
		
		
		p("-courseA number of students: " + courseA.nrOfRegisteredStudent());
		p("-courseB number of students: " + courseB.nrOfRegisteredStudent());

	}
	
	static void p(String l)
	{
		System.out.println(l);
	}
}
