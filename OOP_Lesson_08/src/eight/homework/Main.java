package eight.homework;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
	  Student s0 = new Student("Anton", "Antonov",Gender.MALE, 0, "Java");
	  Student s1 = new Student("Ivan", "Ivanov",Gender.MALE, 1, "C");
	  Student s2 = new Student("Peter", "Petrov",Gender.MALE, 2, "Java");
	  Student s3 = new Student("Vasilly", "Vasilliev",Gender.MALE, 3, "C");
	  Student s4 = new Student("Efim", "Efimov",Gender.MALE, 4, "Java");
	  Student s5 = new Student("Semen", "Semenov",Gender.MALE, 5, "C");
	  Student s6 = new Student("Viktor", "Viktorov",Gender.MALE, 6, "Java");
	  Student s7 = new Student("Valery", "Valeriev",Gender.MALE, 7, "C");
	  //Student s8 = new Student("Olga", "Olgovna",Gender.FEMALE, 8, "Java");
	  //Student s9 = new Student("Yuri", "Yuriev",Gender.MALE, 9, "C");
	  //Student s10 = new Student("Valentin", "Valentinov",Gender.MALE, 10, "Java");
	  
	 // Student[] students = new Student[] {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
	  
	  Group g1 = new Group();
	  g1.setGroupName("Java");
	  
	  try {
		g1.addStudent(s0);
		g1.addStudent(s2);
		g1.addStudent(s4);
		g1.addStudent(s6);
				
	  } catch (GroupOverflowException e) {
		System.out.println("Group overflow");
		e.printStackTrace();
	  }
	  Group g2 = new Group();
	  g2.setGroupName("C");
	  
	  try {
		  g2.addStudent(s1);
		  g2.addStudent(s3);
		  g2.addStudent(s5);
		  g2.addStudent(s7);
		  
	  } catch (GroupOverflowException e) {
			System.out.println("Group overflow");
			e.printStackTrace();
		  }
	  System.out.println();
	  
//	  try {
//		  System.out.println("Search by last name: ");
//		  System.out.println(g.searchStudentByLastName("Olgovna"));
//		  
//	  } catch (StudentNotFoundException e) {
//		  e.printStackTrace();  
//	  }
//	  System.out.println();
//	  System.out.println("Remove by Id: ");
//	  System.out.println(g.removeStudentByID(2));
//	  System.out.println(g.removeStudentByID(12));
//	  
//	  System.out.println();
//	  System.out.println("Sort students by last name: ");
//	  g.sortStudentsByLastName();
//	  
//	  StudentKeyboardInput ski = new StudentKeyboardInput();
//	  ski.addToGroup(g);
//	  System.out.println(g);
	  
//	  GroupFileStorage gfs = new GroupFileStorage();
//	  gfs.saveGroupToCSV(g);
//	  
//	  try {
//		  GroupFileStorage GroupFileStorage = new GroupFileStorage();
//          File file = new File("/Users/wehav/eclipse-workspace/Java-OOP/OOP_Lesson_05/src/Groups/Java.csv");
//          Group group = GroupFileStorage.loadGroupFromCSV(file);
//          
//      } catch (IOException | GroupOverflowException e) {
//          e.printStackTrace();
//          
//      }
//	  
////	  Напишите программу, которая скопирует все файлы с заранее определенным расширением
//	  
//	  File in = new File("/Users/wehav/Java theory/Java OOP/10 Map.pdf");
//	  File out = new File(in.getName());
//	  
//	  try {
//		FileOperation.copyFile(in, out);
//	} catch (IOException e) {
//		
//		e.printStackTrace();
//	}
	  Student s11 = new Student("Ignat", "Ignatiev",Gender.MALE, 11, "Java");
	  try {
		  g1.addStudent(s11);
	  } catch (GroupOverflowException e) {
		  System.out.println(e.getMessage());
	  }
	  boolean hasEqualsStudents1 = g1.hasEqualStudents();  
	  boolean hasEqualsStudents2 = g2.hasEqualStudents();
  }
}
