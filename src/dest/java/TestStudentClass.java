package assignment;
import java.util.Scanner;

public class TestStudentClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter name");
		String name = input.nextLine();
		System.out.println("Enter ID:");
		int id = input.nextInt();
		System.out.println("Enter Depertment:");
		String depertment = input.next();
		System.out.println("Enter Course Name");
		String courseName = input.next();
		System.out.println("Enter Section");
		int section= input.nextInt();
		Student std=new Student(name,id,depertment,courseName,section);
		System.out.println("Name:"+std.getName()+"\nId:"+std.getId()+"\nDepertment:"+std.getDepertment()+"\nCourse Name:"+std.getCourseName()+"\nSection:"+std.getSection());
		System.out.println(name);
		

	}

}
