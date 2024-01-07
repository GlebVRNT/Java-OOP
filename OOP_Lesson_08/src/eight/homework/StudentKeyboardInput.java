package eight.homework;

import java.util.Scanner;
public class StudentKeyboardInput {
	
	public Student getStudentFromInput() {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Add new student: ");
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		student.setName(name);
		
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		student.setLastName(lastName);
		
		System.out.println("Enter gender in capital letters: ");
		Gender gen = Gender.valueOf(sc.nextLine().toUpperCase());
		if(gen.equals(Gender.MALE) || gen.equals(Gender.FEMALE)) {
			student.setGender(gen);
		} else {
			System.out.println("Enter correct gender");
		}
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		student.setId(id);
		
		
		System.out.println("Enter group name: ");
		
		String group = scn.nextLine();
		student.setGroupName(group);
		
		
		return new Student(name, lastName, gen, id, group);
	}
	public void addToGroup(Group group) {
		try {
			group.addStudent(getStudentFromInput());
		} catch (GroupOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}