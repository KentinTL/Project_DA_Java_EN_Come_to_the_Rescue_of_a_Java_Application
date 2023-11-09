package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {

	public static void main(String args[]) throws Exception {
		// Use ReadSymptomDataFromFile with the path to load the path into my variable
		// myReader
		ISymptomReader myReader = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");
		// Call GetSymptoms() method to read and stock my document txt into readedList
		List<String> readedList = myReader.getSymptoms();

		// Use ISymptomCounter interface to use my method into the next Step with
		// readedList in parameter
		ISymptomCounter listerCounter = new CountSymptomDataFromFile(readedList);
		// Call countSymptoms() method to count and sort the list readedList
		Map<String, Integer> listedCountedList = listerCounter.countSymptoms();

		// Use ISymptomWriter interface to with listedCountedList in parameter to use it
		ISymptomWriter writeList = new WriteSymptomDataToFile("./Project02Eclipse/result.out");
		writeList.writeSymptoms(listedCountedList);
	}
}
