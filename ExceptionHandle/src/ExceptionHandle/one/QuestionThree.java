package ExceptionHandle.one;

import java.util.Scanner;

public class QuestionThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		QuestionThree q=new QuestionThree();
		System.out.print("Enter the age : " );
		int age=sc.nextInt();
		
		try {
			q.validateNumber(age);
		} catch (NumberException e) {
			System.out.println(e);
		}
		System.out.println("Running...");
	}
	
	 public void validateNumber(int a) throws NumberException{
		if(a<0)
			throw new NumberException("The number is less than 0");
		if(a>120)
			throw new NumberException("Number is greater than 120");
	}
	
	

}

	class NumberException extends Exception{
	
		public NumberException(String str) {
			super(str);
	}
	
	
}
