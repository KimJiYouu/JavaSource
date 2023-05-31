package day08.super_;

public class Parent {

	String mother;
	String father;
	
//	Parent(){ // 자동생성 후 생략
//		super(); // 자동생성 후 생략
//	}
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;
	}
	
	String info() {
		return "name: "+mother+", name: "+father;
				
	}
}
