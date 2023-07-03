package tw.org.iii.tutor;

import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.plaf.FontUIResource;

public class Brad66 {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(9999);
			System.out.print("wait...");
			Socket socket = server.accept();

			String urip = socket.getInetAddress().getHostAddress();

			FileOutputStream fout = new FileOutputStream(String.format("dir1/%s.jpg", urip));

			InputStream in = socket.getInputStream();
			BufferedInputStream bin = new BufferedInputStream(in);
			byte[] buf = new byte[4 * 1024 * 1024];
			int len;while ((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			bin.close();

			fout.flush();
			fout.close();
			server.close();

			System.out.println("\nServer OK");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
