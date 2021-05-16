package za.ac.cput.raeesmanuel.Map;

import java.util.*;
/**
 * Ra'ees Manuel
 * 219074089
 * Map
 */


public class JournalMService {
    private Map<Integer, Journal> map;

    public JournalMService(){

        map= new HashMap<>();
    }

    public JournalMService(Map<Integer, Journal> map){
        this.map = map;

    }

    public void add(int id, Journal product){
        map.put(id,product);

    }

    public Journal find(int id){
        return map.get(id);
    }

    public void remove(int id){
        map.remove(id);
    }


}
