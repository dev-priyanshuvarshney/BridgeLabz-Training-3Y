class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 550.50);
        Book b2 = new Book("Python Basics", "Guido van Rossum", 450.75);

        b1.displayDetails();
        b2.displayDetails();
    }
}
