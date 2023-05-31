package quiz18;

public class StringQuiz03_2 {

	public static String palindrome3 (String word) {
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);

		return sb.reverse().toString().equals(word) ? "회문" : "회문이 아님"; // StringBuilder 타입에서 문자열 타입으로 바꾸기
	}
}
