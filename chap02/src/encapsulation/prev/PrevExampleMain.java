package encapsulation.prev;

public class PrevExampleMain {

	public static void main(String[] args) {
		CalculateCommand calculateCommand = new CalculateCommand( null, 100, 0);
		
		Client client = new Client();
		int result = client.process(calculateCommand);
		
		System.out.println(result);

	}

}
