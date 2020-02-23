package Calculator;

import javafx.event.Event;

public class CalculatorController {
	
	private final CalculatorModel model;
	private final CalculatorView view;
	
	protected CalculatorController(CalculatorModel model, CalculatorView view) {
		this.model = model;
		this.view = view;
	}
	
	public void addButtonToTextField(Event e) {
		numbersSum.setText(num1);
	}
	
	
}