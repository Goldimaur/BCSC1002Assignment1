/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {

    private String[] nameOfStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] books;

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfStudent = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.books = new Book[numberOfBooksIssued];
    }

    /**
     * this method return the name of the student (first name, middle name, last name- all String).
     *
     * @return the name of the student (first name, middle name, last name- all String).
     */

    public String[] getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String[] nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    /**
     * This method the university roll number of the student (long).
     *
     * @return the university roll number of the student (long).
     */

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    /**
     * This method return the number of books issued by the student .
     *
     * @return the number of books issued by the student
     */

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
