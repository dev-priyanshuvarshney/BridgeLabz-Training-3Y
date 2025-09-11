class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Author a1 = new Author("The Great Gatsby", 1925, "F. Scott Fitzgerald", "American novelist and short story writer.");
        Author a2 = new Author("1984", 1949, "George Orwell", "English novelist, essayist, and critic.");

        a1.displayInfo();
        System.out.println();
        a2.displayInfo();
    }
}
