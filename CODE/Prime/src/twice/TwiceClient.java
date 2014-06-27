package twice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TwiceClient {
	
	public static void main(String[] args) throws IOException{
		
		int port = 6789;
		String host = "127.0.0.1"; // localhost
		
		boolean state = true;
		
		BufferedReader keyStream = new BufferedReader(new InputStreamReader(System.in));
		
		while(state){
			Socket client = new Socket(host, port);
			PrintWriter outStream = 
					new PrintWriter(client.getOutputStream());
			BufferedReader inStream = 
					new BufferedReader(
							new InputStreamReader(client.getInputStream())
					);
			
			System.out.println(inStream.readLine());
			String line = keyStream.readLine();
			
			if(line.equals("END")) {
				state = false;
				outStream.println(line);
				outStream.flush();
				client.close();
			}
			else {
				state = true;
				outStream.println(line);
				outStream.flush();
				line = inStream.readLine();
				System.out.println(line);
				client.close();
			}
			
		}
		
		System.exit(0);
	}
	
}
