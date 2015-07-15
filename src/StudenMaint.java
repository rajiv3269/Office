import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class StudenMaint {


	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add(new Student(1,"rajiv",100));
		al.add(new Student(2,"sarkar",32));
		
		Collections.sort(al);
		Iterator  itr = al.iterator();
		
		while(itr.hasNext()){
			
			Student st = (Student) itr.next();
			 System.out.println(st.age+" "+ st.id+" "+st.name);
		}
	

	}

}
