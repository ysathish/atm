package com.in.educationInstitute;

public class Main  {

	public static void main(String[] args) 
	{
		Course course[]= {new Course(1,"java",5000),new Course(2,"python",6000)};
		Offer offer[]= {new Offer("Special discount: Get 20% off on all courses!"),
				new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		EducationInstitute institute=new EducationInstitute(course,offer);
		Student s1=new Student("virat",institute)
				{
			public void run()
			{
				viewCoursesAndFees();
				viewOffers();
				enrollInCourse(1);
				
			}
			
				};
		Student s2=new Student("dhoni",institute)
				{
			public void run()
			{
				viewCoursesAndFees();
				viewOffers();
				enrollInCourse(1);
				
			}
			
				};
//		Thread t1=new Thread(institute);
//		Thread t2=new Thread(institute);
		  s1.start();
		  s2.start();
		
		       
		

	}

}
