class Shelf {
    String rackName;
    Novel[] collection;
    int count;

    Shelf(String rackName, int size) {
        this.rackName = rackName;
        this.collection = new Novel[size];
        this.count = 0;
    }

    void addNovel(Novel n) {
        if (count < collection.length) {
            collection[count] = n;
            count++;
        } else {
            System.out.println("Shelf is full!");
        }
    }

    void showShelf() {
        System.out.println("Shelf: " + rackName);
        for (int i = 0; i < count; i++) {
            collection[i].showNovel();
            System.out.println();
        }
    }
}

class Novel {
    String bookTitle;
    String writer;

    Novel(String bookTitle, String writer) {
        this.bookTitle = bookTitle;
        this.writer = writer;
    }

    void showNovel() {
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + writer);
    }
}

public class ShelfDemo {
    public static void main(String[] args) {
        Novel n1 = new Novel("The Alchemist", "Paulo Coelho");
        Novel n2 = new Novel("1984", "George Orwell");
        Novel n3 = new Novel("Wings of Fire", "A. P. J. Abdul Kalam");

        Shelf s1 = new Shelf("Rack A", 2);
        Shelf s2 = new Shelf("Rack B", 3);

        s1.addNovel(n1);
        s1.addNovel(n2);

        s2.addNovel(n2);
        s2.addNovel(n3);

        s1.showShelf();
        System.out.println("-----------");
        s2.showShelf();
    }
}
