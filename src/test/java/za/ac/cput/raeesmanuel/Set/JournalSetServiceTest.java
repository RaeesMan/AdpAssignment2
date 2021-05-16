/**
 * Ra'ees Manuel
 * 219074089
 * Testing Set(Add,Find and Remove)
 */

package za.ac.cput.raeesmanuel.Set;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class JournalSetServiceTest extends TestCase {

    @Test
    public void testAddToSet() {


        Set<Journal> set = new HashSet<>();
        JournalSService service = new JournalSService(set);
        Journal journal = new Journal();
        journal.setName("Top 10 fastest cars");
        service.add(journal);

        assertTrue(set.contains(journal));


    }

    @Test
    public void testFindInSet() {


        Set<Journal> set = new HashSet<>();
        JournalSService service = new JournalSService(set);
        Journal journal = new Journal();
        journal.setName("Top 10 fastest cars");
        service.add(journal);


        Journal foundJournal = service.find("Top 10 fastest cars");
        assertEquals(foundJournal, journal);
        System.out.println(journal.getName());

    }

    @Test
    public void testRemoveFromSet() {

        Set<Journal> set = new HashSet<>();
        JournalSService service = new JournalSService(set);
        Journal journal = new Journal();
        journal.setName("Top 10 fastest cars");
        service.add(journal);

        service.remove(journal);
        assertFalse(set.contains(journal));

    }
}