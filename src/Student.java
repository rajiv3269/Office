
public class Student implements Comparable<Student> {

	public int id,age;
	public String name;
	

	
	public Student(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
		


@Override
public int compareTo(Student st1) {
	
	return this.name.compareTo(st1.name);
	
}

}
