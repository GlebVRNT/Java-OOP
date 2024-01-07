package eight.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
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
	public boolean hasEqualStudents() {
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(i == j || students[i] == null) {
					continue;
				}
				if(students[i].equals(students[j])) {
					System.out.println(students[i].toString() + " Equals " + students[j].toString());
					return true;
				}
			}
		} return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
		result = prime * result + Objects.hash(groupName);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Group other = (Group) obj;
		return Objects.equals(groupName, other.groupName) && Arrays.equals(students, other.students);
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
