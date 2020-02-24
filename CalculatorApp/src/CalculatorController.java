
import javafx.event.Event;
import javafx.scene.control.Button;

public class CalculatorController {
	
	private final CalculatorModel model;
	private final CalculatorView view;
	
	
	
	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void addButtonToTextField(Event e) {
		Button b = new Button();
		b = (Button) e.getSource();
		
		if (b == view.num1) {
			view.numbersSum.setText("1");
		}
	}
	
	public void clearAll (Event e) {
		
	}
	
	public int getResult(String input) {
		String[] numbersString;
		int[] numbersIntegers;
		int sum, num;
		
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