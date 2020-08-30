/*  Created by IntelliJ IDEA.
 *  User: Goldi Maurya .
 *  Date: 27/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */


package execution;

import definitions.Library;

import java.util.Scanner;


public class FrontDesk {
    private static final int ADD_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int MY_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        Library mylibrary = new Library();
        do {
            System.out.println("-=-=--=-=-Welcome To The Front Desk-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me: ");
            System.out.println("2. Return a previously issued book for me: ");
            System.out.println("3. Show me all my issued books: ");
            System.out.println("4. Exit.");
            System.out.println("Enter your choice (1..4): ");
            userInput = scanner.nextInt();

            switch (userInput) {
                case ADD_NEW_BOOK:
                    System.out.println("Enter the name of the book you want to read: ");
                    scanner.nextLine();
                    String bookName = scanner.nextLine();
                    mylibrary.issuedBook(bookName);
                    break;

                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    bookName = scanner.nextLine();
                    mylibrary.returnedBook(bookName);
                    break;

                case MY_ISSUED_BOOKS:
                    mylibrary.listOfBooksIssued();
                    break;
                default:
            }
        }
        while (userInput != EXIT);
        {
            scanner.close();
        }
    }
}
