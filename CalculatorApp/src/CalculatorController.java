
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
		
		if (b.equals(view.num1)) {
			view.numbersSum.setText("1");
		}
	}
}