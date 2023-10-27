package fifth.homework;

import java.io.File;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
//    File in = new File("/home/alexander/Pictures/Потоки ввода вывода.pdf");
//    File out = new File(in.getName());
//
//    try {
//      System.out.println(FileOperation.copyFile(in, out) + " byte copy");
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

    File folderIn = new File("/home/alexander/Pictures/Screenshots");

    File folderOut = new File("aaa");

    folderOut.mkdirs();

    try {
      System.out.println(FileOperation.copyFolder(folderIn, folderOut, 1_000_000));
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }

}
