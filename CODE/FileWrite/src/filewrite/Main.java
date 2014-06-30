package filewrite;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Writer myWriter = new Writer("myData-2.bin");
		Reader myReader = new Reader("myData-2.bin");
		
		int[] data = new int[]{2,4,6,8};
		
		myWriter.saveInt(data.length, data);
		
		int[] record = myReader.showInt();
		
		for(int i : record) {
			System.out.println(i);
		}
	}
	
}
