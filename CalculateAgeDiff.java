package javaapplication4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * This class creates a method to calculate Age difference between two persons
 * @author Manisha Sharma
 */
public class CalculateAgeDiff {
                

    
                public void calcdiff(String dateAsString,String dateAsString1){
                    try {
                        
                        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = (Date)formatter.parse(dateAsString);
                        Date date1 = (Date)formatter.parse(dateAsString1);
                        SimpleDateFormat newFormat = new SimpleDateFormat("MM-dd-yyyy");
                        String finalString = newFormat.format(date);
                        String finalString1 = newFormat.format(date1);
                        DateTime dt1 = new DateTime(date);
                        DateTime dt2 = new DateTime(date1);
                        System.out.print("Jeff Briton is "+ Days.daysBetween(dt1, dt2).getDays() + " days "+"older than Tom Soyer");
                    } 
                    catch (ParseException ex) {
                        Logger.getLogger(CalculateAgeDiff.class.getName()).log(Level.SEVERE, null, ex);
                    }
}
		
}
