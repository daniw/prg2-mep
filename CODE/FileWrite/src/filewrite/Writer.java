package filewrite;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {
	
	private final String FILENAME = "myData.bin";
	
	private String fileName;
	private File f;
	
	FileOutputStream fos;
	DataOutputStream dos;
	
	public Writer(String fileName) throws IOException {
		try {
			this.fileName = fileName;
			f = new File(fileName);
			fos = new FileOutputStream(f);
			dos = new DataOutputStream(fos);
		}
		catch (IOException e1) {
			System.out.println("Something went wrong for " 
					+ fileName + ": " + e1.getMessage());
		}
	}
	
	public void saveInt(int size, int[] data) throws IOException {
		try {
			dos.writeInt(size);
			for(int i : data) {
				dos.writeInt(i);
			}
		}
		catch (IOException e1) {
			System.out.println("Something went wrong writing to " 
					+ fileName + ": " + e1.getMessage());
		}
	}
	
}
