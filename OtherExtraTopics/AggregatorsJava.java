import java.util.*;
class Book
{
    String name;
    int pages;
    Book(String name, int pages)
    {
        this.name = name;
        this.pages = pages;
    }
    void displayInfo()
    {
        System.out.println("Book :- "+name + "Pages are :- " + pages);
    }
}
class Library
{
    String name;
    int year;
    Book[] books;
    Library(String name, int year, Book[] books)
    {
        this.name = name;
        this.year = year;
        this.books = books;
    }
    void displayInfo()
    {
        System.out.println("Library :- "+name + "year of estab. :- "+year);
    }
    void showBooks()
    {
        for(Book book : books)
        {
            book.displayInfo();
        }
    }
}

public class AggregatorsJava {
    public static void main(String[] args) 
    {
    Book b1 = new Book("abc",123);
    Book b2 = new Book("rw",12);
    Book b3 = new Book("absfnosec",1243);
    Book b4 = new Book("rfewer",152);
    Book b5 = new Book("aefiuwbc",1223);
    Book b6 = new Book("rwwefv",14232);  
    Book[] books1 = {b1,b2,b3};
    Book[] books2 = {b4,b5,b6};
    b1.displayInfo();
    Library l1 = new Library("NYC lib", 1991, books1);
    Library l2 = new Library("Mumbai", 1931, books2);
    l1.showBooks();
    l2.showBooks();
    }
}
