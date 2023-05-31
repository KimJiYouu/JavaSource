package quiz10;

public class User {

	private String name;
	private int rrn;
	private int age;
	
	User(){
		
	}
	User(String name, int rrn, int age){
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	public int getRrn() {
		return rrn;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
}
