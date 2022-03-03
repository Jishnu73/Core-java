package trainingapi;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int i;
		System.out.println("Enter number of students");
		int n=scan.nextInt();
		Student stu[]=new Student[n];
		Student s;
	for (i=0;i<stu.length;i++)
	{
		s=new Student();
		s.DispDetails();
		stu[i]=s;
	}
	Student.dispAverages();
	}

}
