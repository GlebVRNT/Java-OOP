package eight.homework;

import java.util.Comparator;

public class StudentLastNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {	
		Student s0 = (Student) o1;
		Student s1 = (Student) o2;
		String lastName1 = s0.getLastName();
		String lastName2 = s1.getLastName();
		
		if(lastName1.compareTo(lastName2) > 0) {
			return 1;
		}
		if(lastName1.compareTo(lastName2) < 0) {
			return -1;
		}	
		return 0;
	}
}
