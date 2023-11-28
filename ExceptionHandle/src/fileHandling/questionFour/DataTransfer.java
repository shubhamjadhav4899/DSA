package fileHandling.questionFour;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataTransfer {
	public void doTransfer(String input,String output)throws Exception {
		File f=new File(input);
		File fo=new File(output);
		byte[] b=new byte[1024];
		int byteRead;
			try(BufferedOutputStream br=new BufferedOutputStream(new FileOutputStream(fo));BufferedInputStream bi=new BufferedInputStream(new FileInputStream(f))) {
				while((byteRead=bi.read(b))!=-1) {
					br.write(b, 0, byteRead);
				}
				System.out.println("File copid sucssesfully");	
			} catch (Exception e) {
				System.out.println(e);
			}
		
	}
}
