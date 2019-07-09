import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class Question1 {
    int numberOftxtFile = 0;
    int numberOfJpgFile = 0;
    int numberOfPdfFile = 0;
    int numberOfExeFile = 0;

    public File[] getTheFileInFolder( String dirName){
        File dir = new File(dirName);

        return dir.listFiles();
    }
    public int fileExtensionWithCountTxt(String dir){
        File f = new File(dir);
        File[] files = f.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".txt")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        return files.length;
    }
    public int fileExtensionWithCountJpg(String dir){
        File f = new File(dir);
        File[] files = f.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".jpg")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        return files.length;
    }
    public int fileExtensionWithCountPng(String dir){
        File f = new File(dir);
        File[] files = f.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".png")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        return files.length;
    }
    public int fileExtensionWithCountPdf(String dir){
        File f = new File(dir);
        File[] files = f.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".pdf")){
                    return true;
                } else {
                    return false;
                }
            }
        });
        return files.length;
    }
    public int fileExtensionWithCountExe(String dir){
        File f = new File(dir);
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.toLowerCase().endsWith(".exe"))
                    return true;
                else
                    return false;
            }
        });
        return files.length;
    }

    public void fileSubDirectory(String dir){
        File f = new File(dir);

        if( f.isFile() ){
            System.out.println(f);

            if( dir.endsWith(".jpg")) {
                numberOftxtFile += 1;
            }
            else if( dir.endsWith(".pdf")){
                numberOfPdfFile += 1;
            }
            else if( dir.endsWith(".jpg")){
                numberOfJpgFile += 1;
            }
            else{
                numberOfExeFile += 1;
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
