package za.ac.cput.raeesmanuel.List;

/**
 * Ra'ees Manuel
 * 219074089
 * Testing List(Add,Find and Remove)
 */

import junit.framework.TestCase;
import org.junit.Test;
import za.ac.cput.raeesmanuel.Collection.Journal;
import za.ac.cput.raeesmanuel.Collection.JournalCollection;

import java.util.ArrayList;

public class JournalListTest extends TestCase {

    @Test
    public void testAdd() {
        ArrayList<Journal> list = new ArrayList<>();
        JournalCollection service = new JournalCollection(list);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(journal);
        assertTrue(list.contains(journal));
    }

    @Test
    public void testFind() {
        ArrayList<Journal> list = new ArrayList<>();
        JournalCollection service = new JournalCollection(list);
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
        ArrayList<Journal> list = new ArrayList<>();
        JournalCollection service = new JournalCollection(list);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(journal);

        service.remove(journal);
        assertFalse(list.contains(journal));
    }
}