import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Question2 {
    public void sortBasedOnkey(ArrayList<String> arrayList){

        Map<String, String> map = new TreeMap<String, String>();

        for(String s : arrayList){
            if( s.length() >= 3 ){
                String key = s.substring(0,3);
                map.put(key, s);
            }
        }

        for(Map.Entry<String, String> m : map.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
