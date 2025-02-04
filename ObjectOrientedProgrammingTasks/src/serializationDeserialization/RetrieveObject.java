package serializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveObject {
	@SuppressWarnings("unchecked")   
	public static void main(String[] args)throws Exception 
	{
		FileInputStream fis=new FileInputStream("Student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		ArrayList<Student> studentList=(ArrayList<Student>)ois.readObject();
		System.out.println("student data:");
		for(Student student:studentList)
			System.out.println(student);
		ois.close();
	}

}
