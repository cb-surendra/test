import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        System.out.println("Hello World!");
        Test2 t1 = new Test2();
        //t1.show();

        Test3 t3 = new Test3();
        //t3.show();

        Question3 q3 = new Question3();
        //q3.func1();

        Question4 q4 = new Question4();
        q4.func1();
    }
}
