/*  Created by IntelliJ IDEA.
 *  User: Goldi Maurya .
 *  Date: 27/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] allBooksCurrentlyAvailable;

    public Library() {
        this.allBooksCurrentlyAvailable = new Book[1000];
        for (int i = 0; i < allBooksCurrentlyAvailable.length; i++) {
            allBooksCurrentlyAvailable[i] = new Book("Books" + (i + 1));
        }
    }

    public Library(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }

    /**
     * This method return current book that are currently avilable book[] .
     *
     * @return This method return current book that are currently avilable book[] .
     */

    public Book[] getAllBooksCurrentlyAvailable() {
        return allBooksCurrentlyAvailable.clone();
    }

    public void setAllBooksCurrentlyAvailable(Book[] allBooksCurrentlyAvailable) {
        this.allBooksCurrentlyAvailable = allBooksCurrentlyAvailable;
    }

    public void returnedBook(String bookName) {
        System.out.println(bookName + " has been returned seccessfully . ");
    }

    public String toString() {
        return String.format("List of Books : %s ", (Object) getAllBooksCurrentlyAvailable());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAllBooksCurrentlyAvailable(), library.getAllBooksCurrentlyAvailable());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAllBooksCurrentlyAvailable());
    }

    public void issuedBook(String bookName) {
        System.out.println(bookName + "book been should to you");
    }

    public void listOfBooks() {
        for (Book book : allBooksCurrentlyAvailable) {
            System.out.println(book);
        }
    }
}
