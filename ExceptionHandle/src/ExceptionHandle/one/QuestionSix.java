package ExceptionHandle.one;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class QuestionSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("s.txt"));BufferedReader br=new BufferedReader(new FileReader("C:\\Shubham\\DAC\\Advance-Java Workspace\\ExceptionHandle\\src\\ExceptionHandle\\one\\QuestionSix.java"))) {
			while(br.readLine()!=null) {
				String line=br.readLine();
				bw.write(line);
				System.out.println(line);
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("success");
	}

}
