package com.in.educationInstitute;

public class EducationInstitute extends Thread 
{
//	field Injections
	Course course[];
	Offer offers[];
	public EducationInstitute(Course course[], Offer offers[]) {
		super();
		this.course = course;
		this.offers = offers;
	}
	public Course[] getCourse() {
		return course;
	}
	public Offer[] getOffers() {
		return offers;
	}
	public void enrollStudentInCourse(int courseId, String studentName)
	{
		System.out.println(studentName+" has enrolled in the course:"+courseId);
	}
	
	

}
