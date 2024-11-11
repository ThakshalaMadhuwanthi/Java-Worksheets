package library.books;

public class FictionBook {
    String title;
    String author;
    String genre;

    public FictionBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public void displayInfo(){
        System.out.println("The title is "+title);
        System.out.println("The Author is  "+author);
        System.out.println("The genre is "+genre);
        System.out.println("\n");

    }
}
