import java.io.File;

class CreateFile {

    public static void main(String args[]){
        try{
        File obj = new File("Demo.txt");
       obj. createNewFile();
        System.out.println("File is sucessfully created");
        }catch(Exception e){

        }
    }
    
}
