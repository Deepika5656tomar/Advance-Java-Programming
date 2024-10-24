import java.util.*;
//Class Book
class Book{
    //Variables
    private int bookId;
    private String bookName;
    private String authorName;
    public Book(int bookId, String bookName, String authorName){
        super();
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }
    @override
    //overridden method 
    public String toString(){
        return "Book [bookId=" + bookId + ", bookName= " + bookName + ", authorName= " + authorName +" ]";
    }
}

public class CustomArrayList {
    public static void main(String[] args) {
        ArrayList<Book> books= new ArrayList<>();//New Array List
        books.add(new Book(101,"let us c","Yashavant P Kanetkar"));//Add Values
        books.add(new Book(102,"head first java ","Kathy Sierra"));//Add Values
        System.out.println("--All Books--");
        //Print values
        for(Book b:books){
            System.out.println(b);
        }

    }
}
