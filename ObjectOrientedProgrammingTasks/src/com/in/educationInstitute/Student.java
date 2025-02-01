package com.in.educationInstitute;

public class Student extends Thread
{
	String name;
	EducationInstitute institute;
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees()
	{
	   	
	for(Course course:	institute.course )
		System.out.println(course);
		
		
		
	}
	public void viewOffers()
	{
		for(Offer offer:institute.offers)
			System.out.println(offer.getOfferText());
			
	}
	public void enrollInCourse(int courseId)
	{
		institute.enrollStudentInCourse(courseId, name);
	}

}
