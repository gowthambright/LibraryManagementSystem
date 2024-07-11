import org.example.Book;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookAttributes() {
        Book book = new Book("Title", "Author", "12345", "Genre", 2023, "Department", true);

        assertEquals("Title", book.getTitle());
        assertEquals("Author", book.getAuthor());
        assertEquals("12345", book.getISBN());
        assertEquals("Genre", book.getGenre());
        assertEquals(2023, book.getPublicationYear());
        assertEquals("Department", book.getDepartment());
        assertTrue(book.isAvailability());
    }

    @Test
    public void testSetters() {
        Book book = new Book("Title", "Author", "12345", "Genre", 2023, "Department", true);

        book.setTitle("New Title");
        book.setAuthor("New Author");
        book.setISBN("67890");
        book.setGenre("New Genre");
        book.setPublicationYear(2024);
        book.setDepartment("New Department");
        book.setAvailability(false);

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
        assertEquals("67890", book.getISBN());
        assertEquals("New Genre", book.getGenre());
        assertEquals(2024, book.getPublicationYear());
        assertEquals("New Department", book.getDepartment());
        assertFalse(book.isAvailability());
    }
}

