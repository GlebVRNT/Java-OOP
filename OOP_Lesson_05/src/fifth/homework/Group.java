package fifth.homework;

import java.util.Arrays;
import java.util.Comparator;
public class Group {
	private String groupName;
	private final Student[] students = new Student[10];
	
	
	public Group() {
		super();
	} 

	public Group(String groupName) {
		super();
		this.groupName = groupName;
		
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Student[] getStudents() {
		return students;
	}
	
	public void addStudent(Student student) throws GroupOverflowException {
		for(int i = 0; i < students.length; i++) {
			if(students[i] == null) {
				students[i] = student;
				return;
			}
		}
			throw new GroupOverflowException("Group overflow");			
	}
	
	public Student searchStudentByLastName(String lastName) throws StudentNotFoundException {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if(students[i].getLastName().equals(lastName)) {
					return students[i];
				}
			}
		}
		throw new StudentNotFoundException("No student with this last name");
	}
	
	public boolean removeStudentByID(int id) {
		for(int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				if (students[i].getId() == id) {
					students[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public void sortStudentsByLastName() {
		
		Arrays.sort(students,Comparator.nullsLast(new StudentLastNameComparator()));
		  System.out.println();
		  for (int i = 0; i < students.length; i++) {
			  System.out.println(students[i]);
		  }
		
	}

	@Override
	public String toString() {
		String res = "Group " + groupName + "\".Students:" + System.lineSeparator();
		for (int i = 0; i < students.length; i++) {
			if(students[i] != null) {
				res+=students[i] + System.lineSeparator();
			}
		}
		return res;
	}
}
