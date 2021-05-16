/**
 * Ra'ees Manuel
 * 219074089
 * List
 */


package za.ac.cput.raeesmanuel.List;

import java.util.ArrayList;
import java.util.List;

public class JournalList {
    private List<Journal>list;

    public JournalList(){
    list = new ArrayList<Journal>(){};
    }

    public JournalList(List<Journal>list){
        this.list = list;
    }

    public void add(Journal journal){
        list.add(journal);
    }

    public Journal find(String bookName){
        for(Journal journal : list){
            if (journal.getName().equals(bookName)){
                return journal;
            }
        }
        return null;
    }

    public void remove(Journal journal){
        list.remove(journal);
    }

}



