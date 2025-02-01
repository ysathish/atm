package com.in.EmployeeDirectory;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		Directory directory=new Directory();
		directory.addEmployee(new Employee("Alice", "Manager", 60000.0));
		directory.addEmployee(new Employee("Bob", "Developer", 50000.0));
		 System.out.println("Initial Employee List:");
	        directory.displayAllEmployees();
	        directory.updateEmployee(1, "Bob", "Senior Developer", 55000.0);
	        System.out.println("\nAfter Updating Bob's Information:");
	        directory.displayAllEmployees();

	        // Delete Alice from the directory
	        directory.deleteEmployee(0);
	        System.out.println("\nAfter Deleting Alice:");
	        directory.displayAllEmployees();
		
		
		
		

	}

}
