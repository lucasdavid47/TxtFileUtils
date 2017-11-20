package fr.lucasdavid.lettercount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		int words = 0;
		int letters = 0;
		int lines = 0;

		File file = new File("Path to txt file");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(file);

		while (in.hasNextLine()) {
			lines++;
			String line = in.nextLine();
			letters += line.length();
			words += new StringTokenizer(line, "  ,").countTokens();



		}
		
		System.out.println("Nombre de lignes: " + lines);
		System.out.println("Nombre de mots: " + words);
		System.out.println("Nombre de lettres: " + letters);
	}

}
