package in.java.syncronization;

public class BookTheaterSeat {
	
	int totalSeat=10;
	public synchronized void bookSeat(int seat) {
		if(totalSeat<seat) {
			System.out.println("Seat cannot booked wait ");
			System.out.println("Remaining Seat is "+totalSeat);
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			
			System.out.println("Ticket Booked succesfully");
			totalSeat=totalSeat-seat;
			System.out.println("Remaining Seat"+totalSeat);
		}
	}
	
	public synchronized void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
		System.out.println("Seat added Succesfully ...");
		notify();

	}
	
	

}
