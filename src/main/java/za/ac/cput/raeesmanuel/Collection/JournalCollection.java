/**
 * Ra'ees Manuel
 * 219074089
 * Collection
 */

package za.ac.cput.raeesmanuel.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class JournalCollection {
    private Collection <Journal> collection;

    public JournalCollection(){

        collection = new ArrayList();
    }

    public JournalCollection(ArrayList <Journal> collection){
        this.collection = collection;

    }

    public void add(Journal product){
        collection.add(product);

    }

    public Journal find(String title){
        for(Journal journal : collection){
            if (journal.getName().equals(title)){
                return journal;
            }
        }
        return null;
    }

    public void remove(Journal id){
        collection.remove(id);
    }


}
