package fileHandling.questionFive;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {
	private String output;
	private String input;

	public static void main(String[] args)throws Exception,StramNotFoundException {
		//Serilization part
		Person p=new Person(44, "raju");
		SerializingAndDeserilizing.sereilized("d.txt", p);
		//Deserilization part
		SerializingAndDeserilizing.Deserilized("h.txt");
		
		
	}

}
