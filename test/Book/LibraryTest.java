/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sandi
 */
public class LibraryTest {
    
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addBook method, of class Library.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        int index = 0;
        String title = "";
        String author = "";
        Library instance = null;
        instance.addBook(index, title, author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listBooks method, of class Library.
     */
    @Test
    public void testListBooks() {
        System.out.println("listBooks");
        Library instance = null;
        instance.listBooks();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOutBook method, of class Library.
     */
    @Test
    public void testCheckOutBook() {
        System.out.println("checkOutBook");
        int index = 0;
        Library instance = null;
        instance.checkOutBook(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class Library.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        int index = 0;
        Library instance = null;
        instance.returnBook(index);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
