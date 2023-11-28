package fileHandling.questionFour;

import java.io.Serializable;

public class Person implements Serializable{
	private int id;
	private String name;
	private double salary;
	public Person(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
