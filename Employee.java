package trainingapi;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.text.ParseException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
String eName;
int empId;
long empPhoneNo;
String empEmail;
Date empDob;
Date empDoj;

Scanner sc  = new Scanner(System.in);
//methods to access above variables
public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
    Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
    return matcher.find();
}

void readEmployeeDetails() throws ParseException {
	System.out.println("Enter the Employee data");
	System.out.println("Enter the Employee id");
	empId = sc.nextInt();
	System.out.println("Enter the Employee name");
	sc.nextLine();//throw away the newline read by scanner
	eName = sc.nextLine();
	System.out.println("Enter Employee Email Id :");
	empEmail=sc.nextLine();
	if(validate(empEmail)) {
		System.out.println("Thank you for providing correct email.....");
	}else {
		System.out.println("Enter email in specified format (ex:- swapna@gmail.com)");
	}

	System.out.println("Enter the Employee dob in 'dd/MM/yyyy' ");
	String dob = sc.nextLine();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	empDob = sdf.parse(dob);
	System.out.println("Enter the Employee doj in 'dd/MM/yyyy' ");
     String doj = sc.nextLine();
	empDoj = sdf.parse(doj);
	System.out.println("Enter phone number");
	empPhoneNo=sc.nextLong();
	
}

@SuppressWarnings("deprecation")
void displayEmployeeDetails(){
	System.out.println("Entered the Employee data ...............");
	System.out.println("Employee id = " + empId );
	System.out.println("Employee name = " + eName);
	System.out.println("Employee dob = " + empDob.getDate()+"/"+empDob.getMonth()+"/"+empDob.getYear());
	System.out.println("Employee doj = " + empDoj.getDate()+"/"+empDoj.getMonth()+"/"+empDoj.getYear());
	System.out.println("Employee Phone number = " + empPhoneNo );
	System.out.println("Employee Email id = " + empEmail );
}
}
