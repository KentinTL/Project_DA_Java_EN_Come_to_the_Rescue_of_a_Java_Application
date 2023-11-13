package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomCounter {
	/**
	 * If data available, return in Map ordered
	 **/

	Map<String, Integer> countSymptoms();
}
