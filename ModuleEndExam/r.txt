package question.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestOne {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("r.txt"));
		BufferedReader br=new BufferedReader(new FileReader("C:\\Shubham\\DAC\\Advance-Java Workspace\\ModuleEndExam\\src\\question\\one\\FileTestOne.java"));
		String str;
		while((str=br.readLine())!=null) {
			bw.write(str+"\n");
			
		}
		bw.close();
		
		
	}

}
