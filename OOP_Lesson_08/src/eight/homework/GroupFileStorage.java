package eight.homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class GroupFileStorage {
	
	public void saveGroupToCSV(Group gr) {
		try(PrintWriter groupSVG = new PrintWriter(new File("/Users/wehav/eclipse-workspace/Java-OOP/OOP_Lesson_05/src/Groups/" + gr.getGroupName() + ".csv"))) {
			for(int i = 0; i < gr.getStudents().length; i++) {
				groupSVG.println(gr.getStudents()[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Group loadGroupFromCSV(File file) throws IOException, GroupOverflowException {
		Group g = new Group();
		try(BufferedReader r = new BufferedReader(new FileReader(file))) {
			String result = "";
			String temp =  "";
			for(;;) {
				temp = r.readLine();
				if(temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return g;
	}
	
	public static File findFileByGroupName(String groupName, File workFolder) throws FileNotFoundException {

		File[] file1 = workFolder.listFiles();
		File file = new File(".");

		for (int i = 0; i < file1.length; i++) {
			if (file1[i].getName().split("[.]")[0].equals("Group " + groupName)) {
				file = file1[i];
			}
		}

		File[] file2 = file.listFiles();

		for (int j = 0; j < file2.length; j++) {
			if (file2[j].getName().split("[.]")[0].equals(groupName)) {
				file = file2[j];
			}
		}
		return file;
		}
    }
