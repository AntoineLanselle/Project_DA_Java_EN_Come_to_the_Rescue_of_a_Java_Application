package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * AnalyticsCounter is a class that counts 
 * the number of occurrences of : headache, rash and dialated pupils
 * in a string list and writes the result in a results.out file.
 */
public class OldProject {
	
	//Declaration and initialization of symptoms sought
	private static int headacheCount = 0;	
	private static int rashCount = 0;		
	private static int pupilCount = 0;		
	
	public static void main(String args[])  {
		
		try { //we catch errors if the file is not found or if we can't create our result file
			
			BufferedReader reader = new BufferedReader(new FileReader("Project02Eclipse/symptoms.txt"));
			String line = reader.readLine();
			
			//we determine if the symptom of the line is one of the symptoms sought
			while (line != null) {
				if (line.equals("headache")) {
					headacheCount++;
				}
				else if (line.equals("rash")) {
					rashCount++;
				}
				else if (line.equals("dialated pupils")) {
					pupilCount++;
				}

				line = reader.readLine(); //next line
			}
		
			reader.close();
			
			//we write the results in a file
			FileWriter writer = new FileWriter ("results.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();
			
		} catch(Exception error) {
			error.printStackTrace();
		}
		
	}
}