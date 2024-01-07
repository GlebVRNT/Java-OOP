package eight.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {
	
	public static long copyFile(File in, File out) throws IOException {
		try(InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)) {
			return is.transferTo(os);	
		}
	}

}
 