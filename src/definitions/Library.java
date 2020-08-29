/*  Created by IntelliJ IDEA.
 *  User: Goldi Maurya .
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[1000];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book("Books" + (i + 1));
        }
    }

    public Library(Book[] books) {
        this.books = books;
    }

    /**
     * This method return current book that are currently avilable book[] .
     *
     * @return This method return current book that are currently avilable book[] .
     */

    public Book[] getBooks() {
        return books.clone();
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void returnedBook(String bookName) {
        System.out.println(bookName + " has been returned seccessfully . ");
    }

    public String toString() {
        return String.format("List of Books : %s ", (Object) getBooks());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooks(), library.getBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooks());
    }

    public void issuedBook(String bookName) {
        System.out.println(bookName + "book been should to you");
    }

    public void listOfBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
