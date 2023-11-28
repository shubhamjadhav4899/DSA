package fileHandling.questionFive;

import java.io.StreamCorruptedException;

public class StramNotFoundException extends StreamCorruptedException {
	public StramNotFoundException(String str) {
		super(str);
	}
}
