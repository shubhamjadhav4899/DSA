package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileReaderWriter {

	public static void main(String[] args)throws FileExistException,FileNotFoundException {
		FileOperator fileOPerator=new FileOperator();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the name of input file");
			String input=br.readLine();
			File file=new File(input);
			if(file.exists())
				throw new FileExistException("File Already Exist.");
			String data="Write a program that reads the contents of a text file and writes them to a new file. Allow the user to \r\n"
					+ "specify the names of the input and output files as command-line arguments. Handle the \r\n"
					+ "`FileNotFoundException` if the input file is not found.";
			fileOPerator.createFile(input,data);
			try {
				if(file.exists())
					fileOPerator.redFile(input);
				else
					throw new FileNotFoundException("File Not Found");
						
			} catch (Exception e) {
				System.out.println(e);
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
class FileOperator{
	public void createFile(String str,String data) throws Exception {
		BufferedWriter bw=new BufferedWriter(new FileWriter(str));
		bw.write(data);
		bw.close();
		
	}
	
	public void redFile(String str)throws Exception {
		BufferedReader br=new BufferedReader(new FileReader(str));
		while(br.read()!=-1) {
			String s=br.readLine();
			System.out.println(s);
			
		}
		
		
	}
}

class FileExistException extends Exception{
	public FileExistException(String str) {
		super(str);
	}
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String str) {
		super(str);
	}
}