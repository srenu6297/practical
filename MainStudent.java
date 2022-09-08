//Author name : Renu Sharma

package Oops_LabTest;

public class MainStudent extends Student
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setName("Renu Sharma");
		s.setAge(22);
		s.setRollno(31);
		
		System.out.println(s.getInstitute());
		System.out.println("\nName is : "+s.getName());
		System.out.println("Age is : "+s.getAge());
		System.out.println("Roll Number is : "+s.getRollno());

	}

}
