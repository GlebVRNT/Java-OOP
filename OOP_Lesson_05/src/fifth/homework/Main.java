package fifth.homework;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
	  Student s0 = new Student("Anton", "Antonov",Gender.MALE, 0, "Java");
	  Student s1 = new Student("Ivan", "Ivanov",Gender.MALE, 1, "Java");
	  Student s2 = new Student("Peter", "Petrov",Gender.MALE, 2, "Java");
	  Student s3 = new Student("Vasilly", "Vasilliev",Gender.MALE, 3, "Java");
	  Student s4 = new Student("Efim", "Efimov",Gender.MALE, 4, "Java");
	  Student s5 = new Student("Semen", "Semenov",Gender.MALE, 5, "Java");
	  Student s6 = new Student("Viktor", "Viktorov",Gender.MALE, 6, "Java");
	  Student s7 = new Student("Valery", "Valeriev",Gender.MALE, 7, "Java");
	  Student s8 = new Student("Olga", "Olgovna",Gender.FEMALE, 8, "Java");
	  Student s9 = new Student("Yuri", "Yuriev",Gender.MALE, 9, "Java");
	  Student s10 = new Student("Valentin", "Valentinov",Gender.MALE, 10, "Java");
	  
	  Student[] students = new Student[] {s0, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10};
	  
	  Group g = new Group("Java");
	  
	  try {
		g.addStudent(s0);
		g.addStudent(s1);
		g.addStudent(s2);
		g.addStudent(s3);
		g.addStudent(s4);
		g.addStudent(s5);
		g.addStudent(s6);
		g.addStudent(s7);
		g.addStudent(s8);
		g.addStudent(s9);
//		
//		
//		System.out.println(g);
//		
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
	  
	  GroupFileStorage gfs = new GroupFileStorage();
	  gfs.saveGroupToCSV(g);
	  
	  try {
		  GroupFileStorage GroupFileStorage = new GroupFileStorage();
          File file = new File("/Users/wehav/eclipse-workspace/Java-OOP/OOP_Lesson_05/src/Groups/Java.csv");
          Group group = GroupFileStorage.loadGroupFromCSV(file);
          
      } catch (IOException | GroupOverflowException e) {
          e.printStackTrace();
          
      }
	  
//	  Напишите программу, которая скопирует все файлы с заранее определенным расширением
	  
	  File in = new File("/Users/wehav/Java theory/Java OOP/10 Map.pdf");
	  File out = new File(in.getName());
	  
	  try {
		FileOperation.copyFile(in, out);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
  }
}
