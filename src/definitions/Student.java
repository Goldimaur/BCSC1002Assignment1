/*  Created by IntelliJ IDEA.
 *  User: Goldi Maurya .
 *  Date: 27/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {

    private String[] nameOfStudentFormatFirstMiddleLast;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfBooksIssued;

    public Student(String nameOfTheStudent, long universityRollNumber, int numberOfBooksIssued) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfTheStudent.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssued = numberOfBooksIssued;
        this.nameOfBooksIssued = new Book[numberOfBooksIssued];
    }

    /**
     * this method return the name of the student (first name, middle name, last name- all String).
     *
     * @return the name of the student (first name, middle name, last name- all String).
     */

    public String[] getNameOfStudentFormatFirstMiddleLast() {
        return nameOfStudentFormatFirstMiddleLast;
    }

    public void setNameOfStudentFormatFirstMiddleLast(String[] nameOfStudentFormatFirstMiddleLast) {
        this.nameOfStudentFormatFirstMiddleLast = nameOfStudentFormatFirstMiddleLast;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
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

    public Book[] getNameOfBooksIssued() {
        return nameOfBooksIssued;
    }

    public void setNameOfBooksIssued(Book[] nameOfBooksIssued) {
        this.nameOfBooksIssued = nameOfBooksIssued;
    }


    @Override
    public String toString() {
        return "Student{" +
                "nameOfStudent=" + Arrays.toString(nameOfStudentFormatFirstMiddleLast) +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", books=" + Arrays.toString(nameOfBooksIssued) +
                '}';
    }


    public void addNewBook(String bookName) {
        System.out.println(bookName + " has been successfully issued.");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Arrays.equals(getNameOfStudentFormatFirstMiddleLast(), student.getNameOfStudentFormatFirstMiddleLast()) &&
                Arrays.equals(getNameOfBooksIssued(), student.getNameOfBooksIssued());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNameOfStudentFormatFirstMiddleLast());
        result = 31 * result + Arrays.hashCode((nameOfBooksIssued));
        return result;
    }
}
