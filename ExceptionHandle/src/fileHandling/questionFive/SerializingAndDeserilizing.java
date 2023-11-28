package fileHandling.questionFive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializingAndDeserilizing {

	public static void sereilized(String str,Person p) throws IOException {
		try(FileOutputStream fos=new FileOutputStream(str);ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			oos.writeObject(p);
			
		} 
	}
	public static void Deserilized(String str) throws FileNotFoundException, ClassNotFoundException {
		Person person=null;
		File f=new File(str);
		if (f.exists()) {
			try(FileInputStream fis=new FileInputStream(f);ObjectInputStream ois=new ObjectInputStream(fis)) {
				person=(Person) ois.readObject();	
				System.out.println(person);
				System.out.println("Deselization successfull.");
			} catch (IOException|ClassNotFoundException e) {
				System.err.println("Error occured during serelization"+e.getMessage());
			}
		}
		else throw new FileNotFoundException("File not found");
	}
}
