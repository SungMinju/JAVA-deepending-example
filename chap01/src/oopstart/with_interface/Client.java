package oopstart.with_interface;

public class Client {
	public void process() {
		MessageSender messageSender = new RealMessageSender();
		
		messageSender.send();
	}

}
