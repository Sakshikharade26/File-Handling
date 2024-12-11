import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

 public class write {

    public static void main(String[] args) {
        try{
            String str ="Welcome to first file handling program in java...!";
            BufferedWriter out = new BufferedWriter(new FileWriter("Demo.txt",true));
           // String str1 = "Hello java...";
            byte Arr[] = str.getBytes();

            FileOutputStream fobj = new FileOutputStream("Demo.txt");
            fobj.write(Arr);

        }catch(Exception eobj){

        }
    }

    
}
