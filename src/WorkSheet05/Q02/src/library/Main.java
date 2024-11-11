package library;
import library.utils.BookUtils;
import  library.books.FictionBook;

public class Main {
    public static void main(String[] args) {
        FictionBook book = new FictionBook("The Great Adventure", "John Doe", "Adventure");
        book.displayInfo();
        BookUtils.printBookDetails(book);

    }
}
