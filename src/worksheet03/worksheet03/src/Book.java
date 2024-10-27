public class Book extends BorrowableItems{
    private  String title;
    private String author;

    private String ISBN;

    private boolean available;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        ISBN = isbn;
        this.available = available;
    }

    @Override
    public  void displayInfo(){
        System.out.println("The book Title : "+title);
        System.out.println("The book author : "+author);
        System.out.println("The book ISBN : "+ISBN);
        System.out.println("The book availability : "+available);
    }
}
