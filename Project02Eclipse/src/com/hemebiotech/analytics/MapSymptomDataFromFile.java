package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/**
 * This class will read file "symptoms.txt" and sort symptoms The return value
 * from the operation is a treemap
 */

public class MapSymptomDataFromFile {

	private static ReadSymptomDataFromFile dataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
	/* @see ReadSymptomDataFromFile */
	private static List<String> result = dataFromFile.GetSymptoms();
	private static TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();

	/**
	 * @return Treemap of all of symptoms sorted by keys without duplications
	 * 
	 */
	public TreeMap<String, Integer> mapDataFromFile() {
		for (int i = 0; i < result.size(); i++) {
			if (!tmap.containsKey(result.get(i))) {
				tmap.put(result.get(i), Collections.frequency(result, result.get(i)));
			}
		}
		return tmap;
	}

}
