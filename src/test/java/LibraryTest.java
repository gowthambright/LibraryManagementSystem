import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", "12345", "Genre1", 2023, "Department1", true);
        Book book2 = new Book("Title2", "Author2", "67890", "Genre2", 2024, "Department2", false);

        library.addBook(book1);
        library.addBook(book2);

        assertEquals(2, library.listAllBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", "12345", "Genre1", 2023, "Department1", true);
        Book book2 = new Book("Title2", "Author2", "67890", "Genre2", 2024, "Department2", false);

        library.addBook(book1);
        library.addBook(book2);
        library.removeBook("12345");

        assertEquals(1, library.listAllBooks().size());
    }

    @Test
    public void testFindBookByTitle() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", "12345", "Genre1", 2023, "Department1", true);
        Book book2 = new Book("Title1", "Author2", "67890", "Genre2", 2024, "Department2", false);

        library.addBook(book1);
        library.addBook(book2);

        List<Book> books = library.findBookByTitle("Title1");
        assertEquals(2, books.size());
    }

    @Test
    public void testFindBookByAuthor() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", "12345", "Genre1", 2023, "Department1", true);
        Book book2 = new Book("Title2", "Author1", "67890", "Genre2", 2024, "Department2", false);

        library.addBook(book1);
        library.addBook(book2);

        List<Book> books = library.findBookByAuthor("Author1");
        assertEquals(2, books.size());
    }

    @Test
    public void testListAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("Title1", "Author1", "12345", "Genre1", 2023, "Department1", true);
        Book book2 = new Book("Title2", "Author2", "67890", "Genre2", 2024, "Department2", false);

        library.addBook(book1);
        library.addBook(book2);

        List<Book> books = library.listAvailableBooks();
        assertEquals(1, books.size());
    }
}
