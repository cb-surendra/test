import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.*;

public class JsonPhoneHandling {
    public void show(){
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("src/phone.json")) {

            //Reading from the json file
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            JSONArray details = (JSONArray)jsonObject.get("UserDetails");
            Iterator<JSONObject> iterator1 = details.iterator();

            List<PhoneDirectory> listPhone = new ArrayList<>();
            while (iterator1.hasNext()) {
                JSONObject temp = (JSONObject) iterator1.next();

                Map<Integer, Tag> m = new HashMap<>();
                m.put( Integer.parseInt( temp.get("PhoneNo").toString()), Tag.valueOf(temp.get("Tag").toString()) );
                PhoneDirectory p = new PhoneDirectory( temp.get("Name").toString(), temp.get("Address").toString(), m);
                listPhone.add( p );
                //System.out.println("Name : " + temp.get("Name") + ", Address : " + temp.get("Address") + ", " + temp.get("PhoneNo") + ", " + temp.get("Tag"));
            }

            for( PhoneDirectory p : listPhone ){
                System.out.println( p.name + " " + p.address + " " + p.phoneNumber);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
