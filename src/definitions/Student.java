/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent=" + Arrays.toString(nameOfStudent) +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", books=" + Arrays.toString(books) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Arrays.equals(getNameOfStudent(), student.getNameOfStudent()) &&
                Arrays.equals(getBooks(), student.getBooks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNameOfStudent());
        result = 31 * result + Arrays.hashCode(getBooks());
        return result;
    }
}
