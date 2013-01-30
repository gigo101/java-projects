/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ppp
 */
import java.io.*;
import java.util.Calendar;
class TotalHrs
{
public static void main(String[] args)throws Exception
{
BufferedReader kboard = new BufferedReader(new InputStreamReader(System.in));

System.out.println("24 Hr Format (HH:MM)");

System.out.print("Enter Time In: ");
String[] time_in = kboard.readLine().split(":");


Calendar cal1 = Calendar.getInstance();
cal1.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time_in[0]));
cal1.set(Calendar.MINUTE, Integer.parseInt(time_in[1]));
long timeIn = cal1.getTimeInMillis();

System.out.print("Enter Time Out: ");
String[] time_out = kboard.readLine().split(":");


Calendar cal2 = Calendar.getInstance();
cal2.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time_out[0]));
cal2.set(Calendar.MINUTE, Integer.parseInt(time_out[1]));
long timeOut = cal2.getTimeInMillis();

long mill = timeOut - timeIn;
long hour = mill / (1000 * 3600);
long min = mill % (1000 * 3600) / (1000 * 60);

System.out.println("Total Hours: " + hour + ":" + min);
}
}