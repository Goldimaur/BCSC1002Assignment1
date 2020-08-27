/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String bookISBNNumber;

    /**
     * This method return name of book .
     *
     * @return The name of the books
     */
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * This method returns book name , author name , book ISBN number .
     *
     * @param bookName       This return name of the book .
     * @param authorName     This return author name of the book .
     * @param bookISBNNumber This return ISBN number of the book .
     */
    public Book(String bookName, String authorName, String bookISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookISBNNumber = bookISBNNumber;
    }

    /**
     * This method return author name of book .
     *
     * @return The author name of the books
     */

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    /**
     * This method return ISBN number of book .
     *
     * @return The ISBN number of the books
     */

    public String getBookISBNNumber() {
        return bookISBNNumber;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.bookISBNNumber = bookISBNNumber;
    }
}
