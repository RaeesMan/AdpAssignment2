/**
 * Ra'ees Manuel
 * 219074089
 * Set
 */

package za.ac.cput.raeesmanuel.Set;

import java.util.HashSet;
import java.util.Set;

public class JournalSService {
    private Set<Journal> set;

    public JournalSService(){

        set= new HashSet<Journal>(){};
    }

    public JournalSService(Set<Journal> set){

        this.set = set;

    }

    public void add(Journal journal){

        set.add(journal);

    }

    public Journal find(String name){

        for(Journal journal : set){
            if (journal.getName().equals(name)){
                return journal;
            }
        }
        return null;
    }

    public void remove(Journal journal){
        set.remove(journal);
    }

}
