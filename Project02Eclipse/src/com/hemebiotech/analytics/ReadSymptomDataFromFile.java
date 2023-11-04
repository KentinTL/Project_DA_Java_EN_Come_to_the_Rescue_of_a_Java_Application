package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it,
	 *                 one per line
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	@Override
	public List<String> GetSymptoms() {
		ArrayList<String> result = new ArrayList<String>();
		BufferedReader reader = null;
		if (filepath != null) {
			try {
				System.out.println("Attempt to read : " + filepath);
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
			} catch (FileNotFoundException e) {
				System.out.println(filepath + " does not EXIST :(");
			} catch (IOException e) {
				System.out.println("Exception Error");
			} finally {
				try {
					if (reader != null) {
						reader.close();
						System.out.println(filepath + " correctly readed and closed");
						System.out.println(result);
					} else {
						System.out.println("reader is null");
					}
				} catch (IOException e) {
					System.out.println("The document can't be closed :(");
				}
			}
		}
		return result;
	}

}
