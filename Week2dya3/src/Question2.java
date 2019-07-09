import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question2 {
    public void fileSubDirectory(String dir) throws IOException {
        File f = new File(dir);

        if( f.isFile() ){
            //System.out.println(f);
            File afile =new File(dir);

            String tmp  = "StoreFile/" + afile.getName();

            String[] splFile = tmp.split(".");
            System.out.println(splFile.length + " " + splFile);
            for(String s : splFile){
                System.out.println(s);
            }

            int cnt = 1;

            /*while( new File( tmp ).exists() ){
                    tmp = splFile[0] + "-" + cnt + "." + splFile[1];
                    cnt = cnt + 1;
            }*/
            if(afile.renameTo(new File(tmp))){
                System.out.println("File is moved successful!");
            }else{
                System.out.println("File is failed to move!");
            }

        }
        else {
            File[] files = f.listFiles();
            for( File f1 : files ){
                fileSubDirectory(f1.toString());
            }
        }
    }
}
