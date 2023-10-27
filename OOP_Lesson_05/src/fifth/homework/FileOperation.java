package fifth.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {

  public static long copyFile(File in, File out) throws IOException {
    try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {

      return is.transferTo(os);
    }
  }

  public static long copyFolder(File folderIn, File folderOut, long maxSize) throws IOException {
    File[] files = folderIn.listFiles();
    long fileCopy = 0;
    for (int i = 0; i < files.length; i++) {
      if (files[i].isFile() && files[i].length() <= maxSize) {
        File out = new File(folderOut, files[i].getName());
        copyFile(files[i], out);
        fileCopy += 1;
      }
    }
    return fileCopy;
  }

}

  

