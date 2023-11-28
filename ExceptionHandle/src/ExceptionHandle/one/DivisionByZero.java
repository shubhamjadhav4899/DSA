package ExceptionHandle.one;

import java.util.Scanner;

public class DivisionByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A");
		int a=sc.nextInt();
		System.out.println("Eneter B");
		int b=sc.nextInt();
//		StringBuilder sb=new StringBuilder(a);
//		StringBuilder sb1=new StringBuilder(b);
		
		try {
			int c;
			c=a/b;
			System.out.print("result is : ");
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Running ...");
		
		

	}

}
