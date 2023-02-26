package javaio流.path;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
//		File f=new File("c:\\imooc\\java\\thread\\thread.txt");
//		System.out.println(f.exists());
		File f=new File("aaa.txt");
		try {
			f.createNewFile();

			System.out.println(f.getPath());
			System.out.println(f.getAbsolutePath());
			System.out.println(f.getName());
			System.out.println(f.isAbsolute());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
