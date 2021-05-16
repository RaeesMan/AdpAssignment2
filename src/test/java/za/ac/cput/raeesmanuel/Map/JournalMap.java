/**
 * Ra'ees Manuel
 * 219074089
 * Testing Map(Add,Find and Remove)
 */

package za.ac.cput.raeesmanuel.Map;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JournalMap extends TestCase {

    @Test
    public void testAdd() {
        Map<Integer, Journal> map = new HashMap<>();
        JournalMService service = new JournalMService(map);
        Journal journal = new Journal();

        journal.setName("Top 10 fastest cars");
        journal.setAuthor("Ra'ees Manuel");
        service.add(1, journal);
        assertTrue(map.containsKey(1));
        assertTrue(map.containsValue(journal));
    }

    @Test
    public void testFind() {
        Map<Integer, Journal> map = new HashMap<>();
        JournalMService service = new JournalMService(map);
        Journal product = new Journal();
        product.setName("Top 10 fastest cars");
        product.setAuthor("Ra'ees Manuel");
        service.add(1,product);

        Journal foundProduct = service.find(1);
        assertEquals(foundProduct,product);
        System.out.println(product.getName());
    }

    @Test
    public void testRemove() {
        Map<Integer, Journal> map = new HashMap<>();
        JournalMService service = new JournalMService(map);
        Journal product = new Journal();
        product.setName("Top 10 fastest cars");
        product.setAuthor("Ra'ees Manuel");
        service.add(1,product);

        service.remove(1);
        assertFalse(map.containsKey(1));
    }
}