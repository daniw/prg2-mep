package filewrite;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
	
	private final String FILENAME = "myData.bin";
	
	private String fileName;
	private File f;
	
	private FileInputStream fis;
	private DataInputStream dis;
	
	public Reader(String fileName) throws IOException {
		try {
			this.fileName = fileName;
			f = new File(fileName);
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
		}
		catch (IOException e1) {
			System.out.println("Something went wrong for " 
					+ fileName + ": " + e1.getMessage());
		}
	}
	
	public int[] showInt() throws IOException {
		int[] data = null;
		try {
			int elements = dis.readInt();
			data = new int[elements];
			for(int i = 0; i < elements; i++) {
				data[i] = dis.readInt();
			}
			return data;
		}
		catch (IOException e1) {
			System.out.println("Something went wrong reading from " 
					+ fileName + ": " + e1.getMessage());
		}
		return data;
	}
}