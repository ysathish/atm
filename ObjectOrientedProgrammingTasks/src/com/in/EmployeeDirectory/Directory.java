package com.in.EmployeeDirectory;

import java.util.ArrayList;

public class Directory {
	ArrayList<Employee> emp;
	

	public Directory() {
		emp=new ArrayList<>();
	}

	public ArrayList<Employee> getEmp() {
		return emp;
	}

	public void setEmp(ArrayList<Employee> emp) {
		this.emp = emp;
	}
	public void addEmployee(Employee emp)
	{
		
        this.emp.add(emp);
		
		
	}
	public void displayAllEmployees()
	{
		if(this.emp.isEmpty())
		{
			System.out.println("no employees in the directory");
		}
		else {
			for(Employee emp:this.emp)
				System.out.println(emp);
		}
		
	}
	public void updateEmployee(int index,String name,String position,double sal)
	{
      if(index>=0 && index<emp.size())
      {
    	  Employee emp=this.emp.get(index);
    	  emp.setName(name);
    	  emp.setPosition(position);
    	  emp.setSalary(sal);
      }
      else 
      {
    	  System.out.println("invalid details");
      }
		
	}
	public void deleteEmployee(int index)
	{
		if(index>=0 && index<this.emp.size())
		{
			this.emp.remove(index);
		}
		 else 
	      {
	    	  System.out.println("invalid details");
	      }
	}
}
