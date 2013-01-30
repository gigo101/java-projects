import java.io.FileReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ReadTextFile {
    public static void main(String args[]){
        String a="";
   
        try{
            FileReader f=new FileReader("/home/ppp/Documents/b.txt");
            Scanner s=new Scanner(f);
            
            while(s.hasNext()){
                a=a + s.nextLine();
            }
            
            System.out.println(a);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}