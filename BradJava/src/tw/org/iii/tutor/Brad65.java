package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad65 {

	public static void main(String[] args) {
		String mesg = "Test By TCP";
		try {
			Socket socket = new Socket(InetAddress.getByName("10.0.101.187"),9999);
			
			File sourse = new File("dir1\\ball0.png");
			FileInputStream fin  = new FileInputStream(sourse);
			byte[]buf = new byte[(int)sourse.length()];
			fin.read();
			fin.close();
			
			OutputStream out = socket.getOutputStream();
			out.write(mesg.getBytes());
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Client OK");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

}
