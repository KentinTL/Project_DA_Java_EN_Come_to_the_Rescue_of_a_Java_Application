package com.hemebiotech.analytics;

import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Interface ISymptomCounter.
 */
public interface ISymptomCounter {
	
	/**
	 * If data available, return in Map ordered.
	 *
	 * @return the map
	 */

	Map<String, Integer> countSymptoms();
}
