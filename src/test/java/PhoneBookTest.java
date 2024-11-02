import org.example.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void testAddNewContact() {
        int result = phoneBook.add("Александр", "+7 (990) 123-45-67");
        assertEquals(1, result);

        result = phoneBook.add("Алина", "+7 (995) 111-45-77");
        assertEquals(2, result);
    }

    @Test
    public void testAddDuplicateContact() {
        phoneBook.add("Александр", "+7 (990) 123-45-67");
        int result = phoneBook.add("Александр", "+7 (990) 123-45-67");
        assertEquals(1, result);
    }

    @Test
    public void testFindByNumber_existingNumber() {
        phoneBook.add("Александр", "+7 (990) 123-45-67");
        List<String> result = phoneBook.findByNumber("+7 (990) 123-45-67");
        assertEquals(1, result.size());
        assertEquals("Александр", result.get(0));
    }

    @Test
    public void testFindByNumber_nonExistingNumber() {
        List<String> result = phoneBook.findByNumber("+7 (990) 123-45-67");
        assertEquals(0, result.size());
    }
}
