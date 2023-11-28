package ExceptionHandle.one;

import java.util.Scanner;

public class QueationTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Index Number ");
		int n=sc.nextInt()-1;
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		int result;
		try {
			result=arr[n];
			System.out.println("The value at index "+n+" is "+arr[n]);
			}
			
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("continue...");
	}

}
