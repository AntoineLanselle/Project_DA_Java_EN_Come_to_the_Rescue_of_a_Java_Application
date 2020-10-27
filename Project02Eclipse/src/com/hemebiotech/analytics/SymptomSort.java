package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * SymptomSort is the class that sort a list of strings.
 */
public class SymptomSort {
	
	//the symptoms (key) related to their number of occurrences (value) 
	private Map<String, Integer> symptomsOccurences;
	
	/**
	 * SymptomSort constructor
	 * 
	 * Compiles the number of occurrences of a string in a list of strings
	 * in a Map(Symptom, numberOfOccurences).
	 * Sorted by key.
	 * 
	 * @param allSymptoms
	 * 			 The list of all symptoms 
	 */
	public SymptomSort(List<String> allSymptoms) {
		this.symptomsOccurences = new TreeMap<String, Integer>();
		for(String symp : allSymptoms) {
			if(this.symptomsOccurences.containsKey(symp)) {
				this.symptomsOccurences.put(symp, this.symptomsOccurences.get(symp) + 1);
			} else {
				this.symptomsOccurences.put(symp, 1);
			}
		}
		
	}
	
	/**
	 * Creates a file : results.out 
	 * containing all the keys and their values of symptomsOccurences.
	 */
	public void MakeOutFile() {
		try {
			FileWriter writer = new FileWriter("results.out");
			for(SortedMap.Entry<String, Integer> entry : this.symptomsOccurences.entrySet()) {
				writer.write(entry.getKey() + " : " + entry.getValue() + "\n");
			}
			writer.close();
		} catch(Exception error) {
			error.printStackTrace();
		}
	}

}
