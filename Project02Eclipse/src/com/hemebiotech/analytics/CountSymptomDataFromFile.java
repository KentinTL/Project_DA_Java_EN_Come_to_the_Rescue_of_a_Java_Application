package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountSymptomDataFromFile implements ISymptomCounter {
	private List<String> readedList;

	/**
	 * Constructor
	 * 
	 * @param readedList
	 */
	public CountSymptomDataFromFile(List<String> readedList) {
		this.readedList = readedList;
	}

	/**
	 * countSymptoms, method who sort a list of string and count his occurrences and
	 * return a Map of symptoms
	 * 
	 * @return countedSymptoms
	 */
	@Override
	public Map<String, Integer> countSymptoms() {
		List<String> symptoms = new ArrayList<String>(readedList);
		Map<String, Integer> countedSymptoms = new TreeMap<String, Integer>();
		for (int i = 0; i < symptoms.size(); i++) {
			String symptom = symptoms.get(i);
			if (!countedSymptoms.containsKey(symptom)) {
				countedSymptoms.put(symptom, 1);
			} else {
				int counter = countedSymptoms.get(symptom);
				countedSymptoms.replace(symptom, counter += 1);
			}
		}
		System.out.println(countedSymptoms);
		return countedSymptoms;
	}

}
