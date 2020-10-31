package com.hemebiotech.analytics;

/**
 * Allows to obtain a .out file 
 * containing the symptoms sorted in alphabetical order of a given text file symptoms.txt 
 * and the number of times this symptom appears in the file.
 * @author Antoine Lanselle
 */
public class AnalyticsCounter  {	
	
	/**
	 * Read the source file, sort its values, and write the result in an .out file 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ISymptomReader symptomsFile = new ReadSymptomDataFromFile("symptoms.txt");
		SymptomSort symptomsOccurences = new SymptomSort(symptomsFile.getSymptoms());
		symptomsOccurences.makeOutFile("results.out");
	}

}
