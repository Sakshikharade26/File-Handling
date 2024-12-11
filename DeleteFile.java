//delete file using file handling
import java.io.*;
public class DeleteFile {

    public static void main(String[] args) {
        
        File obj = new File("Demo.txt");
        obj.delete();
    }
    
}
    