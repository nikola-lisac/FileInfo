package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InfoFinder {

	private static Scanner input = new Scanner(System.in);

	/*
	 * Evo vam primjer kako procitati cijeli fajl liniju po liniju. Isto cete
	 * koristiti u svojim metodama, samo cete taj fileName dobiti kao parametar
	 * metode, a u metodama pisati svoju logiku da pronadjete to sto se trazi
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

		int count = 0;// brojac rijeci

		String line;
		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				System.out.println(line);

				String[] parts = line.split(" "); // niz uzima space

				for (String w : parts) {// Poslije spacea uzima rijec, space
										// racuna kao rijec

					count++;
				}
			}
			System.out.println("U fajlu se nalazi " + count + " rijeci");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metoda pronalazi i ispisuje broj recenica u fajlu
	 * 
	 * @param fileName
	 *            imeFajla
	 */
	public static void countSentences(String fileName) {
		int count = 0;

		String line;
		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("U fajlu se nalazi " + count + " recenica");

		/**
		 * 
		 * Metoda pronalazi i ispisuje broj slova u fajlu
		 * 
		 * @param fileName
		 *            imeFajla
		 */
	}

	public static void countLetters(String fileName) {

	}

	/**
	 * Metoda pronalazi i ispisuje broj karaktera u fajlu
	 * 
	 * @param fileName
	 *            ime fajla
	 */
	public static void countChars(String fileName) {
		long counter = 0;
		String line;
		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				counter += line.length();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Broj karaktera u fajlu: " + counter);
	}

	/**
	 * Metoda pronalazi i ispisuje broj pojavljivanja svih slova u fajlu
	 * 
	 * @param fileName
	 *            ime fajla
	 */
	public static void countLettersOccurrences(String fileName) {
		// niz koji ce brojati slova (slovo A je na indeksu 0, B na indeksu
		// 1...)
		int[] lettersCount = new int[26];
		// slovo A je 65 u ASCII kodu
		int asciiOfLetterA = 65;
		String line;

		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					char ch = Character.toUpperCase(line.charAt(i));
					if (Character.isLetter(ch)) {
						// povecaj brojac na indeksu brojcane reprezentacije
						// trenutnog slova - slovo A
						lettersCount[(int) ch - asciiOfLetterA]++;
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ispis ponavljanja slova
		for (int i = 0; i < lettersCount.length; i++) {
			System.out.println("Slovo " + (char) (asciiOfLetterA + i) + " se ponavlja " + lettersCount[i] + " puta");
		}
	}

	/**
	 * Metoda pronalazi i ispisuje broj jedinstvenih rijeci u fajlu
	 * 
	 * @param fileName
	 *            imeFajla
	 */
	public static void countUniqueWords(String fileName) {
		Set<String> words = new HashSet<>();
		String line;

		try (BufferedReader read = Files.newBufferedReader(Paths.get(fileName))) {
			while ((line = read.readLine()) != null) {
				line = line.replaceAll("[^a-zA-Z]", " ");
				words.addAll(Arrays.asList(line.trim().split("\\s+")));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Broj jedinstvenih rijeci: " + words.size());
	}

}
