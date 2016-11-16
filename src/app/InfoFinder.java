package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class InfoFinder {

	private static Scanner input = new Scanner(System.in);

	/*
	 * Evo vam primjer kako procitati cijeli fajl liniju po liniju. Isto cete
	 * koristiti u svojim metodama, samo cete taj fileName dobiti kao parametar
	 * metode, a u metodama pisati svoju logiku da pronadjete to sto se trazi
	 * 
	 */
	public static void main(String[] args) {
		String fileName = "Files/the dead past.txt";
		String line;
		
		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metoda pronalazi i ispisuje broj rijeci u fajlu
	 * 
	 * @param fileName
	 *            ime fajla
	 */
	public static void countWords(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj recenica u fajlu
	 * 
	 * @param fileName
	 *            imeFajla
	 */
	public static void countSentences(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj slova u fajlu
	 * 
	 * @param fileName
	 *            imeFajla
	 */
	public static void countLetters(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj karaktera u fajlu
	 * 
	 * @param fileName
	 *            ime fajla
	 */
	public static void countChars(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj pojavljivanja svih slova u fajlu
	 * 
	 * @param fileName
	 *            ime fajla
	 */
	public static void countLettersOccurrences(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj jedinstvenih rijeci u fajlu
	 * 
	 * @param fileName
	 *            imeFajla
	 */
	public static void countUniqueWords(String fileName) {

	}

}
