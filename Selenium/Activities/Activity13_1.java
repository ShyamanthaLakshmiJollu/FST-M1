package demo;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class Activity13_1 {

	public static void main(String[] args) throws Exception {
		
		CSVReader reader = new CSVReader(new FileReader("C:/Users/003BDI744/eclipse-workspace/FST_Selenium_Project/src/main/resources/TestData.csv"));
		 List<String[]> list = reader.readAll();
	        System.out.println("Total number of rows are: " + list.size());
	        Iterator<String[]> itr = list.iterator();
	        while(itr.hasNext()) {
	            String[] str = itr.next();
	 
	            System.out.print("Values are: ");
	            for(int i=0;i<str.length;i++) {
	                System.out.print(" " + str[i]);
	            }
	            System.out.println(" ");
	        }
	        
	        reader.close();
		}

	}


