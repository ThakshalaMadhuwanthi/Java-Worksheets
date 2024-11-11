package library.utils;

import library.books.FictionBook;

public class BookUtils {

  public  static void printBookDetails(FictionBook Book1){

        System.out.println("The Book: "+Book1.getTitle());
        System.out.println("Author: "+Book1.getAuthor());
        System.out.println("Genre: "+Book1.getGenre());
    }
}

