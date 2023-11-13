package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
	private String filePath;

	/**
	 * Constructor
	 * 
	 * @param file
	 */
	public WriteSymptomDataToFile(String file) {
		this.filePath = file;
	}

	/**
	 * WriteSymptoms is a writer from a Map to a text document
	 * 
	 * @param countedList
	 * 
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> countedList) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(filePath);
			for (Map.Entry<String, Integer> entry : countedList.entrySet()) {
				String line = entry.getKey() + " = " + entry.getValue() + "\n";
				writer.write(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				System.out.println("Writer correctly closed");
			} catch (IOException e) {
				System.out.println("Can not close the writer");
			}
		}
	}
}
