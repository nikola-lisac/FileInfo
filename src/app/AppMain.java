package app;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite path do fajla: ");
		// npr "Files/the dead past.txt"
		String fileName = input.nextLine();
		System.out.println("Detalji unesenog fajla: ");
		System.out.println("------------------------");
		input.close();
		
		InfoFinder info = new InfoFinder(fileName);
		info.countWords();
		info.countUniqueWords();
		info.countSentences();
		info.countLetters();
		info.countChars();
		info.countLettersOccurrences();

	}
}
