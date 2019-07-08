import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Question1 {
    public void mapofStringAndLength(ArrayList<String> arrayList){
        Map<Integer, String> map = new HashMap<Integer, String>();//creats map having the length as the key and value is the string itself

        //adding the data to the map
        for(String s : arrayList){
            Integer len = s.length();
            map.put(len, s);
        }

        //created the iterator

        Iterator<Map.Entry<Integer,String>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            //entery of map

            Map.Entry<Integer,String> entry = itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //another iterator
        for(Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
