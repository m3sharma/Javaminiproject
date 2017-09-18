package javaapplication4;

/**
 * This class creates a method to calculate number of "Male" in a list
 * @author Manisha Sharma
 */
public class CalculateMaleCount {
    
    public void calculatemalecount(String[] array){
    
                int maleCount = 0;
                
                for (int i = 0; i < array.length; i++) {
                    if(array[i].contains("male")){
                        maleCount++;
                    }
                    
                }
                System.out.println(maleCount+ " people in the list are male");    
    
    
    }
    
}
