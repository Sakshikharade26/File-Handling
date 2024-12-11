//Read file using File Handling
import java.io.FileInputStream;
public class Read {

    public static void main(String[] args) {
        try{

            FileInputStream f = new FileInputStream("Demo.txt");

            int i = 0;
            while((i = f.read()) !=-1){
                System.out.print((char)i);

            }
            System.out.println();
        }catch(Exception e){

         }
    }
}