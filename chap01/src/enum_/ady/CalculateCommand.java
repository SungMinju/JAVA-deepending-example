package enum_.ady;


public class CalculateCommand {
	private CaculateType CalculateType; //ADD, MINUS, MULTIPLY, DIVIDE 중 하나만 대입가능
	private int num1;
	private int num2;
	
	public CalculateCommand(CaculateType calculateType, int num1, int num2) {
		this.CalculateType = calculateType;
		this.num1=num1;
		this.num2=num2;
		
	}

	public CaculateType getCalculateType() {
		return CalculateType;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}



}
