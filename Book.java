import java.util.*;

public class Book {
    private String author;
    private String title;
    private String genre; 

    public Book(String author, String title, String genre) {
        this.author = author;
        this.title = title;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Author: " + author + "\nBook: " + title + "\nGenre: " + genre + "\n";
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void printLibrary() {
        System.out.println("\033[0;1mFull Library Collection\033[0m\n");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

abstract class GenreCollection {
    protected Library library;

    public GenreCollection(Library library) {
        this.library = library;
    }

    public abstract void printGenre();
}

class ClassicsCollection extends GenreCollection {
    public ClassicsCollection(Library library) {
        super(library); 
    }

    @Override
    public void printGenre() {
        System.out.println("\033[0;1mClassics Collection\033[0m\n");
        for (Book book : library.getAllBooks()) {
            if (book.getGenre().equalsIgnoreCase("Classic")) {
                System.out.println(book);
            }
        }
    }
}

class ThrillerCollection extends GenreCollection {
    public ThrillerCollection(Library library) {
        super(library);
    }

    @Override
    public void printGenre() {
        System.out.println("\033[0;1mThrillers Collection\033[0m\n");
        for (Book book : library.getAllBooks()) {
            if (book.getGenre().equalsIgnoreCase("Thriller")) {
                System.out.println(book);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Library fullLib = new Library();
        Book book1 = new Book("Alcott, Louisa May", "Little Women", "Classic");
        Book book2 = new Book("Dickens, Charles", "Oliver Twist", "Classic");
        Book book3 = new Book("Flynn, Gillian", "Gone Girl", "Thriller");
        Book book4 = new Book("Whitaker, Chris", "All the Colors of the Dark", "Thriller");

        fullLib.addBook(book1);
        fullLib.addBook(book2);
        fullLib.addBook(book3);
        fullLib.addBook(book4);

        ClassicsCollection classicsGenre = new ClassicsCollection(fullLib);
        ThrillerCollection thrillerGenre = new ThrillerCollection(fullLib);

        fullLib.printLibrary();
        System.out.println();

        GenreCollection genrePrinter1 = classicsGenre;
        genrePrinter1.printGenre();
        System.out.println();

        GenreCollection genrePrinter2 = thrillerGenre;
        genrePrinter2.printGenre();
    }
}