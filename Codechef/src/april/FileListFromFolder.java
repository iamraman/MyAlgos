package april;
 
import java.io.File;
 
public class FileListFromFolder {
     
    public static void main(String a[]){
        File file1 = new File("C:\\Good ones\\01");
        File file2 = new File("C:\\Good ones\\02");
        
        String[] fileList1 = file1.list();
        String[] fileList2 = file2.list();
        int count = 0;
        for(String name:fileList1){
        	count++;
            System.out.println(count+"."+name.replaceFirst("[.][^.]+$", ""));
        }
        
        System.out.println("\n\n------------Portrait Photos------------------\n\n");
        for(String name : fileList2) {
        	count++;
        	System.out.println(count+"."+name.replaceFirst("[.][^.]+$", ""));
        }
        
        
    }
}