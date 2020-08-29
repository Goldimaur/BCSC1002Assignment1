/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
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

    /**
     * This method return current book that are currently avilable book[] .
     *
     * @return This method return current book that are currently avilable book[] .
     */

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addReturnedBook(String bookName) {
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
}
