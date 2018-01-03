package assignment;

public class TestStudent {
			
	public static void main(String[]args)
	{	//String name,int id,String depertment,int section,String courseName
		Student std=new Student("Ruhul Amin",151,"ECE","java",8);
		System.out.println("Name:"+std.getName()+"\nId:"+std.getId()+"\nDepertment:"+std.getDepertment()+"\nCourse Name:"+std.getCourseName()+"\nSection:"+std.getSection());
		/*System.out.println("Id:"+std.getId());
		System.out.println("Depertment:"+std.getDepertment());
		System.out.println("Section:"+std.getSection());
		System.out.println("Course Name:"+std.getCourseName());*/
	}
	
}
