class Publication {
    String bookTitle;
    int yearPublished;

    Publication(String bookTitle, int yearPublished) {
        this.bookTitle = bookTitle;
        this.yearPublished = yearPublished;
    }

    void displayInfo() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Year: " + yearPublished);
    }
}

class Writer extends Publication {
    String writerName;
    String description;

    Writer(String bookTitle, int yearPublished, String writerName, String description) {
        super(bookTitle, yearPublished);
        this.writerName = writerName;
        this.description = description;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + writerName);
        System.out.println("About: " + description);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Writer obj = new Writer("Journey Beyond", 2022, "Aarav Mehta", "An Indian novelist known for modern literature.");
        obj.displayInfo();
    }
}
