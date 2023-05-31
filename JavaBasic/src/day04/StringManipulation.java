package day04;

import java.util.Arrays;

public class StringManipulation {
	public static void main(String[] args) {

		// 문자열 다루기
		// 문자열은 사실 배열이므로 인덱스가 있음

		String str = "안녕하세요~ 영어로하면 하이!";
//		System.out.println(str[0]); // 오류

		// 문자열을 다루는 다양한 메서드를 제공

		// 문자열 한글자 자르기 .charAt()
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));

		// 문자열 위치확인 .indexOf(char) 반환: int -> 가장 처음 발견된 위치를 알려줌
		// . lastIndexOf 뒤에서부터 찾은 위치
		int idx = str.indexOf("안");
		System.out.println("문자의 위치: " + idx);
		idx = str.indexOf("야");
		System.out.println("문자의 위치: " + idx); // -1 문자가 없을 시의 반환값

		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치: " + idx2);

		// 문자열 변환 toUpperCase(대문자로 바꾸기), toLowerCase(소문자로 바꾸기)
		// 원본문자열은 그대로 유지
		String s = "abcDEF";
		String result = s.toUpperCase();
		System.out.println("대문자로 변환: " + result);
		System.out.println("원본문자열은 그대로: " + s);
		result = s.toLowerCase();
		System.out.println("소문자로 변환: " + result);
		System.out.println("원본문자열은 그대로: " + s);

		System.out.println("===================");

		// 문자열 변경 replace
		s = "abcdefaaa";
		String result2 = s.replace("a", "x");
		System.out.println(result2); // a->x로 모두 변경
		System.out.println(s);

		result2 = s.replaceFirst("a", "x");
		System.out.println(result2); // a->x로 첫번째 a만 변경

		System.out.println("===================");

		// 공백제거 trim
		str = "    010-1111-2222    ";
		String result3 = str.trim(); // 앞뒤 공백을 제거해서 반환
		System.out.println(result3);
		System.out.println(str); // 원본 문자열은 변하지 않음

		str = " 안녕 하세요? 오늘은 4월 19일 입니다     ";
		System.out.println(str.trim()); // 중간에 있는 공백은 제거 불가능
		str = str.replace(" ", ""); // 공백을 공백없는 것으로 변환, 그리고 원본 문자열에 저장
		System.out.println(str);

		System.out.println("===================");

		// 문자열 자르기
		// substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result4 = str.substring(9); // 매개변수 1개 메서드: 인덱스번째 미만 절삭
		System.out.println(result4);
		result4 = str.substring(4, 8);// 매개변수 2개 메서드: 4이상 8미만 인덱스 추출
		System.out.println(result4);
		System.out.println(str); // str은 변함없음

		// split - 특정문자를 기준으로 자름(제대로 사용하려면 정규표현식을 알아야 함)
		// 배열로 반환받음
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));

		String[] arr2 = str.split(""); // 한글자 한글자 다 따로 자르고 싶을 때
		// String 배열
		System.out.println(Arrays.toString(arr2));

		// toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		// char 배열
		System.out.println(Arrays.toString(arr3));

		System.out.println("===================");

		// 문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println(len);
		
		// 문자열의 비교 equals()
		if(str.equals("안녕하세요")) {
			System.out.println("두 문자가 같음");
		}
		
		// 문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("녕이 포함되어 있습니다");
		}
	}
}
