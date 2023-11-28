package fileHandling.questionFive;

import java.io.Serializable;

public class Person implements Serializable {
	
	private int age;
	private String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "age=" + age + ", name=" + name;
	}

}
