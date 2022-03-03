package trainingapi;
import java.text.ParseException;
public class EmployeeMain {

	public static void main(String[] args) throws ParseException{
		Employee emp[]=new Employee[2];
		Employee e;
		for(int i=0;i<emp.length;i++)
		{
			e=new Employee();
			e.readEmployeeDetails();
			emp[i]=e;
		}

	for(int i=0;i<emp.length;i++)
	{
		emp[i].displayEmployeeDetails();
	}
	}

}

