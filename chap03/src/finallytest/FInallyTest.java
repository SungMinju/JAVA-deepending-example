package finallytest;

public class FInallyTest {
	public void test() {
		try {
			System.out.println("에외발생준비");
			throw new RuntimeException("에외발생");
			//System.out.println("실행안됨");
		}
		catch(Exception e) {
			return;
		}
		finally {
			System.out.println("finally 실행");
		}
		
	}

}
