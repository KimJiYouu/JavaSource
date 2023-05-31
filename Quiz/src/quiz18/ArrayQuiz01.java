package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {
	public static void main(String[] args) {

		// arr과 arr2는 길이가 1차이가 남
		// arr은 마라톤 참가자
		// arr2는 마라톤 완주자
		// 완주하지 못한 사람을 리턴하는 메서드 작성
		String[] arr = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] arr2 = { "josipa", "filipa", "marina", "nikola" };

		System.out.println(test(arr, arr2));

	}

	public static String test(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		for (int i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) { // .equals
				return participant[i];
			}
		}
		return participant[participant.length - 1];
	}
}
