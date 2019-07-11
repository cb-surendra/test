import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class JsonParser {
    @SuppressWarnings("unchecked")
    public void jsonFileReading() {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader("src/students-teachers.json")) {

            //Reading from the json file
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            JSONObject teachers = (JSONObject)jsonObject.get("Teacher");
            JSONObject students = (JSONObject)jsonObject.get("Student");


            JSONObject objStudent = new JSONObject();
            objStudent.put("Date Of Joining", students.get("Date Of Joining"));
            objStudent.put("ID",students.get("ID"));
            objStudent.put("Marks",students.get("Marks"));


            JSONArray msg = (JSONArray) students.get("Marks");
            //System.out.println( "Student Id : " + students.get("ID") + " & Having Joining Date : " + students.get("Date Of Joining"));
            //System.out.println("Marks scored by the Student : ");
            Iterator<JSONObject> iterator1 = msg.iterator();

//            JSONObject marksAndSubject = new JSONObject();

            ArrayList< JSONObject > arrayListMarksAndSubject = new ArrayList<>();
            while (iterator1.hasNext()) {
                JSONObject temp = (JSONObject) iterator1.next();
                arrayListMarksAndSubject.add( temp );
                //System.out.println("Subject : " + temp.get("Subject") + " & Mark : " + temp.get("Mark"));
            }

            objStudent.put("Marks", arrayListMarksAndSubject);
            //System.out.println();

            //System.out.println("Classes Taught by the Teacher");

            JSONArray cls = (JSONArray) teachers.get("Classes Taking Care Of");

            Iterator<JSONObject> iterator2 = cls.iterator();
            while (iterator2.hasNext()) {
                System.out.print(iterator2.next() + " ");
            }

            JSONObject objTeacher = new JSONObject();
            objTeacher.put("Classes Taking Care Of", teachers.get("Classes Taking Care Of"));
            objTeacher.put("Date Of Joining", teachers.get("Date Of Joining"));
            objTeacher.put("ID", teachers.get("ID"));
            objTeacher.put("Salary", teachers.get("Salary"));


            //writing into the json file
            Writer write = new FileWriter("src/newfile.json");
            JSONObject parentObj = new JSONObject();

            parentObj.put("Student", objStudent);
            parentObj.put("Teachers", objTeacher);

            System.out.println( objStudent.toString() );
            System.out.println( objTeacher.toString() );
            System.out.println( parentObj.toString() );

            write.write(parentObj.toJSONString());
            //write.write(parentObj.toString());
            write.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
