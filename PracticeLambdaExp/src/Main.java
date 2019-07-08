import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator c = new Calculator();
        c.show();
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);

        List<String> list = Arrays.asList(args);
        Collections.sort(list);
        System.out.println(list);

    }
}
