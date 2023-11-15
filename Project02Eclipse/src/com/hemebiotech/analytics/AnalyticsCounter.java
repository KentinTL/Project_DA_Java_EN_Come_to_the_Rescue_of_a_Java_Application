package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * The Class AnalyticsCounter.
 */
public class AnalyticsCounter {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws Exception the exception
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
