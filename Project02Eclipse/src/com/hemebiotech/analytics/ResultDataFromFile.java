package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * This class will write a new file called "results.out" The important part is,
 * the return value from the operation, which is a file with symptoms sorted by
 * alphabetical order, that may contain no duplications
 */

final public class ResultDataFromFile {

	static MapSymptomDataFromFile resultout = new MapSymptomDataFromFile();
	/* @see mapDataFromFile() */
	private static TreeMap<String, Integer> printResult = resultout.mapDataFromFile();

	/*
	 * @throws IOException If writing operations file return a failure
	 */
	public static void printResultsOut() throws IOException {
		try {
			FileWriter fw = new FileWriter("results.out");

			for (Entry<String, Integer> entry : printResult.entrySet()) {
				fw.write(entry.getKey() + " = " + entry.getValue() + "\n" + "\n");
			}
			fw.close();
			System.out.println("Exportation terminée");

		} catch (IOException e) {
			System.out.println("Le fichier n'a pas été généré correctement");

		}

	}

}
