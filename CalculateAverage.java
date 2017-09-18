package javaapplication4;

import java.text.DecimalFormat;

/**
 * This class creates a method to calculate an average age of people in a list
 * @author Manisha Sharma
 */
public class CalculateAverage {
    public void calculateAvg(int[] myAge){
        
                double sum = 0;

                for (int i = 0; i < myAge.length; i++) {
                    
                    sum =sum+myAge[i];
                }

                double average = sum / (myAge.length);

                /*System.out.println("Average value of array elements is : " + average);*/
                
                DecimalFormat df = new DecimalFormat("###.##");
                System.out.println("The average age of the people in the list is : " + df.format(average));

}
}
