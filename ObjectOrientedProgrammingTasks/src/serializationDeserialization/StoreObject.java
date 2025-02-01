package serializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StoreObject 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> studentList=new ArrayList<>();
		System.out.println("enter no of students you want:");
		int noStudents=sc.nextInt();
		for(int i=0;i<noStudents;i++)
		{
			System.out.println("enter student details"+(i+1)+":");
			Student student=Student.getStudentObject();
			studentList.add(student);
		}
		//serialization
		FileOutputStream fos=new FileOutputStream("Student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		                   oos.writeObject(studentList);
		                   System.out.println("students details added successfully");
		                   sc.close();
	}

}
