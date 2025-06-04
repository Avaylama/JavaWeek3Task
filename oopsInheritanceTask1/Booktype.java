class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayDetails() {
        System.out.println(title);
        System.out.println(author);
    }
}

class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author);
    }
}

// Derived class: NonFictionBook
class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author);
    }
}

class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author);
    }
}

public class Booktype {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("1984", "George Orwell");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Introduction to Algorithms", "Thomas H. Cormen");

        System.out.println("Fiction Book:");
        fiction.displayDetails();
        System.out.println();

        System.out.println("Non-Fiction Book:");
        nonFiction.displayDetails();
        System.out.println();

        System.out.println("Technical Book:");
        technical.displayDetails();
    }
}
