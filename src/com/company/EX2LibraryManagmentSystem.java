package com.company;

import java.util.ArrayList;

class Book{
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class MyLibrary {
    public ArrayList<Book> books;

    public MyLibrary(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        System.out.println("The book has ben added to the library");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to){
        System.out.println("The book has ben issued from the library to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b){
        System.out.println(" The book has been returned");
        this.books.add(b);
    }

}
public class EX2LibraryManagmentSystem {

    public static void main(String[] args) {

        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("algorithems1","CLRS1");
        bk.add(b1);

        Book b2 = new Book("algorithems2","CLRS2");
        bk.add(b2);

        Book b3 = new Book("algorithems3","CLRS3");
        bk.add(b3);

        Book b4 = new Book("algorithems4","CLRS4");
        bk.add(b3);

        MyLibrary l = new MyLibrary(bk);

        l.addBook(new Book("Alogo4","myAuthor"));
        System.out.println(l.books);
        l.issueBook(b2,"sanket");
        System.out.println(l.books);
    }
}
