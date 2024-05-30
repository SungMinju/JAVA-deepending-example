package abstractlayer.abstract_class;

public abstract class AbstractClass {
	public void inplementedMethod() {
		System.out.println("AbstractClss 내부에서 직접 구형된 메서드");
		this.abstractMethod(); //추후 구현될 템플릿 메서드
	}
	
	abstract public void abstractMethod();

}
