/*
1. Library Management System 📚
Problem:
Create a library system where:
#Book class contains:
title, author, ISBN, isAvailable (boolean)
borrowBook() and returnBook() methods.
#Member class contains:
name, memberId, borrowedBooks (List of books)
borrow(Book book), returnBook(Book book) methods.
#Library class manages books and members.

Scenario:
Add books to the library.
Allow members to borrow and return books.
Prevent borrowing if a book is not available.

Test Case:
Library lib = new Library();
Book b1 = new Book("1984", "George Orwell", "12345");
lib.addBook(b1);
Member m1 = new Member("John", 101);
m1.borrow(b1);
m1.returnBook(b1);
 */
package oops.class_object;
import java.util.ArrayList;
import java.util.List;

public class Q4_Library_System {
    public static void main(String[] args) {
        // Create Library
        Library lib = new Library();

        // Create and add books
        Book book1 = new Book("java book", "jhon", "12345");
        lib.addBook(book1);

        // Create a member
        Member member1 = new Member("huzaifa", 101);
        lib.addMember(member1);

        // Member borrows and returns a book
        member1.borrow(book1);
//        member1.returnBook(book1);

        Member member2 = new Member("hzfa", 102);
        lib.addMember(member2);
        member2.borrow(book1);
    }
}

class Book{
    String title;
    String author;
    String ISBN;
    boolean isAvailable;

    Book(String title, String author, String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true; // Default: book is available
    }

    // Borrow the book
    void borrowBook(){
        isAvailable = false;
    }
    // Return the book
    void returnBook(){
        isAvailable = true;
    }
}

//Member / student
class Member{
    String name;
    int memberId;
    List<Book> borrowedBooks;  // List to track borrowed books /Track the Book is taken or not
//  dataType<> varName;

    Member(String name, int memberId){
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();//[ book1-false | book2 | book3 | null | null | ... ] / Add borrowed book in list of borrowBooks
    }

    // Borrow a book from the library
    void borrow(Book book){ //(datatype anyArgsName)
        if (book.isAvailable) {
            borrowedBooks.add(book);
            book.borrowBook(); // Mark book as borrowed
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println(book.title + " is not available.");
        }
    }
    // Return a borrowed book
    void returnBook(Book book){
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.returnBook(); // Mark book as available again
            System.out.println(name + " returned " + book.title);
        } else {
            System.out.println(name + " did not borrow " + book.title);
        }
    }

}

// Manages books and members in the library
class Library {
//    books and members will call by Library()
    List<Book> books;  // List of books name in the library
    List<Member> members;  // List  of registered members

    // Constructor to initialize library system
    Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    // Add a book to the library
    void addBook(Book book) {
        books.add(book);
    }
    // Register a new member
    void addMember(Member member) {
        members.add(member);
    }
}

/*
===========================================================================
| Object    | Books List (Library) | Members List (Library) | isAvailable |
|-----------|----------------------|------------------------|-------------|
| lib       | [book1]               | [member1, member2]     | true        |
| member1   | Borrowed: []          | huzaifa                |             |
| member2   | Borrowed: []          | hzfa                   |             |
===========================================================================
 */

/*
===============================================================================
| Type               | Example                                                |
|--------------------|--------------------------------------------------------|
| Numbers            | List<Integer> (1, 2, 3)                                |
| Strings            | List<String> ("Apple", "Banana")                       |
| Objects            | List<Book> (Book1, Book2)                              |
| Lists (Nested)     | List<List<Integer>>                                    |
| Mixed Data (Object) | List<Object> ("Hello", 10, new Book())                |
| Maps               | List<Map<String, Integer>> (Dictionary-like structure) |
===============================================================================

 */