package com.rajiv.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student1Maint {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(new Student1(78,"Rajiv",25));
		list.add(new Student1(24,"sarkar",50));
		
		Collections.sort(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			Student1 st = (Student1) itr.next();
			
			System.out.println(st.id+ " " + st.name+ " "+st.age);
			
		}

	}

}
