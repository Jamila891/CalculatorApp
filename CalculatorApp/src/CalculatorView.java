

import Calculator.CalculatorController;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorView {
	
	private final CalculatorModel model;
	private final CalculatorController controller;
	private Stage stage;
	public TextField numbersSum;
	private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0, plus, cancel, equals;
	
	protected CalculatorView (Stage stage, CalculatorModel model, CalculatorController controller) {
		this.stage = stage;
		this.model = model;
		this.controller = controller;
		stage.setTitle("Calculator");
		
		GridPane grid = new GridPane();
		numbersSum = new TextField();
		num1 = new Button ("1");
		num2 = new Button ("2");
		num3 = new Button ("3");
		num4 = new Button ("4");
		num5 = new Button ("5");
		num6 = new Button ("6");
		num7 = new Button ("7");
		num8 = new Button ("8");
		num9 = new Button ("9");
		num0 = new Button ("0");
		plus = new Button ("+");
		cancel = new Button ("C");
		equals = new Button ("=");
		
		grid.add(numbersSum, 1, 1, 4, 1);
		grid.add(num7, 1, 2);
		grid.add(num8, 2, 2);
		grid.add(num9, 3, 2);
		grid.add(plus, 4, 2);
		grid.add(num4, 1, 3);
		grid.add(num5, 2, 3);
		grid.add(num6, 3, 3);
		grid.add(cancel, 4, 3);
		grid.add(num1, 1, 4);
		grid.add(num2, 2, 4);
		grid.add(num3, 3, 4);
		grid.add(equals, 4, 4, 1, 2);
		grid.add(num0, 1, 5, 3, 1);
		
		Scene scene = new Scene(grid);
		stage.setScene(scene);
		
		this.num1.setOnAction(controller::addButtonToTextField);
	}

	public void start() {
	stage.show();
	
	}
	
	public void stop() {
		stage.hide();
	}
	
	public Stage getStage() {
		return stage;
	}
}