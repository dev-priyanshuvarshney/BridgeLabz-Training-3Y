class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("-------------------------");
    }
}

public class MovieTicket {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("", 0, 0);
        ticket1.bookTicket("Avengers: Endgame", 12, 350);
        ticket1.displayTicket();

        MovieTicket ticket2 = new MovieTicket("", 0, 0);
        ticket2.bookTicket("Oppenheimer", 25, 400);
        ticket2.displayTicket();
    }
}
