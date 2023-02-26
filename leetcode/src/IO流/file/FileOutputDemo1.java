package IO流.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {

	public static void main(String[] args) {
		// 文件拷贝
		try {
			FileInputStream fis=new FileInputStream("12346.jpg");
			FileOutputStream fos=new FileOutputStream("newpic.jpg");
			int n = 0;
			byte[] ret = new byte[143360];
			while((n = fis.read(ret)) != -1){
				fos.write(ret);
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
