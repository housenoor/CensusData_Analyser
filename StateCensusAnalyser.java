package com.indiancensusdataanalyser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StateCensusAnalyser {

	public void analyseCensusData() throws FileNotFoundException {
		String path = "C:\\Users\\admin\\eclipse-workspace\\JavaPractice\\src\\main\\java\\com\\indiancensusdataanalyser\\IndianStateCensusData.CSV";
		String line = "";
		String splits = ",";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		try {
			while ((line = bufferedReader.readLine()) != null) {
				String[] data = line.split(splits);
				System.out.println("State: " + data[0] + ", Population: " + data[1] + ", Area: " + data[2]
						+ ", Density: " + data[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(" Welcome to Indian State Census Analyser");

	}
}