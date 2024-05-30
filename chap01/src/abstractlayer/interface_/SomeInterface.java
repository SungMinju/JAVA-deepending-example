package abstractlayer.interface_;

public interface SomeInterface {
	
	void someMethod();
	
	default void defaultMethod() {
		//default 키워드를 메서드에 붙이면 인터페이스...?
		this.someMethod();
		
	}

}
