class Book {
    static String libraryName = "City Central Library";
    final String isbn;
    String title;
    String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book b = (Book) obj;
            System.out.println("Title: " + b.title);
            System.out.println("Author: " + b.author);
            System.out.println("ISBN: " + b.isbn);
        } else {
            System.out.println("Not a Book object.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "ISBN12345");
        Book b2 = new Book("1984", "George Orwell", "ISBN67890");
        b1.displayBookDetails(b1);
        b2.displayBookDetails(b2);
        String notABook = "Hello World";
        b1.displayBookDetails(notABook);
    }
}
