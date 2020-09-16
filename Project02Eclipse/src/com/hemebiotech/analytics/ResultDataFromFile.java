package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ResultDataFromFile {

	static MapSymptomDataFromFile resultout = new MapSymptomDataFromFile();
	static TreeMap<String, Integer> printResult = MapSymptomDataFromFile.mapDataFromFile();

	public static void printResultsOut() throws IOException {

		FileWriter fw = new FileWriter("results.out");

		for (Entry<String, Integer> entry : printResult.entrySet()) {
			fw.write(entry.getKey() + " = " + entry.getValue() + "\n" + "\n");
		}
		fw.close();
	}

}
