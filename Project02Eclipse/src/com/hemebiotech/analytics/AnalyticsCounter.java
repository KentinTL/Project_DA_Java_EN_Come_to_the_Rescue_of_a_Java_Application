package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile myReader = new ReadSymptomDataFromFile("./Project02Eclipse/symptoms.txt");
		List<String> readedList = myReader.getSymptoms();

		CountSymptomDataFromFile listerCounter = new CountSymptomDataFromFile(readedList);
		Map<String, Integer> listedCountedList = listerCounter.countSymptoms();

		WriteSymptomDataToFile writeList = new WriteSymptomDataToFile("./Project02Eclipse/result.out");
		writeList.writeSymptoms(listedCountedList);
	}
}
