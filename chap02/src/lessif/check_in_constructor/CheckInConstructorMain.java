package lessif.check_in_constructor;

public class CheckInConstructorMain {

	public static void main(String[] args) {
		CalculateCommand calculateCommand = new CalculateCommand(null,2,3);
		Client client = new Client();
		int result = client.someMethod(calculateCommand);
		
		System.out.println("연산의 결과는  :"+result);

	}

}
