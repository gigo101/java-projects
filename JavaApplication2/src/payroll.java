
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
public class payroll {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("/home/ppp/dtr.in"));
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        String line;
        String[] toks;
        float ratehr= Float.parseFloat(reader.readLine());
        float rateday;
        String idnum,empname,time_in,time_out;
             
        System.out.println("Rate: " + ratehr);
        
        while((line=reader.readLine())!=null){
            toks=line.split("/");
            idnum=toks[0];
            empname=toks[1];
            time_in=toks[2];
            time_out=toks[3];
            
            String[] toks2 = time_in.split(":");
            String[] toks3=time_out.split(":");
            cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(toks2[0]));
            cal1.set(Calendar.MINUTE, Integer.parseInt(toks2[1]));
            long timeIn=cal1.getTimeInMillis();
            
            cal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(toks3[0]));
            cal2.set(Calendar.MINUTE, Integer.parseInt(toks3[1]));
            long timeOut=cal2.getTimeInMillis();
            
            long mill = timeOut - timeIn;
            long hour = mill / (1000 * 3600);
            long min = mill % (1000 * 3600) / (1000 * 60);

            
            System.out.println("Employee id: " + idnum);
            System.out.println("Employee Name: " + empname);
            System.out.println("Time In: " + time_in);
            System.out.println("Time Out: " + time_out);
            System.out.println("Time Hours: " + hour + ":" + min);
            
            rateday=ratehr*hour;
            System.out.println("Your rate for the day is: " + rateday);
            System.out.println("");
    }
   
    }
}
