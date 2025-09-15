class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private String name;
    private Book[] books;
    private int count;

    public Library(String name, int size) {
        this.name = name;
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        }
    }

    public void showBooks() {
        System.out.println("Library: " + name);
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
        System.out.println();
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell");
        Book b2 = new Book("The Alchemist", "Paulo Coelho");
        Book b3 = new Book("Sapiens", "Yuval Noah Harari");

        Library l1 = new Library("City Library", 5);
        Library l2 = new Library("College Library", 5);

        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b2);
        l2.addBook(b3);

        l1.showBooks();
        l2.showBooks();
    }
}
