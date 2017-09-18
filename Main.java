/**
* This program implements an application that
* reads a text file, manipulate data and answers following questions.
* 
* 1. How many people in the list are male?
* 2. In years what is the average age of the people in the list?
* 3. How many days older is Jeff Briton than Tom Soyer?
* 
* @author  Manisha Sharma
*/  
package javaapplication4;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException, ParseException {
                
            // Create String ArrayLists
                ArrayList<String> listOfLines = new ArrayList<String>();
                ArrayList<String> names = new ArrayList<>();
                ArrayList<String> sex = new ArrayList<String>();
                ArrayList<String> age = new ArrayList<>();
                ArrayList<String> dob = new ArrayList<>();
                
            // Read text file
		File file = new File("manipulate-data.txt");
		System.out.println(file.getName() + " file exists = " + file.exists());
                BufferedReader br = new BufferedReader(new FileReader(file));                             
                String line = br.readLine();
		
                while(line !=null)
                {
                    String[] items = line.split(",");
                    for ( String item : items){
                        listOfLines.add(item);
                    }                                        
                    line = br.readLine();
                }
                
                int listSize = listOfLines.size();
                
		br.close();
            // Populate different ArrayLists
                for (int i = 0; i<=listSize-5;i=i+4){
                    names.add(listOfLines.get(i+4));
                    sex.add(listOfLines.get(i+5));
                    age.add(listOfLines.get(i+6));
                    dob.add(listOfLines.get(i+7));
                
                }
            // Converting String ArrayLists to String Arrays    
		String arraySex[] = new String[sex.size()];              
		for(int j =0;j<sex.size();j++){
		  arraySex[j] = sex.get(j);
		}
                                
		String arrayAge[] = new String[age.size()];              
		for(int j =0;j<age.size();j++){
		  arrayAge[j] = age.get(j);
		}
                String arrayNames[] = new String[names.size()];              
		for(int j =0;j<names.size();j++){
		  arrayNames[j] = names.get(j);
		}
                String arrayDob[] = new String[dob.size()];              
		for(int j =0;j<dob.size();j++){
		  arrayDob[j] = dob.get(j);
		}
            
            // Converting String Array to int Array
                               
                int[] myAge = new int[arrayAge.length];                             
                
                for (int i= 0; i< myAge.length; i++){
                
                    myAge[i] = Integer.parseInt(arrayAge[i].trim());
                }
                                            
             // Mapping arrayNames & arrayDob Arrays               
                Map<String,String> map = new LinkedHashMap<String,String>();

                for (int i=0; i<arrayNames.length; i++) {
                    map.put(arrayNames[i], arrayDob[i]); 
                }
            //  Creating objects and calling methods from respective classes to answer application's required questions
            
                /* Calculate Male Count*/
                CalculateMaleCount calMaleCountObj = new CalculateMaleCount();
                calMaleCountObj.calculatemalecount(arraySex);
                /* Calculate Average Age of People in a list */                
                CalculateAverage calcAvgObj = new CalculateAverage();
                calcAvgObj.calculateAvg(myAge);
                /* Calculate the Difference in Age of two persons */
                CalculateAgeDiff calcDiffObj = new CalculateAgeDiff();
                calcDiffObj.calcdiff(map.get(arrayNames[0]), map.get(arrayNames[5]));
                
                
	}

	
}