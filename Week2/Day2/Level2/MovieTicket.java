class MovieTicket{
    private String movieName;
	private int seatNumber;
	private double price;
	
	
	public MovieTicket(){
	this.movieName = "";
    this.seatNumber = 0;
    this.price = 0.0;
	}
	
	 public void bookTicket(String movieName, int seatNumber, double price){
	this.movieName=movieName;
	this.seatNumber=seatNumber;
	this.price=price;
	System.out.println("Ticket booked successfully!");
	}
	
	public void displayTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
        System.out.println("--------------------------");
    }
	
	public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        MovieTicket ticket2 = new MovieTicket();

        ticket1.bookTicket("Avengers: Endgame", 12, 250.00);
        ticket2.bookTicket("Inception", 5, 220.00);

        ticket1.displayTicket();
        ticket2.displayTicket();
    }
}