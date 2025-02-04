package serializationDeserialization;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFee;
	@SuppressWarnings("unused")
	private Date dateOfAdmision;

	public Student(Integer studentId, String studentName,
			Double studentFee, Date dateOfAdmision) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFee = studentFee;
		this.dateOfAdmision = dateOfAdmision;
	}
	
	public static Student getStudentObject()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id:");
		Integer studentId=sc.nextInt();
		System.out.println("Enter student name:");
		String name=sc.next();
		System.out.println("Enter amount:");
		Double fee=sc.nextDouble();
		 System.out.print("Enter Date of Admission (yyyy-MM-dd): ");
		 sc.nextLine();
		 Date dateOfAdmision=new Date();
		
		Student s=new Student(studentId,name,fee, dateOfAdmision);
		return s;

	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName 
				+ ", studentFee=" + studentFee + "]";
	}
	

}
