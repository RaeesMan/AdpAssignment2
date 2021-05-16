package za.ac.cput.raeesmanuel.Collection;

/**
 * Ra'ees Manuel
 * 219074089
 * Testing Collection(Add,Find and Remove)
 */

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;


public class JournalCollectionTest extends TestCase {

    @Test
    public void testAdd() {
        ArrayList<Journal> collection = new ArrayList<>();
        JournalCollection service = new JournalCollection(collection);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(journal);
        assertTrue(collection.contains(journal));
    }

    @Test
    public void testFind() {
        ArrayList<Journal> collection = new ArrayList<>();
        JournalCollection service = new JournalCollection(collection);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(journal);

        Journal foundProduct = service.find("Top 10 fastest cars");
        assertEquals(foundProduct, journal);
        System.out.println(journal.getName());
    }

    @Test
    public void testRemove() {
        ArrayList<Journal> collection = new ArrayList<>();
        JournalCollection service = new JournalCollection(collection);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(journal);

        service.remove(journal);
        assertFalse(collection.contains(journal));
    }
}