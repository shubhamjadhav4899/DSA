package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class QuestionThree {

	public static void main(String[] args)throws Exception {
		QuestionThree queationThree=new QuestionThree();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the file name below");
		String s=br.readLine();
		
		String data=br1.readLine();
		queationThree.dataInsertAccordingFileName(s, data);
		
	}
	
	public void dataInsertAccordingFileName(String file,String data) {
		//by default data is oeri
		try(BufferedWriter br=new BufferedWriter(new FileWriter(file,true))) {
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
