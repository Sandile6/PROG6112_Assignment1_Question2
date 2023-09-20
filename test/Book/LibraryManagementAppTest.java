/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sandi
 */


public class LibraryManagementAppTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library(5);
        library.addBook(0, "Book1", "Author1");
        library.addBook(1, "Book2", "Author2");
    }

    @Test
    public void testCheckOutBook() {
        library.checkOutBook(0);
        assertTrue(library.getBooks()[0].isAvailable());
    }

    @Test
    public void testReturnBook() {
        library.checkOutBook(0);
        library.returnBook(0);
        assertTrue(library.getBooks()[0].isAvailable());
    }

    @Test
    public void testListBooks() {
        String expectedOutput = "Library Books:\n" +
                "Title: Book1 | Author: Author1 | Available: Yes\n" +
                "Title: Book2 | Author: Author2 | Available: Yes\n";
        assertEquals(expectedOutput, library.listBooks());
    }
}
