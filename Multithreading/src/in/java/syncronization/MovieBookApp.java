package in.java.syncronization;

public class MovieBookApp extends Thread {
	
	public static void main(String[] args) {
		BookTheaterSeat book=new BookTheaterSeat();
		
		new Thread() {
			public void run(){
				book.bookSeat(20);
			}
		}.start();
		
		new Thread() {
			public void run(){
				book.setTotalSeat(100);
			}
		}.start();
	}

}
