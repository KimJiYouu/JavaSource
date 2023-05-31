package day10.static_singleton;

public class NotSingleton {
	
	private NotSingleton() {
		
	}
	
	public static NotSingleton getSingleton() {
		return new NotSingleton();
	}
	
	private String domain = "www.abc.com";
	public String getDomain() {
		return domain;
	}

}
