import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //String dir = "/Users/cb-surendrapal/IdeaProjects/Week2dya3/";
        String dir = "Test/";

        /*
        Question1 f = new Question1();

        for (File f1 : f.getTheFileInFolder(dir) ){
            boolean isDirectory = f1.isDirectory();
            boolean isFile = f1.isFile();
            if(isDirectory){

            }
            else
            {

            }
            System.out.println(f1);
        }

        System.out.println("Number of file having .txt : " + f.fileExtensionWithCountTxt(dir));

        f.fileSubDirectory(dir);
        System.out.println( "Number of Txt File : " + f.numberOftxtFile);
        System.out.println( "Number of Pdf File : " + f.numberOfPdfFile);
        System.out.println( "Number of Exe File : " + f.numberOfExeFile);
        System.out.println( "Number of Jpg File : " + f.numberOfJpgFile);
        */

        Question2 q2 = new Question2();
        try {
            q2.fileSubDirectory(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
