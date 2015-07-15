package com.rajiv.org;

public class Student1 implements Comparable<Student1>{
	
	public Integer id;
	public String name;
	public int age;	
	public Student1(int id,String name,int age){
		
		this.id = new Integer(id);
		this.name = name;
		this.age = age;
		
		
				
	}
	

	@Override
	public int compareTo(Student1 student1) {
		
		return this.id.compareTo(student1.id);
		
		
	}
	
	
	

}
