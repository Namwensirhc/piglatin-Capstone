package igPayatinLay;

//1. String word = "apple";
//sysout (word += "way");
//2. "cat"
//-"c" "at"
//"atc"
// "atcay"
/*
 * 3. "through"
 * "thr" "ough"
 * "oughthr"
 * oughthray
 */
import java.util.Scanner;

public class IgPayatinLay {
	static Scanner sc = new Scanner(System.in);
	static String input;
	static StringBuffer sb = new StringBuffer();
	static char v;
	static String convertToPigLatin;
	static String again;
	final static String vowels = "aeiouAEIOU";

	public static void main(String[] args) {
		input();
	}

	public static void input() {
		System.out.println("Hello user, Please input a word: ");
		input = sc.next();
		System.out.println("Thank You User, you input " + input + ".");
		System.out.println("Now I will pigify it.");
		pigify();
	}

	public static void pigify() {
		String beforVowel = "";
		int cut = 0;
		while (cut < input.length() && !vowels.contains("" + input.charAt(cut))) {
			beforVowel += input.charAt(cut);
			cut++;
		}
		if (cut == 0) {
			cut = 1;
			input += input.charAt(0) + "w";
		}
		System.out.println(input.substring(cut) + beforVowel + "ay");
		System.out.println("Enter your word.");
		input = sc.nextLine();
		end();
	}

	public static void end() {
		System.out.println("Would you like to input another word? (yes/no)");
		again = sc.next();
		if (again.equalsIgnoreCase("yes")) {
			input();
		} else if (again.equalsIgnoreCase("no")) {
			System.out.println("Good Bye.");
		} else {
			System.out.println("input error..... resetting");
			end();
		}

	}
}
