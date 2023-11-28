package ExceptionHandle.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QuestionFour {

	public static void main(String[] args) {
		QuestionFour q=new QuestionFour();
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int i;
		try {
			System.out.println("Enter a Digit");
			i=sc.nextInt();
			try {
				q.negativeNumber(i);
				System.out.println("ENtered Number is :"+i);
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (InputMismatchException e) {
			System.out.println(e);
		}finally {
			sc.close();
		}
		System.out.println("continue...");
	}
	
	void negativeNumber(int n) throws NegativeNumberException{
		if(n<0)
			throw new NegativeNumberException("Number is negative.");
	}
	
	
	
	

}

class NegativeNumberException extends Exception{
	public NegativeNumberException(String str) {
		super(str);
	}
}


