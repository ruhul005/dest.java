package assignment;

public class Student {
	
	String name;
	int id;
	String depertment;
	String courseName;
	int section;
	
	Student(	String name,int id,String depertment,String courseName,int section)
	{
		this.name=name;
		this.id=id;
		this.depertment=depertment;
		this.courseName=courseName;
		this.section=section;
	}
	
	public Student(String id2, String name2, double c) {
		// TODO Auto-generated constructor stub
	}

	String getName()
	{
		return name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	int getId()
	{
		return id;
	}
	void setId(int id)
	{
		this.id=id;
	}
	String getDepertment()
	{
		return depertment;
	}
	void setDepertment(String depertment)
	{
		this.depertment=depertment;
	}
	String getCourseName()
	{
		return courseName;
	}
	void setCourseName(String CourseName, String courseName)
	{
		this.courseName=courseName;
	}
	int getSection()
	{
		return section;
	}
	void setSection(int section)
	{
		this.section=section;
	}
	
}
