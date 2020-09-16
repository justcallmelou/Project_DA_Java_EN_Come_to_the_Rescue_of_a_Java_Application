package com.hemebiotech.analytics;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class MapSymptomDataFromFile {

	/**
	 * @
	 * 
	 */
	private static ReadSymptomDataFromFile dataFromFile = new ReadSymptomDataFromFile("symptoms.txt");
	private static List<String> result = dataFromFile.GetSymptoms();
	static TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();

	public static TreeMap<String, Integer> mapDataFromFile() {
		for (int i = 0; i < result.size(); i++) {
			if (!tmap.containsKey(result.get(i))) {
				tmap.put(result.get(i), Collections.frequency(result, result.get(i)));
			}
		}
		tmap.forEach((symptom, count) -> System.out.println(symptom + " = " + count));
		return tmap;
	}

}
