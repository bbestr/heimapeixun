package IO流.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {

	public static void main(String[] args) {
		// 创建一个FileInputStream对象
		try {
			FileInputStream f1 = new FileInputStream("imooc.txt");
			byte[] str = new byte[100];
			f1.read(str,0,60);
			System.out.println(new String(str));
			f1.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
