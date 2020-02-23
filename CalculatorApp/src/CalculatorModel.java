
public class CalculatorModel {
	
	CalculatorView view;
	String[] numbersString;
	int[] numbersIntegers;
	int sum, num;
		
	public int getResult(String input) {
		numbersString = input.split("\\+");
		
		for (int i = 0; i < numbersString.length;i++) {
			num = Integer.parseInt(numbersString[i]);
			
			for (int j = 0; i<numbersIntegers.length;j++) {
				num = numbersIntegers[j];
			}
		}
		
		for (int x = 0; x<numbersIntegers.length; x++) {
			sum += numbersIntegers[x];
		}
		
		return sum;
	}
}