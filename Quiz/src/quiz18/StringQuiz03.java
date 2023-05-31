package quiz18;

public class StringQuiz03 {

// 회문비교 -> "다시 합창 합시다"
// 1. String palindrome(String) 함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드
// 2. 회문 : 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장
// 3. ex) 다시 합창 합니다, 다 같은 것은 같다, 아 좋다 좋아 등
// 4. 문장은 공백을 포함하여 받을 수 있음
// 5. 회문이라면 "회문입니다" 아니라면 "회문이 아닙니다"를 리턴

	public static void main(String[] args) {
		System.out.println(palindrome("다 같은 것은 같다"));
		System.out.println(palindrome("다시 합창 합시다"));
		System.out.println(palindrome("아 좋다 좋아"));
		System.out.println(palindrome("안녕하세요"));
	}

	public static String palindrome(String s) {
		String ss = s.replace(" ", "");
		int count = 0;
		for (int i = 0; i < ss.length() / 2 + 1; i++) {
			char k = ss.charAt(i);
			char j = ss.charAt(ss.length() - 1 - i);
			if (k == j) {
				count++;
			}
		}
		if (count == ss.length() / 2 + 1) {
			return "회문입니다";
		} else {

			return "회문이 아닙니다";
		}
	}
}
