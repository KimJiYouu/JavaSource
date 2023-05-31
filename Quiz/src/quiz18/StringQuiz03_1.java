package quiz18;

public class StringQuiz03_1 {

	public static String palindrome2(String word) {

		word = word.replace(" ", "");
		for (int i = 0; i < word.length() / 2; i++) {
			char a = word.charAt(i);
			char b = word.charAt(word.length() - i - 1);

			if (a != b) {
				return "회문이 아님";
			}
		}
		return "회문";
	}
}
