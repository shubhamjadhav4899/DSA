package question.two;

public class NumberThreads{
	public static void main(String[] args) throws InterruptedException {
		FibonnaciThread fb=new FibonnaciThread();
		PrimeThread pm=new PrimeThread();
		DisplayThread dt=new DisplayThread();
		
		fb.start();
		fb.join();
		pm.start();
		pm.join();
		dt.start();
		dt.join();
		
	}
}