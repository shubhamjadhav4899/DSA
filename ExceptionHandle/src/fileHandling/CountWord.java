package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CountWord {

	public static void main(String[] args)throws FileIsEmptyException {
		String s="gg.txt";
		CountWord.wordCounter(s);
		
	}
	public static void wordCounter(String s) {
		File f=new File(s);
		try(BufferedReader br =new BufferedReader(new FileReader(s));) {
			
			if(br.read()==-1) {
				throw new FileIsEmptyException("Given file is empty...");
			}
			if(f.exists()!=true) {
				throw new FileIsEmptyException("file is Empty");
			}
			int count=0;
			String line;
			while((line=br.readLine())!=null) {
				count++;
				String[] word=line.split(" ");
				for(String str:word) {
					int n=str.length();
					count+=n;
				}
			}
			System.out.println("Total Word count in the file is : "+count);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

class FileIsEmptyException extends Exception{
	public FileIsEmptyException(String str) {
		super(str);
	}
}