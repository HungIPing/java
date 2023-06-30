package tw.org.iii.tutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Brad49 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream("dir1/coffe.jpg");
			FileInputStream fin = new FileInputStream("dir2/coffe.jpg");
			int b;
			while ((b = fin.read()) != -1) {
				fout.write(b);

			}
			fin.close();
			fout.flush();
			fout.close();

			System.out.println("finish:" + (System.currentTimeMillis() - start));

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
