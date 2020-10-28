package com.hemebiotech.analytics;

/**
 * Allows to obtain a results.out file 
 * containing the symptoms sorted in alphabetical order of a given text file symptoms.txt 
 * and the number of times this symptom appears in the file.
 */
public class AnalyticsCounter  {	
		
	public static void main(String[] args) {
		ISymptomReader symptomsFile = new ReadSymptomDataFromFile("symptoms.txt");
		SymptomSort symptomsOccurences = new SymptomSort(symptomsFile.GetSymptoms());
		symptomsOccurences.MakeOutFile();
	}

}
