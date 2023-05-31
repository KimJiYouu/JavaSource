package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은 getter/ setter를 사용한다
	 * 
	 * setter메서드 
	 * 1. 값을 저장하는 용도의 메서드 2. 접근제어자는 public으로 선언하고 
	 * 메서드 이름은 (set + 대문자멤버변수명)으로 지정
	 */

	public void setYear(int year) {

		if (year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력입니다");
			return;
		} else {
			this.year = year;
		}
	}

	/*
	 * getter 메서드 1. 은닉변수의 값을 조회하는 메서드 
	 * 2. 접근제한자는 public, 반환유형이 있고 
	 * 메서드 이름은 (get + 대문자멤버변수명)으로 지정
	 */

	public int getYear() {
		return year;
	}

	/*
	 * 1. month day ssn 에 대한 getter/ setter 생성 month - 1~12월 day - 1~31일 ssn - 하이픈은
	 * 제거하고 13까지만 저장가능 replace(),length()
	 */

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다");
			return;
		} else {
			this.month = month;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setDay(int day) {
		if (day < 1 || day > 31) {
			System.out.println("잘못된 값 입력입니다");
			return;
		} else {
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}

	public void setSsn(String ssn) {
//		if (ssn.length() - 1 != 13) {
//			System.out.println("잘못된 값 입력입니다");
//			return;
//		} else {
//			this.ssn = ssn.replace("-", "");
//		}
		ssn = ssn.replace("-", "");
		if (ssn.length() != 13) {
			System.out.println("주민번호는 13자리입니다");
		} else {
			this.ssn = ssn;
		}
	}

	public String getSsn() {
		return ssn;
	}
}
